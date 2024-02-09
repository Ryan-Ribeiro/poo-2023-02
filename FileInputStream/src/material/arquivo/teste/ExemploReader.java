package material.arquivo.teste;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;


/*
 * Classe utilizada para demonstrar a leitura de caracteres.
 */
public class ExemploReader {
    public static void main(String[] args) {
        ExemploReader exemplo = new ExemploReader();
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o caminho do arquivo: ");
        String caminho = s.nextLine();
        exemplo.lerArquivo(caminho);
    }

    public void lerArquivo(String caminho) {
        Reader r = null;
        try {
            r = new FileReader(caminho);
            int c;
            while((c = r.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(caminho + " nao existe.");
        } catch (IOException ex) {
            System.out.println("Erro de leitura de arquivo.");
        } finally {
            try {
                if(r != null) {
                    r.close();
                }
            } catch (IOException ex) {
                System.out.println("Erro ao fechar o arquivo " + caminho);
            }
        }
    }
}