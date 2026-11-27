import java.io.*;
import java.net.*;
public class SquareClient {
    public static void main(String []a)throws Exception{
        Socket s = new Socket("localhost",5001);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Number : ");

        double n = Double.parseDouble(br.readLine()); 
        dos.writeDouble(n);

        Double sr = dis.readDouble();

        System.out.println("Square : " + sr);

        dis.close();
        dos.close();
        s.close();
    }
}