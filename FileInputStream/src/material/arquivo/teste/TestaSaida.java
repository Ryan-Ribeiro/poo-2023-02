package material.arquivo.teste;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestaSaida {
    public static void Main(String[] args) throws IOException {
        File diretorio = new File("C:\\Users\\Ryan\\IdeaProjects\\E2.0");
//        OutputStream os = new FileOutputStream(diretorio);
//        OutputStreamWriter osw = new OutputStreamWriter(os);
//        BufferedWriter bw = new BufferedWriter(osw);
//
//        bw.write("teste");
//
//        bw.close();
        File arquivo = new File( diretorio, "dadosFake.txt");
        FileOutputStream out = new FileOutputStream(diretorio);
        out.write(new byte[]{'l','i','x','o'});

        String[] arquivos = diretorio.list();

        for(int i = 0; i < arquivos.length; i++) {
            File filho = new File(diretorio, arquivos[i]);
            System.out.println(filho.getAbsolutePath());
        }

        if (arquivo.exists()) {
            arquivo.delete();
        }
        out.close();
    }
}
