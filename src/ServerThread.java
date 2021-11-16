import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {

    private Socket socket;

    public ServerThread(Socket socket)
    {
        this.socket = socket;
    }

    public void run()
    {
        BufferedReader reader;
        String string;

        try
        {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            OutputStream output = socket.getOutputStream();

            PrintWriter writer = new PrintWriter(output, true);
            writer.println("printMessage: ");

            while ((string = reader.readLine()) != null)
            {
                System.out.println(string);
                writer.println("ihre Nachricht ist am Server angekommen: " + string);
            }

        }
        catch (Exception ex)
        {

        }
    }

}
