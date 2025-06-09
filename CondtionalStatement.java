package JavaBasic;

public class CondtionalStatement {

	public static void main(String[] args) {
		 int English = 30, Maths = 10 , Science = 10 ;
		 int average = English + Maths + Science /3 ;
		 System.out.println("The Average Marks of 3 Subject is " + average);
		 if(average > 90 && average < 100 )
		 {
			 System.out.println("Excellent performance!");
		 }
		 if(average > 75 && average < 89 )
		 {
			 System.out.println("Excellent performance!");
		 }
		 if(average < 60 && average < 74)
		 {
			 System.out.println("Keep improving.");
		 }
		 if(average < 40 && average < 59)
		 {
			 System.out.println("Keep improving.");
		 }
		 if(average < 40)
		 {
			 System.out.println("Please work harder next time.");
		 }
		 if (Maths < 35 || Science < 35 || English < 35) 
		 {
			 System.out.println("Failed due to low score in at least one subject.");
		 }

	}

}
