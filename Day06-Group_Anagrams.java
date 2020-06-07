/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs)     {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
            for(String word:strs){        
                String key = anagramKey(word);
                if(!map.containsKey(key)){
                    map.put(key,new ArrayList<String>());
                }
                map.get(key).add(word);
            }
        List<List<String>> grp_anagram = new ArrayList<List<String>>();
        grp_anagram.addAll(map.values());
        
        return grp_anagram;
        
    }
    public String anagramKey(String word){
            word = word.toLowerCase();
            char[] to_char = word.toCharArray();
            Arrays.sort(to_char);
            return new String(to_char);
    }
}
