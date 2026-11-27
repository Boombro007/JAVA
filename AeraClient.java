import java.net.*;
import java.io.*;
public class AeraClient {
    public static void main(String []a)throws Exception{
        Socket s = new Socket("localhost",5000);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Radius : ");

        Double radius = Double.parseDouble(br.readLine());  

        dos.writeDouble(radius);

        Double area = dis.readDouble();

        System.out.println("Area : "+ area);

        dis.close();
        dos.close();
        s.close();
    }
}