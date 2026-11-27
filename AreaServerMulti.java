import java.io.*;
import java.net.*;

class ClientHandler extends Thread {
    Socket socket;
    public ClientHandler(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try{
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            double r = dis.readDouble();
            double area = 3.14 * r * r;
            
            dos.writeDouble(area);
            System.out.println("Client : " + socket.getPort() + " radius : " + r + "Area : " + area);

            dos.close();
            dis.close();
            socket.close();
        }
        catch(Exception w){
            System.out.println(w);
        }
    }
}

public class AreaServerMulti {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(5000);

        System.out.println("MultiThreaded server waiting ...");

        while(true){
            Socket s = ss.accept();
            System.out.println("New client connected ! ");

            ClientHandler ch = new ClientHandler(s);
            ch.start(); 
        }   
    }   
}