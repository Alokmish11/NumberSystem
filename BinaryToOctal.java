// Binary TO Octal= Binary>Decimal>Octal
public class BinaryToOctal {
    //public class BinaryToDecimal {
        static void BinaryToDecimal(int n){
            int decimal=0;
            int pow=0, octal=0;
            while(n>0){
                int lastDigit=n%10;
                decimal=decimal+(lastDigit*(int)Math.pow(2,pow));
                pow++;
                n=n/10;
            }
            int i=1;
            while(decimal!=0){
                 octal+=(decimal%8)*i;
                 decimal/=8;
                 i*=10;
            }
           // return octal;
            System.out.println(octal);
        
        }
        public static void main(String[] args){
            int n=101001;
            BinaryToDecimal(n);
           
}
}