package material.arquivo.persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraCaracterePorCaractereComID {

    public static void main(String[] args) {
        String nomeArquivo = "teste.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo))) {
            // Lê a linha inteira que contém o ID
            String linhaComID = bufferedReader.readLine();

            // Verifica se a linha não é nula e não está vazia
            if (linhaComID != null && !linhaComID.isEmpty()) {
                // Extrai o ID da linha
                String id = extrairID(linhaComID);

                // Imprime o ID encontrado
                System.out.println("ID encontrado: " + id);
            } else {
                System.out.println("O arquivo está vazio ou não contém ID.");
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
