public class AddTwoFraction {
    public static int HCF(int a,int b){
        if(b==0){
            return a;
        }
        return HCF(b, a%b);
    }
    static void simple(int num3, int den3){
        int HCF=HCF(num3,den3);
        num3/=HCF;
        den3/=HCF;
    }
    public static void main(String[] args){
        int num1=3, den1=4, num2=1,den2=7,num3,den3;
        int lcm= (den1*den2)/HCF(den1,den2);
        den3=lcm;
        num3=num1*(den3/den1) + num2*(den3/den2);
        simple(den3,num3);
        System.out.println(num1 + "/" + den1 + "+" +num2+ "/" +den2 + "=" +num3+ "/"+ den3);
       }
}