public class Q7 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int n = arr.length;
        int ev_in_sum =0;
        int odd_in_sum =0;


        for(int i =0;i<n;i++){
            if(i%2==0){
                ev_in_sum+=arr[i];
            }
            else{
                odd_in_sum+=arr[i];
            }
        }
        System.out.println(ev_in_sum +" " + odd_in_sum);
    }
}
