public class AvgOfArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        double sum=0;
        double avg;
        int n=5;
        for(int i=0;i<n;i++){
            sum+=(double)arr[i];
        }
        avg=sum/n;
        System.out.println("The avg is:" +avg);
    }
    
}
