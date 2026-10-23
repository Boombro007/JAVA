import java.io.File;
import java.io.IOException;
public class FileInput {
    public static void main(String []a){
        try{
            File f = new File("Student.txt");
            if(f.createNewFile()){
                System.out.println("File created !");
            }
            else{
                System.out.println("File doesnt exists !");
            }
        }
        catch(IOException e){
            System.out.println("An error occured !");
        }
    }
}