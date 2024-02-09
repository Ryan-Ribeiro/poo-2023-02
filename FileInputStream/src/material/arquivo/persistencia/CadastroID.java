package material.arquivo.persistencia;//package material.arquivo;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class material.arquivo.persistencia.CadastroID {
//
//    public static void main(String[] args) {
//        String nomeArquivo = "C:\\Users\\Ryan\\IdeaProjects\\E2.0\\TaDisponivel\\TaDisponivel.txt";
//        String nomeArquivoDisponivel = "C:\\Users\\Ryan\\IdeaProjects\\E2.0\\TaDisponivel\\Disponivel\\TaDisponivel.txt";
//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));
//             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nomeArquivoDisponivel, true))) {
//
//            // Lê o ID digitado pelo usuário
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Digite o ID: ");
//            String idDigitado = scanner.nextLine();
//
//            // Lê o ID existente no arquivo
//            String idExistente = bufferedReader.readLine();
//
//            // Verifica se o ID não está vazio e é diferente do digitado
//            if (idExistente != null && !idExistente.isEmpty() && !idExistente.equals(idDigitado)) {
//                // Imprime o ID existente
//                System.out.print("ID digitado: " + idExistente + " ");
//
//                // Lê o restante do arquivo e concatena com o ID
//                StringBuilder conteudoLivro = new StringBuilder();
//                String linha;
//                while ((linha = bufferedReader.readLine()) != null) {
//                    conteudoLivro.append(linha).append("\n");
//                }
//
//                // Imprime o conteúdo do livro
//                System.out.print("\nConteúdo do Livro:\n" + conteudoLivro);
//
//                // Verifica se o ID digitado não existe no arquivo "TaDisponivel"
//                if (!verificarExistenciaID(nomeArquivoDisponivel, idDigitado)) {
//                    // Concatena o ID com o conteúdo do livro e cadastra no arquivo "TaDisponivel"
//                    String livroComID = idDigitado + "\n" + conteudoLivro.toString();
//                    bufferedWriter.write(livroComID);
//                    System.out.println("\nID cadastrado em 'TaDisponivel.txt'");
//                } else {
//                    System.out.println("\nID já existe em 'TaDisponivel.txt'");
//                }
//
//            } else {
//                System.out.print("O arquivo está vazio ou não contém ID. ");
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Método para verificar a existência de um ID em um arquivo
//    private static boolean verificarExistenciaID(String nomeArquivo, String id) throws IOException {
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo))) {
//            String linha;
//            while ((linha = bufferedReader.readLine()) != null) {
//                if (linha.equals(id)) {
//                    return true; // ID encontrado no arquivo
//                }
//            }
//        }
//        return false; // ID não encontrado no arquivo
//    }
//}
import java.io.*;
import java.util.Scanner;

public class CadastroID {

    private static final String DIRETORIO_RAIZ = "C:\\Users\\Ryan\\IdeaProjects\\E2.0\\TaDisponivel";
    private static final String DISPONIVEL_DIR = DIRETORIO_RAIZ + "\\Disponivel";
    private static final String EMPRESTADO_DIR = DIRETORIO_RAIZ + "\\Emprestado";
    private static final String TA_DISPONIVEL_TXT = DIRETORIO_RAIZ + "\\TaDisponivel.txt";

    public static void main(String[] args) {
        // Exemplo de utilização
        emprestar();
        devolver();
    }

    private static void emprestar() {
        try {
            Scanner scanner = new Scanner(System.in);

            // Lê o ID digitado pelo usuário
            System.out.print("Digite o ID para emprestar: ");
            String idDigitado = scanner.nextLine();

            // Verifica se o ID existe em TaDisponivel.txt
            if (!verificarExistenciaID(TA_DISPONIVEL_TXT, idDigitado)) {
                System.out.println("ID não encontrado em 'TaDisponivel.txt'");
                return;
            }

            // Obtém o conteúdo do livro da pasta Disponivel
            String conteudoLivro = obterConteudoLivro(DISPONIVEL_DIR, idDigitado);

            // Copia o conteúdo do livro para a pasta Emprestado
            String caminhoEmprestado = EMPRESTADO_DIR + "\\" + idDigitado + ".txt";
            salvarConteudoLivro(caminhoEmprestado, conteudoLivro);

            // Atualiza TaDisponivel.txt removendo o ID referente ao livro emprestado
            removerID(TA_DISPONIVEL_TXT, idDigitado);

            // Destroi o arquivo no diretório Disponivel
            destruirArquivo(DISPONIVEL_DIR, idDigitado);

            System.out.println("Livro emprestado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void devolver() {
        try {
            Scanner scanner = new Scanner(System.in);

            // Lê o ID digitado pelo usuário
            System.out.print("Digite o ID para devolver: ");
            String idDigitado = scanner.nextLine();

            // Verifica se o ID existe em TaDisponivel.txt
            if (!verificarExistenciaID(EMPRESTADO_DIR, idDigitado)) {
                System.out.println("ID não encontrado em 'Emprestado'");
                return;
            }

            // Obtém o conteúdo do livro da pasta Emprestado
            String conteudoLivro = obterConteudoLivro(EMPRESTADO_DIR, idDigitado);

            // Copia o conteúdo do livro para a pasta Disponivel
            String caminhoDisponivel = DISPONIVEL_DIR + "\\" + idDigitado + ".txt";
            salvarConteudoLivro(caminhoDisponivel, conteudoLivro);

            // Atualiza TaDisponivel.txt adicionando o ID referente ao livro devolvido
            adicionarID(TA_DISPONIVEL_TXT, idDigitado);

            // Destroi o arquivo no diretório Emprestado
            destruirArquivo(EMPRESTADO_DIR, idDigitado);

            System.out.println("Livro devolvido com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean verificarExistenciaID(String nomeArquivo, String id) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                if (linha.equals(id)) {
                    return true; // ID encontrado no arquivo
                }
            }
        }
        return false; // ID não encontrado no arquivo
    }

    private static String obterConteudoLivro(String diretorio, String id) throws IOException {
        String caminhoLivro = diretorio + "\\" + id + ".txt";
        StringBuilder conteudoLivro = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoLivro))) {
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                conteudoLivro.append(linha).append("\n");
            }
        }
        return conteudoLivro.toString();
    }

    private static void salvarConteudoLivro(String caminho, String conteudo) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminho))) {
            bufferedWriter.write(conteudo);
        }
    }

    private static void removerID(String nomeArquivo, String id) throws IOException {
        File arquivoOriginal = new File(nomeArquivo);
        File arquivoTemporario = new File(nomeArquivo + ".temp");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoOriginal));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoTemporario))) {

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                if (!linha.equals(id)) {
                    bufferedWriter.write(linha + "\n");
                }
            }
        }

        // Substitui o arquivo original pelo temporário
        arquivoOriginal.delete();
        arquivoTemporario.renameTo(arquivoOriginal);
    }

    private static void adicionarID(String nomeArquivo, String id) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            bufferedWriter.write(id + "\n");
        }
    }

    private static void destruirArquivo(String diretorio, String id) {
        File arquivo = new File(diretorio + "\\" + id + ".txt");
        if (arquivo.exists()) {
            arquivo.delete();
            System.out.println("Arquivo destruído em '" + diretorio + "'");
        } else {
            System.out.println("Arquivo não encontrado em '" + diretorio + "'");
        }
    }
}
