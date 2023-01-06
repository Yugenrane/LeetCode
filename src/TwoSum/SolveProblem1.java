package TwoSum;

public class SolveProblem1 {
    public int[] abhs(int[]arr, int target) {
        int[]temp=new int[2];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target) {
                    temp[0] = i;
                    temp[1] = j;
                    break;
                }
            }
        }
        return temp;
    }
}
