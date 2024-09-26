import java.util.Scanner;

public class IT24101717Lab7Q1A{
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
             
           int mark1, mark2, mark3, mark4;
           double average; 
        
           System.out.print("Enter marks for subject 1: ");
           mark1 = scanner.nextInt();

           System.out.print("Enter marks for subject 2: ");
           mark2 = scanner.nextInt();

           System.out.print("Enter marks for subject 3: ");
           mark3 = scanner.nextInt();

           System.out.print("Enter marks for subject 4: ");
           mark4 = scanner.nextInt();

           average = (mark1 + mark2 + mark3 + mark4)/4.0;

           System.out.println("Average marks: " + average);
           
           if (average >= 75 && average <=100){
              System.out.println("Grade: Distinction");
           }else if (average >= 50 && average <= 74){
              System.out.println("Grade: Credit");
           }else if (average >= 0 && average <= 49) {
              System.out.println("Grade: Fail");
           }else{
              System.out.println("Inavalid marks entered");
           }
   }
}
