import java.io.*;
public class FileWritten {
    public static void main(String[] args) throws IOException{
        FileWriter fwriter = new FileWriter("detail.txt");
        fwriter.write("My name is : Broker");
        fwriter.write("I am in 3rd Sem.");
        fwriter.close();
    }
}