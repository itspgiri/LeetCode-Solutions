public class Solution {
    /*
     * Thought-way: 
     * As long as every byte in the array is of right type, it is a valid UTF-8 encoding.
     * 
     * Method: 
     * Start from index 0, determine each byte's type and check its validity.
     *
     * There are five kinds of valid byte type: 0**, 10**, 110**,1110** and 11110**
     * Give them type numbers, 0, 1, 2, 3, 4 which are the index of the first 0 from left. 
     * So, the index of the first 0 determines the byte type.
     *
     * if a byte belongs to one of them:
        1 : if it is type 0, continue
        2 : if it is type 2 or 3 or 4, check whether the following 1, 2, and 3 byte(s) are of type 1 or not
                if not, return false;
     * else if a byte is type 1 or not of valid type, return false
     *
     * Analysis :
     * The faster you can determine the type, the quicker you can get. 
     * Time O(n), space O(1)
     * real performance: 7ms
     */
     
    // Hard code "masks" array to find the index of the first appearance of 0 in the lower 8 bits of each integer.
    private int[] masks = {128, 64, 32, 16, 8};
    public boolean validUtf8(int[] data) {
        int len = data.length;
        for (int i = 0; i < len; i ++) {
            int curr = data[i];
            int type = getType(curr);
            if (type == 0) {
                continue;
            } else if (type > 1 && i + type <= len) {
                while (type-- > 1) {
                    if (getType(data[++i]) != 1) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }
    
    public int getType(int num) {
        for (int i = 0; i < 5; i ++) {
            if ((masks[i] & num) == 0) {
                return i;
            }
        }
        return -1;
    }
}