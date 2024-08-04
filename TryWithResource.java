import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class TryWithResource {
    public static void main(String[] args) {
        List<String> filepath=List.of("file1.txt","file2.txt","file3.txt");

        FileProcessor fileProcessor=new FileProcessor();
        fileProcessor.processFiles(filepath);
    }

}
class FileProcessor{
    public void processFiles(List<String> filepath){
        int i = 0;
        int n = filepath.size();
        while (i < n) {
        try ( FileReader file = new FileReader(filepath.get(i));
              BufferedReader reader = new BufferedReader(file)){
            String line;
            while ((line =reader.readLine())!=null) {
                System.out.println(line);
            }

            }
        catch (IOException e){
            //System.err.println("Error red");
            System.out.println("Error reading file: "+filepath.get(i));
            System.out.println(e.getMessage());
        }
            i++;
        }


    }
}