import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class TestNetwork {
    public static void main(String[] args) throws Exception {
        {
            String message = "hello world";


            InetAddress address = InetAddress.getByName("228.5.6.7");
            MulticastSocket socket = new MulticastSocket(55555);

            socket.joinGroup(address);

            DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), address, 55555);


            socket.send(packet);

            byte[] messageBuffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(messageBuffer, 1024);


            socket.receive(receivePacket);


            String resultStr = new String(messageBuffer);
            System.out.println(resultStr + "Recieved");

        }
    }
}
