public class GCD {
    public static int HCF(int a,int b){
        if(b==0){
            return a;
        }
        return HCF(b, a%b);
    }
    public static void main(String[] args){
        int a=3,b=6;
        System.out.println(HCF(a,b));
    }
}
