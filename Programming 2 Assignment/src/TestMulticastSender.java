import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class TestMulticastSender {
    public static void main(String[] args) throws Exception {

        String message = "Hello world again!";

        InetAddress address = InetAddress.getByName("228.5.6.7");
        MulticastSocket socket = new MulticastSocket(55555);

        socket.joinGroup(address);

        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), address, 55555);


        socket.send(packet);

        socket.leaveGroup(address);
        socket.close();



    }


}
