import java.util.Scanner;

public class file{
	public static void main(String[] args){
		Scanner number = new Scanner(System.in);
			System.out.print("enter Number one: ");
			int number1 = number.nextInt();
			
			System.out.print("enter operator (+,-./,*): ");
			char symbol = number.next().charAt(0);
			
			System.out.print("enter Number two: ");
			int number2 = number.nextInt();
			
			switch(symbol){
			case '+':
			System.out.print("the sum  is: " + (number1 + number2));
			break;
			
			case '-':
			System.out.print("the subtract is: " + (number1 - number2));
			break;
			
			case '*':
			System.out.print("the product is : "+ (number1 * number2));
			break;
			
			case '/':
			if(number2!=0){
			System.out.print("the devide is: "+ (number1 / number2));
			}
			else{
			System.out.print("Erroe second no not have to 0");	
			}
			break;
			
			default:
			System.out.print("wrong operator");
			};
	}
}