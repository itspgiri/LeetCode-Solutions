class Solution {
    private int countNeighbour(int[][] board, int i, int j, int m, int n) {
    int result = 0;
    for (int x = Math.max(i-1, 0); x < Math.min(i+2, m); x++) {
        for (int y = Math.max(j-1, 0); y < Math.min(j+2, n); y++) {
            result += (board[x][y] & 1);
        }
    }
    return result - (board[i][j] & 1);
}
    public void gameOfLife(int[][] board) {
        int R = board.length;
        int C = board[0].length;
        for (int i=0; i<R; i++)
        {
            for (int j=0; j<C; j++)
            {
                int neighbour = countNeighbour(board, i, j, R, C);
                if (board[i][j] == 1) //If the current state is Alive
                {
                    if (neighbour == 2 || neighbour ==3) //Also fullfills our condition
                        board[i][j] =3; 
                }
                else if (neighbour == 3) 
				/*The other case will be when our Board[i][j] = 0. 
				So in this case we'll change the value to 3 only if follows,
				Atleast 3 Neighbours*/
                        board[i][j] =2;
            }
        }
		
		/*We don't change values in the case of 0>0 and 1>1 State Changes, and hence they aren't unconsidered above. Since their key notation matches their final state anyways.*/
        
		//We change all our values of 2 and 3 to their appropriate values 
        for (int i=0; i<R;i++)
        {
            for (int j =0; j<C; j++)
            {
                if (board[i][j] == 1)
                    board[i][j] =0; 
                 if (board[i][j]>=2)
                    board[i][j]=1;
            /*Because only those whose value is '3' and '2'will have new state value as '1' according to our above nested for loop conditions.*/
            }
        }
    }
}
