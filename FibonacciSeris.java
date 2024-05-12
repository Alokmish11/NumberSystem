import java.util.*;
public class FibonacciSeris {
    public static void main(String[] args){
        int a,b=1,c=0;
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(c+ " ");
            a=b;
            b=c;
            c=a+b;
        }
       
    }
    
}
