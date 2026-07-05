class Solution {
    public int countPoints(String rings) {
        HashMap<Integer,Set<Character>> map = new HashMap<>();
        for(int i=0;i<10;i++)
            map.put(i,new HashSet<>());
        for(int i=0;i<rings.length();i+=2)
        {
            int add = rings.charAt(i+1)-'0';
            map.get(add).add(rings.charAt(i));
        }
        int res = 0;
        for(int num : map.keySet())
        {
            if(map.get(num).size() == 3)
                res++;
        }
        return res;
    }
}