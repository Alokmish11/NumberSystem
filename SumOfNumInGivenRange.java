public class SumOfNumInGivenRange {
    public static int sum(int min, int max){
        int sum=0;
        for(int i=min;i<=max;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args){
        int min,max;
        System.out.println(sum(1,20));

    }
    
}
