class Solution {
    
    public boolean validMountainArray(int[] array) {
        int up = 0;
        int down = 0;

        if (array.length >= 3) {
            
            for (int i=0; i<array.length-1; i++) {
                if (array[i] == array[i+1]){
                    return false;
                }


                if (down == 0 && array[i+1] > array[i]) {
                    up = 1;
                } else if (array[i+1] < array[i]){
                    down = 1;
                } else {
                    return false;
                }
            }
            
            if (down == 1 && up ==1) {
                return true;
            }
        }
        return false;
    }
}
