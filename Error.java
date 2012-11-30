import java.util.*;

public class Error{

public void mean(){ 
	int total = 0;
	int i = 0;

	do{
		System.out.println("Please enter a number");
		String str = System.console().readLine();
		int num = Integer.parseInt(str);
		total += num;
		i++;

	}while (i <= 10);

	int result = total/10;
	System.out.println("");

	System.out.println("Thank you, the mean of the numbers you entered was " + result);

	}
}