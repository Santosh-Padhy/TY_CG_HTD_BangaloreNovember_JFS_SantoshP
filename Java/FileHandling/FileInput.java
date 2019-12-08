import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInput {

	public static void main(String[] args) {
		try {
			FileOutputStream f1 = new FileOutputStream("Sree.txt");
			String s1 = "Sree is looking preety";
			byte b1[] = s1.getBytes();f1.write(b1);
			
			System.out.println("success.....");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
