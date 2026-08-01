class GreatestAndSmallest {
    public static int greaterNumber(int numbers[]) {
        int greater = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (greater < numbers[i]) {
                greater = numbers[i];
            }
        }
        return greater;
    }
    public static int smallestNumber(int numbers[]) {
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++) {
            if(smallest>numbers[i]) {
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]={1,8,9,7,10,4};
        System.out.println("Greater number is: "+greaterNumber(numbers));
        System.out.println("Smallest number is: "+smallestNumber(numbers));
    }
}