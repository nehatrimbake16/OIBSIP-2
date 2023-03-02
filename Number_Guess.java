//- Neha Trimbake -
// Number Guessing

import java.util.*;

public class Number_Guess{
	public static void Num_Guess()
	{
	 
	 Scanner sc = new Scanner(System.in);
	 int num = (int)(100*Math.random());        
	 int round = 6;
	 int guess , i , again , points =0;
	 
	 System.out.println("\nHellow!! Welcome to the number guessing game...");
	 System.out.println("\n\nInput the number between 1 to 100");
	 
	 for( i=0; i<6; i++){
		 System.out.println("\n Try to guess the number..");
	     guess =sc.nextInt();
		 
		 if(guess > 100 || guess < 0)
		 {
			 System.out.println("You have to enter the number only between the 1 to 100..!! ");
		 }
		 else if(guess == num)
		 {
			 System.out.println("Congrats!! You have guessed correct..");
			 points += 10 ;
			 System.out.println("Your score is" + points);
			 break;
		 }
		 else if (guess > num && i != round -1){
			 System.out.println("Oops! the number is less than" + guess);
		 }
		 else if(guess < num && i != round-1 ){
			 System.out.println("Oops! the number is greater than" + guess);
		 }
		 
	 }
	if (round == i) {

		System.out.println("\n You have completed round");
		System.out.println("\n The num is " + num);
		System.out.println("\n\n Do you want to continue...");
		System.out.println("Enter 1 for continue..");
		 again=sc.nextInt();
		 
		 if (again == 1){
			 Num_Guess();
		 }
		 else{
			 System.out.println("Thank you ..! see you again..");
		 }
	}
	sc.close();
	}
	public static void main(String args [ ]) {
		Num_Guess();
			 		 
	}
}