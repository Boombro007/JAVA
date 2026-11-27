import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class UDPAreaC {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket();

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.print("Enter Radius: ");

        String radius = br.readLine();

        byte[] sendData = radius.getBytes();

        InetAddress ip =
            InetAddress.getByName("localhost");

        DatagramPacket sendPacket =
            new DatagramPacket(
                sendData, sendData.length, ip, 5000
            );

        ds.send(sendPacket);

        byte[] receiveData = new byte[1024];

        DatagramPacket receivePacket =
            new DatagramPacket(
                receiveData, receiveData.length
            );

        ds.receive(receivePacket);

        String area = new String(
            receivePacket.getData(),
            0,
            receivePacket.getLength()
        );

        System.out.println("Area of Circle: " + area);

        ds.close();
    }   
}