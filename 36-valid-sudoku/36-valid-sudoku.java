class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i=0; i<9; i++)
        {
            for (int j=0; j<9; j++)
            {
                
                int number = board[i][j];
                if (number != '.')
                {
                if (!set.add("row "+i+" "+number) || !set.add("col" +j+ " "+number) 
                    || !set.add("block" +i/3 + " " + j/3 + " "+number))
                    return false;
                }
            }
        }
        return true;
    }
}