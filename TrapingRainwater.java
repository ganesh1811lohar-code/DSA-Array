public class TrapingRainwater {
    public static int trappedRainWater(int heigth[]) {
        int n=heigth.length;
        //claculate left max boundary -array
        int leftMax[]=new int[heigth.length];
        leftMax[0]=heigth[0];
        for(int i=1;i<heigth.length;i++) {
            leftMax[i]=Math.max(heigth[i],leftMax[i-1]);
        }
        //claculate right max boundary array
        int rigthMax[]=new int[n];
        rigthMax[n-1]=heigth[n-1];
        for(int i=n-2;i>=0;i--) {
            rigthMax[i]=Math.max(heigth[i],rigthMax[i+1]);
        }
        int trappedWater=0;
        //loop
        for(int i=0;i<n;i++) {
            //waterlLevel=min(leftMax boundary,rigthMax boundary)
            int waterLevel=Math.min(leftMax[i],rigthMax[i]);
            //trapped water=waterLevel-heigth[i]
            trappedWater+=waterLevel-heigth[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int heigth[]={4,2,0,6,3,2,5};
        System.out.println("The total trapped water is: "+trappedRainWater(heigth));
    }
}
