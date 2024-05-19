public class Q8 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int n = arr.length;
        int ev_of_sum =0;



        for(int i =0;i<n;i++){
            if(arr[i]%2==0){
                ev_of_sum+=arr[i];
            }

        }
        System.out.println(ev_of_sum );
    }
}
