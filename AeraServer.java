import java.net.*;  
import java.io.*;
public class AeraServer{
    public static void main(String []a)throws Exception{
        ServerSocket ss = new ServerSocket(5000); // created server with port

        System.out.println("Server waiting ...");

        Socket s = ss.accept();

        System.out.println("Client Connected !");

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        double radius = dis.readDouble();
        double area = 3.14 * radius * radius;

        dos.writeDouble(area);

        System.out.println("Radius : " + radius);
        System.out.println("Area : " + area);

        dos.close();
        s.close();
        dis.close();
        ss.close();
    }
}