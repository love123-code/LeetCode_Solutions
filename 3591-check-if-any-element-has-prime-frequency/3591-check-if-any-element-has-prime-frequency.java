class Solution {
    public boolean checkPrimeFrequency(int[] nums) {


        if(nums.length ==1){
            return false;
        }

        HashMap<Integer,Integer>hm = new HashMap<>();


        for(int i=0 ; i<nums.length ; i++){

            if(hm.containsKey(nums[i])){
                hm.put(nums[i] , hm.get(nums[i])+1);
            }

            else{
                hm.put(nums[i],1);
            }
        }


         for(int x :hm.keySet()){

            if(hm.get(x) == 1){
                continue;
            }

            else if(isPrime(hm.get(x))){
                return true;
            }

        }


        return false;


        
    }

    public boolean isPrime(int x){

        for(int i=2 ; i<x ; i++){

            if(x%i ==0){
                return false;
            }
        }

        return true;
    }
}