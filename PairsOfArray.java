class PairsOfArray {
    public static int pairOfArray(int numbers[]) {
        for(int i=0;i<=numbers.length;i++) {
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++) {
                if(i!=j) {
                    System.out.print("( " + curr + "," + numbers[j] + " )");
                }
            }
            System.out.println();
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,6,7,9};
        pairOfArray(numbers);
    }
}
