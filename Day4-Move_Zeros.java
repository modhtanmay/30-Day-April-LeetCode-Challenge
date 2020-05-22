class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int z=0,j=0;
        for(int i:nums){
            if(i!=0){
                al.add(i);
            }else{
                //System.out.print("sd");
                z++;
            }
        }
        for(int i=0;i<z;i++)
            al.add(0);
        
        for(int i:al)
            nums[j++] = i;
    }
}
