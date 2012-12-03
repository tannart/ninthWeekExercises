import java.io.*;
public class Mkdir{
	 
	public static void main(String args[]){

		try{

			String directory = System.console().readLine();

			new File(directory).mkdir();

		} catch(Exception e){
			System.out.println("Exception: " + e.getMessage());
		}

	}
}