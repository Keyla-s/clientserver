import java.net.*;
import java.io.*;
public class server 
{
  public static void main (String[] args) throws Exception
  {
    ServerSocket serversocket = new ServerSocket(8080);
    System.out.println("Server ready for chatting");
    Socket sock = serversocket.accept();
    System.out.println("Waalaikummuslam");
    
    BufferedReader keyRead = new BufferedReader
      (new InputStreamReader(System.in));
    OutputStream ostream = sock.getOutputStream();
    printerWriter pwrite = new PrinterWriter(ostream,true);
    
    InputStream istream = sock.getInputStream();
    BufferedReader receivedRead = new BufferedReader
      (new InputStreamReader(istream));
    
    String receiveMessage,sendMessage;
    while(true)
    {
      if((receiveMessage=receiveRead,readLine())!=null)
      {
        System.out.println(receiveMessage);
      }
      sendMessage = keyRead.readLine();
      pwrite.println(sendMessage);
      pwrite.flush();
    }
  }
}

    
    
   
  //private Socket         socket = null;
   //private ServerSocket   server = null;
   //private DataInputStream in = null;
    
   //public server(int port) throws IOException {
      //serverSocket = new ServerSocket(port);
      //serverSocket.setSoTimeout(10000);
   //}

   //public void run() {
      //while(true) {
         //try {
            //System.out.println("Waiting for client on port " + 
               //serverSocket.getLocalPort() + "...");
            //Socket server = serverSocket.accept();
            
            //System.out.println("I'm waiting for you.. " + server.getRemoteSocketAddress());
            //DataInputStream in = new DataInputStream(server.getInputStream());
            
            //System.out.println(in.readUTF());
            //DataOutputStream out = new DataOutputStream(server.getOutputStream());
            //out.writeUTF("Kamsahamnida for connecting to " + server.getLocalSocketAddress()
               //+ "\nJaljayo!");
           // server.close();;
            
         //} catch (SocketTimeoutException s) {
          //  System.out.println("Socket timed out!");
           // break;
        // }// catch (IOException e) {
           // e.printStackTrace();
           // break;
         //}
     // }
   //}
   
     // close connection 
            //socket.close(); 
            //in.close(); 
        //} 
        //catch(IOException i) 
        //{ 
         //   System.out.println(i); 
       // } 
   // } 
  
    //public static void main(String args[]) 
    //{ 
       // Server server = new server(8080); 
    //} 
//} 
  
