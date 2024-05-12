
// Automorphic ---> if a number can squre and find squre last two  digit equal original number 
// exp-- 25*25= 625 ,6 | 25
public class ChekNumAutomorphic {
    public static boolean isAutomorphic(int n){
        int sqrt=n*n;
        while(n>0){
            if(n%10 != sqrt%10){
                return false;
            }
            n=n/10;
            sqrt/=10;
        }
        return true;
    }
    public static void main(String[] args){
        int n=625;
        if(isAutomorphic(n)==true){
            System.out.println("yes , it Automorphic");
        }
        else{
            System.out.println(" it not Automorphic");

        }
    }
    
}
