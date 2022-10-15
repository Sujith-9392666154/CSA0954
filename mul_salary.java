import java.util.Scanner;
interface s1{
     default void show(){
              try{
                  Scanner sc=new Scanner(System.in);
                  System.out.print("Enter Income: ");
                  int x=sc.nextInt();
                  int a;
                  if(x<150000){
                  System.out.print("No need to pay tax");}
                  else if(x>150000 && x<=300000){
                  a=x/10;
                  System.out.print("Tax amount:"+a);
                  }
                  else if(x>300000 && x<=500000){
                  a=x/5;
                  System.out.print("Tax amount:"+a);
                  }
                  else {
                  a=x*3/10;
                  System.out.print("Tax amount:"+a);
                  }
                 }
               catch(Exception e){
               System.out.print("Invalid input");}
}
}
interface PI1 extends s1 
{
}

interface PI2 extends s1 
{
}
class mul_tax implements PI1,PI2
    {
	public static void main(String args[])
	{
		mul_tax d = new mul_tax();
		d.show();
	}
}
