class Solution {
    public int findKthPositive(int[] arr, int k) {

        int i = 0;       
        int num = 1;        
        int missing = 0;    

        while (missing < k) {

         
            if (i < arr.length && num == arr[i]) {
                i++;
            } 
         
            else {
                missing++;

              
                if (missing == k) {
                    return num;
                }
            }

            num++;
        }

        return -1;  
    }
}