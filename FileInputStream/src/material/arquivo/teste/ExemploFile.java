package material.arquivo.teste;

import java.io.File;

/**
 * Classe utilizada para demonstrar o uso da classe File.
 */
public class ExemploFile {
    public static void main(String[] args) {
        ExemploFile ef = new ExemploFile();
        ef.verificarCaminho("C:\\Arquivos");
        ef.verificarCaminho("C:\\Arquivos\\teste.txt");
    }

    public void verificarCaminho(String caminho) {
        File f = new File(caminho);

        System.out.println(caminho);
        if(f.isFile()) {
            System.out.println("Este caminho eh de um arquivo.");
        } else if(f.isDirectory()) {
            System.out.println("Este caminho eh de um diretorio.");
        }
    }
}