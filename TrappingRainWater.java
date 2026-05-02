import java.util.*;
public class TrappingRainWater{
    public static int trappingRainwater(int height[]){
        int n = height.length;
        int leftmaxb[] = new int[n];
        leftmaxb[0] = height[0];
        for(int i = 1; i < n; i++){
            leftmaxb[i]=Math.max(leftmaxb[i-1],height[i]);
        }

        int rightmaxb[] = new int[n];
        rightmaxb[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightmaxb[i] = Math.max(rightmaxb[i+1],height[i]);
        }

        int trappedwater = 0;
        for(int i = 0;i<n;i++){
            int waterlevel = Math.min(leftmaxb[i],rightmaxb[i]);
            trappedwater += (waterlevel - height[i]);
        }
        return trappedwater;
    }


    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
       // int width = 1;
        System.out.println("Trapped Rain Water is : " + trappingRainwater(height) + "  liters");
    }
}