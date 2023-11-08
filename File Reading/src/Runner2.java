import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner2 {

	public static void main(String[] args)
	{
		File myFile = new File("Spotify");
		// use the scanner class
		double total= 0;
		
		try {
			Scanner myScanner = new Scanner(myFile);
			
			while(myScanner.hasNext()) {
				 // int pos = myScanner.nextInt();
				String girl = myScanner.next();
				String boy = myScanner.next();
				// What is the after age length of the girls names
				total += girl.length();
				System.out.println(myScanner.next());
			}
			total /= 100.0;
			System.out.println(total + " Is the average length");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		
		System.out.println("hellow World");
		
	}

}
