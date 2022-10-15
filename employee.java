import java.util.Scanner;
class employee{
      void getdetails(){
           try{
             Scanner sc=new Scanner(System.in);
             int z,f,w;
             System.out.print("Employee salary:");
             int x=sc.nextInt();
             System.out.print("Employee Grade:");
             z=sc.nextInt();
             int a,b,c,d;
             a=x/20;
             b=x/10;
             c=a+x;
             d=b+x;
             
            if(z==1){
                System.out.println("Bonous:"+a);
                 System.out.println("Total salary:"+c);}
           else if(z==2){
                 System.out.println("Bonous:"+b);
                 System.out.println("Total salary:"+d);}
           else{System.out.print("Enter valid input");}
           if(x<10000){
                  f=x/50;
                  System.out.println("Extra 2% bonous for salary less then 10000 ");
                  System.out.println("Total salary to be paid:"+(f+c)); 
               
         }
            
            }
           catch(Exception e){
           System.out.print("Invalid input");}
}
}
class cal extends employee{
      void show(){
           
         
}
}
class mul_salary {
     public static void main(String[] args){
     
     cal d =new cal();
     d.getdetails();      
     

}


}
