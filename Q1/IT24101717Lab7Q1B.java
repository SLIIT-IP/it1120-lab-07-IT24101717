import java.util.Scanner;

public class IT24101717Lab7Q1B{
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
       
         for(int student = 1; student<=3; student++){
             System.out.println("Enter marks for Student: " + student + " (four subjects separated by space): ");
             String input = scanner.nextLine();
             String[] marksArray = input.split(" ");


             if (marksArray.length != 4){
                 System.out.println(" Invalid number of inputs.Please enter 4 inputs ");
                 continue;
             }
          
            int mark1 = Integer.parseInt(marksArray[0]);
            int mark2 = Integer.parseInt(marksArray[1]);
            int mark3 = Integer.parseInt(marksArray[2]);
            int mark4 = Integer.parseInt(marksArray[3]);
        
            double average = (mark1 + mark2 + mark3 + mark4)/4.0;
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
 


}

