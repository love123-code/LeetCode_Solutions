class Solution {
    public int countAsterisks(String s) {
        String[] groups = s.split("\\|");
       
        if(groups.length==0){return 0;}
        int count=0;
        for(int i=0;i<groups.length;i++){
            
            if(i%2==0){
                
                for(char c : groups[i].toCharArray()){
                    if(c=='*'){
                        count++;
                    }
                }
            }
        }
        return count;

    }
}