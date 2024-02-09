package material.arquivo.persistencia;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderCaractere {

    public static void main(String[] args) {
        String nomeArquivo = "C:\\Users\\Ryan\\IdeaProjects\\E2.0\\teste.txt";

        try (FileReader fileReader = new FileReader(nomeArquivo)) {
            // Lê o primeiro caractere para verificar se o arquivo está vazio
            int primeiroCaractere = fileReader.read();
            if (primeiroCaractere == -1) {
                System.out.print("O arquivo está vazio. ");
                return;
            }

            // Volta o ponteiro para o início do arquivo
            fileReader.close();
            FileReader novoFileReader = new FileReader(nomeArquivo);

            // Lê a linha inteira que contém o ID
            StringBuilder linhaComID = new StringBuilder();
            int caractere;

            while ((caractere = novoFileReader.read()) != -1) {
                char charAtual = (char) caractere;
                if (charAtual == '\n' || charAtual == '\r') {
                    // Se encontrar uma quebra de linha, para a leitura
                    break;
                }
                linhaComID.append(charAtual);
            }

            // Verifica se a linha não está vazia
            if (linhaComID.length() > 0) {
                // Extrai o ID da linha
                String id = extrairID(linhaComID.toString());

                // Imprime o ID encontrado
                System.out.print("ID encontrado: " + id + " ");
            } else {
                System.out.print("O arquivo está vazio ou não contém ID. ");
            }

            // Continua a leitura do restante do arquivo se necessário
            // ...

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para extrair o ID da linha
    private static String extrairID(String linha) {
        StringBuilder idBuilder = new StringBuilder();
        for (char caractere : linha.toCharArray()) {
            if (Character.isWhitespace(caractere)) {
                // Se encontrar um espaço em branco, para a extração
                break;
            }
            // Adiciona o caractere ao StringBuilder
            idBuilder.append(caractere);
        }
        return idBuilder.toString();
    }
}
