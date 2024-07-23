package session_6;

import java.io.FileOutputStream;
import java.io.IOException;

public class B {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream("C:\\Users\\vaish\\Downloads\\eclipse-jee-2023-12-R-win32-x86_64\\JSPM Ankita\\session_6\\mno.txt");
			String str = "Welcome";
			byte[] b = str.getBytes();
			fos.write(b);
		}catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			System.out.println("In Finally");
			fos.close();
		}
		
	}

}
