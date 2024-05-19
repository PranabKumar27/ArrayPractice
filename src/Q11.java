public class Q11 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(isPrimeNumber(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }

    public static  boolean isPrimeNumber( int n){
        if(n<2){
            return false;
        }
        for(int i =2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
