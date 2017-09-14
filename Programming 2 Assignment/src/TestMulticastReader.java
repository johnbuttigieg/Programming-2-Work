import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class TestMulticastReader {

    public static void main(String[] args) throws Exception {



        InetAddress address = InetAddress.getByName("228.5.6.7");
        MulticastSocket socket = new MulticastSocket(55555);

        socket.joinGroup(address);

        while(true) {
            byte[] messageBuffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(messageBuffer, 1024);

            //blocking statement - will wait until something is sent...
            socket.receive(receivePacket);

            String resultStr = new String(messageBuffer);

            if (resultStr.equals("END")) {
                break;
            }

            System.out.println(resultStr + "Received");

        }

        socket.close();
        socket.leaveGroup(address);

    }


}
