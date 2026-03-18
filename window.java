public class window {
    public static void main(String[] args)
    {
        int[]arr={5,2,-1,0,3};
        int k=3;
        int window_sum =0;
        for (int j = 0; j < k; j++) {
            window_sum = window_sum+arr[j];
        }
        int current_sum=window_sum;
        for(int i=1;i<arr.length-k;i++)
        {
            current_sum=current_sum-arr[i-1]+arr[i+2];
            if(current_sum>window_sum)
            {
                window_sum=current_sum;
            }

        }
        System.out.println(window_sum);
    }
}
