import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public Server(){
        ServerSocket serverSocket;
        Socket socket;
        ServerThread thread;

        try
        {
            serverSocket = new ServerSocket(1337);

            while (true)
            {
                socket = serverSocket.accept();

                thread = new ServerThread(socket);
                thread.start();
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Server();
    }

}
