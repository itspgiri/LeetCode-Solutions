class Solution {

    String[] queens;

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> validRows = new LinkedList<>();
        initQueenParser(n);
        backtrack(new int[n], 0, n, new boolean[n], new boolean[2 * n], new boolean[2 * n], validRows);
        return validRows;
    }

    private void backtrack(int[] rows, int rowIndex, int n, boolean[] usedColumns, boolean[] usedDiagonals, boolean[] usedDiagonals2, List<List<String>> validRows) {

        if (rowIndex == n) {
            validRows.add(parseRows(rows, n));
            return;
        }

        for (int column = 0; column < n; column++) {

            if (usedColumns[column]) {
                continue;
            }

            int diagonal = rowIndex - column + n;
            int diagonal2 = rowIndex + column;

            if (usedDiagonals[diagonal] || usedDiagonals2[diagonal2]) {
                continue;
            }

            usedColumns[column] = true;
            usedDiagonals[diagonal] = true;
            usedDiagonals2[diagonal2] = true;
            rows[rowIndex] = column;

            backtrack(rows, rowIndex + 1, n, usedColumns, usedDiagonals, usedDiagonals2, validRows);

            usedColumns[column] = false;
            usedDiagonals[diagonal] = false;
            usedDiagonals2[diagonal2] = false;
            rows[rowIndex] = 0;
        }
    }

    private void initQueenParser(int n){
        char[] dotArray = new char[n];
        Arrays.fill(dotArray, '.');
        queens = new String[n];

        for (int i = 0; i < n; i++) {
            dotArray[i] = 'Q';
            queens[i] = new String(dotArray);
            dotArray[i] = '.';
        }
    }

    private List<String> parseRows(int[] rows, int n) {
        List<String> result = new ArrayList<>(n);
        for (int i : rows) {
            result.add(queens[i]);
        }
        return result;
    }
}