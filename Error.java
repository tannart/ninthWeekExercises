import java.util.*;

public class Error{

public void go(int first, int second, int third) { 

		List<Integer> theList = new ArrayList<Integer>(2);
		theList.add(first);
		theList.add(second);

		try{
			theList.add(third);
		} catch (Exception ex){
			ex.printStackTrace();
		} catch (NullPointerException ex){
			ex.printStackTrace();
		}
	}
}