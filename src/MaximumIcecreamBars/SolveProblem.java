package MaximumIcecreamBars;

public class SolveProblem {
    public int iceBars(int[]arr,int coins){
        int ct=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum<coins){
                if(arr[i]<=coins-sum){
                    sum+=arr[i];
                    ct++;
                }
            }
        }
        return ct;
    }
}
