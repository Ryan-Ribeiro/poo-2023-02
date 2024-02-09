import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ExemploSerializable {
    public static void main(String[] args) {
        // Serialização
        try (FileOutputStream fileOut = new FileOutputStream("minhaClasse.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            MinhaClasse obj = new MinhaClasse(42, "Hello, world!");
            out.writeObject(obj);
            System.out.println("Objeto serializado com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Desserialização
        try (FileInputStream fileIn = new FileInputStream("minhaClasse.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            MinhaClasse obj = (MinhaClasse) in.readObject();
            System.out.println("Objeto desserializado: " + obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
