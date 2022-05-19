class Solution {

    public int[] twoSum(int[] array, int targetSum) {
        int a = -1, b = -1; //index of the two numbers
        for (int i = 0; i < array.length; i++) { //first index
            for (int j = i + 1; j < array.length; j++) { //second index
                int temp = array[i] + array[j]; //sum of first index and second index
                if (temp == targetSum) { //our sum = required sum?
                    a = i; //store value of our index 1
                    b = j; // store value of our index 2
                    //result[0]=array[i];
                    //result[1]=array[j];
                }
            }
        }
        if (a == -1 && b == -1) return new int[0]; else {
            int result[] = { a, b }; //create the array with our indexs ka value
            return result;
        }
    }
}
