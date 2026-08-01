import java.util.Scanner;
public class GreatestNumber {
    public static int linearSearch(int numbers[]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++) {
            if(largest<numbers[i]) {
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]={92,80,50,83,67,49,95};
        System.out.println("largest number is: "+linearSearch(numbers));
    }
}