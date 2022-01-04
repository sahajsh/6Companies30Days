
//Problem 1: Given an array of strings, return all groups of strings that are anagrams.

class Solution {
    public List<List<String>> Anagrams(String[] strs) {
        // Code here
        List<List<String>> al=new ArrayList<>();
        HashMap<String, ArrayList<String>> hm=new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String str= String.valueOf(ch);
            
            if(hm.containsKey(str)){
                ArrayList<String> temp = hm.get(str);
                temp.add(strs[i]);
                hm.put(str,temp);
                
            }else{
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                hm.put(str,temp);
            }
        }
        
        for(ArrayList<String> t:hm.values()){
            al.add(t);
        }
        
        
        return al;
    }
}
