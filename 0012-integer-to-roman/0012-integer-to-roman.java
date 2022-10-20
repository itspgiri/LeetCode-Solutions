class Solution {
  public String intToRoman(int num) {
        int [] values = new int [] {1000, 900, 500, 400, 100, 90, 50,  40,  10  ,9,  5,  4,   1};
        String [] strs =  new String []{"M", "CM","D","CD","C", "XC","L","XL","X","IX","V", "IV", "I" };
        
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            for (int i = 0; i < strs.length; i++) {
                if (values[i] <= num) {
                    sb.append(strs[i]);
                    num -= values[i];
                    break;
                }
            }
        }

        return sb.toString();

    }
}