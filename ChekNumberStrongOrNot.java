
// Strong number --->  145= 1!+ 4!+ 5!
// It is known as ( krishnmurthi number/ perterson number )

public class ChekNumberStrongOrNot {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
            return n*fact(n-1);
        }
        static int Strong_No(int num) {
            int sum = 0;
      
            //Extract all the digits from num
            while (num > 0) {
               int digit = num % 10;
               sum = sum + fact(digit);
               num = num / 10;
            }
            return sum;
         }
        public static void main(String[] args) {

            int n = 145;
            int answer = Strong_No(n);
      
            if (answer == n && n != 0) {
      
               System.out.println("YES");
            } 
            else {
               System.out.println("NO");
            }
         }
      }
       
    

