import java.util.Scanner;
public class Grade1 
{
 public static void main(String[] args) 
 {
  Scanner s = new Scanner(System.in);
  System.out.print("Enter the number of subjects: ");
  int numSubjects = s.nextInt();
  int totalMarks = 0;
  for (int i = 1; i <= numSubjects; i++) 
  {
   System.out.print("Enter marks for Subject " + i + ": ");
   int marks = s.nextInt();
   if (marks < 0 || marks > 100) 
   {
    System.out.println("Invalid marks! Marks should be between 0 and 100.");
    i--;
     }
   else 
   {
    totalMarks += marks;
     }
 }
 double averagePercentage = (double) totalMarks / numSubjects;
 System.out.println("\nResults:");
 System.out.println("Total Marks: " + totalMarks);
 System.out.println("Average Percentage: " + averagePercentage + "%");
 char grade = calculateGrade(averagePercentage);
 System.out.println("Grade: " + grade);
 s.close();
  }
 private static char calculateGrade(double averagePercentage) 
 {
  if (averagePercentage >= 90) 
  {
   return 'A';
   }
  else if(averagePercentage >= 80) 
  {
   return 'B';
   }
 else if (averagePercentage >= 70) 
 {
   return 'C';
   }
 else if (averagePercentage >= 60)
 {
   return 'D';
   }
 else 
 {
   return 'F';
    }
  }
}
