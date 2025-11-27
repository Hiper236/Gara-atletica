import java.io.*;

public class GestoreFile {
    private final String fileName="classifica.txt";

    public void scriviFile(String testo){
        try (BufferedWriter Bw= new BufferedWriter(new FileWriter(fileName))){
            Bw.write(testo);
            System.out.println("File modificato");
        } catch(IOException e){
            System.err.println(e. getMessage());
        }

    }

    public void leggiFile(){
        File file=new File(fileName);
        if(!file.exists()){
            System.out.println("file non esiste");
            return;
        }
        try(BufferedReader Br= new BufferedReader((new FileReader(fileName)))){
           String line;
           while ((line = Br.readLine()) != null) {
               System.out.println(line);
           }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}

