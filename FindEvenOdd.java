import java.util.*;
class FindEvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String c;// Close/continue program
        // Takeing input
        
        System.out.println("Enter number");
        int num=sc.nextInt();
        while(num==0){
            System.out.println("Enter another number.");
             num=sc.nextInt();
        }
        // Display number is even
            if(num%2==0){
            System.out.println(num+" is even number.");
        }
            // Display number is odd
         else{
            System.out.println(num+" is odd number.");

         }  
         while(true){
          System.out.println("If you want to exit enter quit, if you want to continue finding even, odd numbers enter continue  .");
            c=sc.next();//user choice 
            if(c.equalsIgnoreCase("quit")){
                System.out.println("Thank You");
                break;
            }if(c.equalsIgnoreCase("continue")){
                System.out.println("Enter a number");
                 int num2=sc.nextInt();
           while(num2==0){
            System.out.println("Enter another number.");
             num2=sc.nextInt();
        }
        // Display number is even
            if(num2%2==0){
            System.out.println(num2+" is even number.");
            
        }
            // Display number is odd
         else{
            System.out.println(num2+" is odd number.");

         }  
            }
         }
     sc.close();   
    }
}