import java.io.*;

public class CP{
	
	public static void main(String[] args){

		System.out.println("Please enter the name of a file: ");
		String str;
		String str2;
		String output = "";
		BufferedReader in = null;
		PrintWriter out = null;
		str = System.console().readLine();

		System.out.println("Please enter the name of another file: ");
		str2 = System.console().readLine();


		File file = new File("./" + str);
		File file2 = new File("./" + str2);

		if(file.exists()){

			try{

				in = new BufferedReader(new FileReader(file));
				String line;
				while((line = in.readLine()) != null){
					output += line;
				}

			} catch (FileNotFoundException ex) {
				System.out.println("File " + file + "Does not exist");

			} catch (IOException ex){
				ex.printStackTrace();

			} finally {
				try {

					if(in != null){

					in.close();
				}
			} catch (IOException ex){

				ex.printStackTrace();

				}
			}
		} else {
			System.out.println("That file does not exist!");
		}

		if(file2.exists()){
			String yn;
			System.out.println("The requested write file already exists, would you like to overwrite the specified write file?(Y/N): ");
			yn = System.console().readLine();

			if(yn == "y"){

			try{
					out = new PrintWriter(file2);
					out.write(output);
				} catch (FileNotFoundException ex){
					System.out.println("I'm afraid that " + file + " cannot be written to " + file + ".");
				} catch (IOException ex){
					ex.printStackTrace();
				} finally {
					out.close();
				}
			}
		} else {
			try{
				out = new PrintWriter(file2);
				out.write(output);
			} catch (FileNotFoundException ex){
				System.out.println("I'm afraid that " + file + " cannot be written to " + file + ".");
			} catch (IOException ex){
				ex.printStackTrace();
			} finally {
				out.close();
			}
		} 	
	}
}