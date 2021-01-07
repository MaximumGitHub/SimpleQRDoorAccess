import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.*;

/**
 *A server where multiple clients can connect. Acts as a shared database.
 */
public class Server extends Thread
{
    private ServerSocket ss;
    private String[][] db;

    //connect to the server
    private Server() {
        try {
            ss = new ServerSocket(59090);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void populateDB()
    {
        try {
            File f = new File("db.text");
            Scanner sc = new Scanner(f);
        } catch(IOException e)
        {
            System.out.println("File not found");
        }

    }

}