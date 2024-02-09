package material.arquivo.teste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExemploFileInputStream {
    public static void main(String[] args) {
        ExemploFileInputStream exemplo = new ExemploFileInputStream();
        exemplo.lerArquivo("C:\\Users\\Ryan\\IdeaProjects\\E2.0\\teste.txt");
    }

    public void lerArquivo(String caminho) {
        FileInputStream fis = null;

        try {
            File f = new File(caminho);
            fis = new FileInputStream(f);
            int c;
            while((c = fis.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao abrir o arquivo.");
        } catch (IOException ex) {
            System.out.println("Erro ao ler o arquivo.");
        } finally {
            try {
                if(fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                System.out.println("Erro ao fechar o arquivo.");
            }
        }
    }
}