package wh.one;
import java.util.Scanner;
public class FizzBuzzTest {	
	    public int getInput() {
	    	//get input from Keyboard
	    	Scanner sc=new Scanner(System.in);
	    	int input=sc.nextInt();
	    	return input;
	    }
        public void replaceFizzBuzz(int input) {
        	if(input%15 == 0) {
        		System.out.println("FizzBuzz");
        	}else
        		if(input%5 ==0) {
        			System.out.println("Buzz");
        		}else
        			if(input%3 ==0) {
        				System.out.println("Fizz");
        			}else
        			System.out.println(input);
        }
}
