import java.net.*;
public class UDPArea {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(5000);
        byte [] reciveData = new byte[1024];

        System.out.println("Server waiting .....");           
        
        while(true){
            DatagramPacket receivPacket = new DatagramPacket(reciveData, reciveData.length);

            ds.receive(receivPacket);

            String str = new String(receivPacket.getData(),0,receivPacket.getLength());

            double r = Double.parseDouble(str);

            double area = 3.14 * r * r;

            System.out.println("Radius : " + r);
            System.out.println("Area : " + area);

            byte [] sendData = String.valueOf(area).getBytes();

            InetAddress clientIP = receivPacket.getAddress(); 
            int clientPort = receivPacket.getPort();

            DatagramPacket sendPacket = new DatagramPacket(sendData,sendData.length,clientIP,clientPort);

            ds.send(sendPacket);
        }
    }
}