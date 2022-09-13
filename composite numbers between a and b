import java.util.Scanner;
public class composite
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the first number");
  int start=sc.nextInt();
  System.out.print("Enter the last number");
  int end=sc.nextInt();
  int count = 0;
  int i = 1;

  System.out.format("Composite Numbers between %d and %d:\n", start, end);
  for(start=start; start<=end; start++)
  {
   for(i=1; i<=start; i++)
   {
    if(start % i == 0)
     count++;
   }
   if(count > 2)
    System.out.format("%d ", start);
   count = 0;
  }
 }
}
