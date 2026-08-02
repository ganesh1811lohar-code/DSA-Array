class ReverseArray {
    public static int reverse(int numbers[]) {
        int first=0;
        int last=numbers.length-1;
        while(first<last) {
            //swap
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,6,7,9};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
