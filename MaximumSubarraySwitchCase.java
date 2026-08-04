import java.util.Scanner;
class MaximumSubarraySwitchCase {
    public static int maxSumArray(int numbers[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++) {
            int start=i;
            for(int j=i;j<numbers.length;j++) {
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++) {
                    currSum+=numbers[k];
                }
                System.out.print(currSum+" ");
                if(maxSum<currSum) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println();
        System.out.println("Max sum of subarray  is: "+maxSum);
        System.out.println();
        return -1;
    }
    public static int maxSubPrefixArray(int numbers[]) {
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
                System.out.print(currSum+" ");
                if(maxSum<currSum) {
                    maxSum=currSum;
                }
            }

        }
        System.out.println();
        System.out.println("Maximum sum of subarray is: "+maxSum);
        System.out.println();
     return -1;
    }
    public static void kadanes(int numbers[]) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++) {
            cs=cs+numbers[i];
            if(cs<0) {
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Maximum sum of subarray is: "+ms);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Maximum subarray.");
        System.out.println("2.Maximum subarray using Prifix Array.");
        System.out.println("3.Maximum subarray using kadans algorithms");
        System.out.print("Enter your choice:");
        int ch=sc.nextInt();
        switch(ch) {
            case 1:
                maxSumArray(numbers);
                break;
            case 2:
                maxSubPrefixArray(numbers);
                break;
            case 3:
                kadanes(numbers);
                break;
            default:
                System.out.println("invalid choice.");
        }
    }
}
