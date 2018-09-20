package wh.one;
import java.util.Scanner;
public class hello {
    public static void main(String[] args ) {
    	//getInputForm Keyboard
    	Scanner sc =new Scanner(System.in);
    	System.out.println("please input an integer:\n");
    	int input=sc.nextInt();
    	//summery all integers
    	int sum=0;
    	if(input%2 !=0) {/*boolean值，只有真假*/
    		for(int i=1;i<input;i+=2)
    		{
    			sum+=i;
    			System.out.print(i+"+");
    		}
    		sum=sum+input;
    	}else {
    		for(int i=2;i<=input;i+=2)
    			{sum+=i;
    		System.out.print(i+"+");}
    		sum=sum+input;
    	}
    /*	int sum=0;
    	for(int j=1;j<=input;j=j+2) {
    		 sum+=j;
    	}*/
    	System.out.print(input);
        System.out.print("="+sum);
    	sc.close();
    }
    
}
