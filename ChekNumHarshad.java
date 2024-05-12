//Harshad Number(Niven) -->> A number  and his sum divide by Given number and result is 0
// 378--> 3+7+8=18>> 378/18=0
public class ChekNumHarshad {
    public static void main(String[] args){
        int n=371;
        int sum=0,rem=0;
        while(n>0){
            rem=n%10;
            sum =sum+rem;
             n=n/10;
        }
            if(n%sum==0)
                System.out.println(" It is a Harshad Number");
            
            else
                System.out.println(" Not Harshad Number");
    }
}