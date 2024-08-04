import java.io.*;

public class TryWithMultipleResources {


        public static void main(String[] args)
        {
            try (FileOutputStream fos
                         = new FileOutputStream("src/outputfile.txt");

                 BufferedReader br = new BufferedReader(
                         new FileReader("src/samplefile.txt"))) {

                String text;

                while ((text = br.readLine()) != null) {

                    byte arr[] = text.getBytes();

                    fos.write(arr);
                }
              // BufferedReader bufferedReader=new BufferedReader();
                System.out.println("File content copied to another one.");
            }
            catch (Exception e) {

                System.out.println(e);
            }

            System.out.println(
                    "Resource are closed and message has been written ");
        }
    }


