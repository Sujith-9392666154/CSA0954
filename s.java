import java.util.Scanner;
class employee{
      void getdetails(){
           try{
             Scanner sc=new Scanner(System.in);
             int p,q,r;
             System.out.print("Employee salary:");
             p=sc.nextInt();
             System.out.print("Employee Grade:");
             q=sc.nextInt();
             int a,b,c,d;
             a=p/20;
             b=p/10;
             c=a+p;
             d=b+p;
             
            if(q==1){
                System.out.println("Bonous:"+a);
                 System.out.println("Total salary:"+c);}
           else if(q==2){
                 System.out.println("Bonous:"+b);
                 System.out.println("Total salary:"+d);}
           else{System.out.print("Enter valid input");}
           if(p<10000){
                  r=p/50;
                  System.out.println("Extra 2% bonous for salary less then 10000 ");
                  System.out.println("Total salary to be paid:"+(r+c));
               
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
