package material.arquivo.teste;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("c:\\novo"); /* Cria objetos com */
        diretorio.mkdir(); /* referência a arquivos */
        File subdir1 = new File(diretorio, "subdir1"); /* ou diretórios e cria */
        subdir1.mkdir(); /* diretórios ou subdiretorios */
        File subdir2 = new File(diretorio, "subdir2"); /* com os nomes */
        subdir2.mkdir(); /* definidos */
        /* Cria objeto com referência ao arquivo “arquivoVazio.txt” */
        File arquivo = new File(diretorio, "arquivoVazio.txt");
        /* Abre o arquivo para gravação */
        FileWriter f = new FileWriter(arquivo);
        f.close(); /* fecha o arquivo */
        /* Recupera a lista de arquivos do diretorio */
        String[] arquivos = diretorio.list();
        /* mostra o caminho absoluto de cada arquivo da lista */
        for (int i = 0; i < arquivos.length; i++) {
            File filho = new File(diretorio, arquivos[i]);
            System.out.println(filho.getAbsolutePath());
        }
    }
}