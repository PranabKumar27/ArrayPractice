public class Q12 {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e','f','g'};
        int n = arr.length;
        for( int i=0;i<n;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' ||arr[i]=='o' || arr[i]=='u' ){
                System.out.println(arr[i]);
            }
        }
    }
}
