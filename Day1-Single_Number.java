class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            if(!hm.containsKey(i))
                hm.put(i,1);
            else
                hm.put(i,hm.get(i)+1);
        }
        int res = 0;
        for(Map.Entry<Integer,Integer>entry:hm.entrySet())
            if(entry.getValue()==1)
                res=entry.getKey();
        
        return res;
    }
}
