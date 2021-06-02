public class TwoSum {
    public static void main(String[] args) {
        int[] a = new int[]{2,7,11,15};
       int[] result= twoSum(a,9);
       System.out.println(result[0] +" ,"+ result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        int i,j,size;
        int[] result=new int[2];
        size=nums.length;
        for(i=0;i<size;i++) {
            for(j=i+1;j<size;j++) {
                if(nums[i] + nums[j] == target) {
                   result[0]=i;
                   result[1]=j;
                }
            }
        }
        return result;
    }
}
