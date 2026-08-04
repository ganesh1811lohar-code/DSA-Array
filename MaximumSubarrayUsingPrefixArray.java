public class MaximumSubarrayUsingPrefixArray {
    public static int maxSubArray(int numbers[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        //Calculate prefix Array
        for(int i=1;i<prefix.length;i++) {
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++) {
            int start=i;
            for(int j=i;j<numbers.length;j++) {
                int end=j;
                currSum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                System.out.print(currSum+" ");                                      				if(maxSum<currSum) {
                    maxSum=currSum; 
                }
            }

        }
        System.out.println();
        System.out.println("Maximum sum is: "+maxSum);
     return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSubArray(numbers);
    }
}
