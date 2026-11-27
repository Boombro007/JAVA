import java.io.*;
import java.net.*;
public class SquareServer {
    public static void main(String []a)throws Exception{
        ServerSocket ss = new ServerSocket(5001);
        System.out.println("Server Waiting....");

        Socket s = ss.accept();
        System.out.println("Client Connected !");

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        double n = dis.readDouble();
        double sr = n * n;

        dos.writeDouble(sr);

        System.out.println("Number : " + n);
        System.out.println("Square : " + sr);

        dos.close();
        s.close();
        dis.close();
        ss.close();
    }
}   