import java.io.*;
import java.net.*;
class Server{
	public static void main(String[] ar)throws IOException{
		ServerSocket ss = new ServerSocket(1200);
		Socket s = ss.accept();
		System.out.println("Connection estabblished");
		OutputStream os = s.getOutputStream();
		PrintStream ps =new PrintStream(os);
                ps.println("HEllo client");
		ps.println("Welcome");
		ps.close();
		s.close();
		ss.close();
	}
}
