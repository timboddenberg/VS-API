import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public Client()
    {
        PrintWriter writer;
        Socket socket;

        try
        {
            socket = new Socket("localhost",1337);
            writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.println("bla");
            writer.flush();
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Client();
    }
}
