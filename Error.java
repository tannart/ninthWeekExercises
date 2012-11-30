import java.util.*;

public class Error{

public void mean(){ 
	int total = 0;;
	int i = 0;

	System.out.print("How many numbers would you like to enter? ");

	int toBeEntered = getNumber();

	do{
		System.out.println("Please enter a number");
		total += getNumber();
		i++;

	}while (i < toBeEntered);

	int result = total/toBeEntered;

	System.out.println("");

	System.out.println("Thank you, the mean of the numbers you entered was " + result);

	}

	public int getNumber(){
		String str = "";
		int num = 0;

		try{
		str = System.console().readLine();
		num = Integer.parseInt(str);

		} catch(NumberFormatException ex) {
		 	System.out.println("That wasn't a number you wazzock!!");

		}
		return num;
	}
}