import java.util.*;

public class MatrixBInarySearch {
    public static void main(String[] args) {
        int[][] mat = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 33, 34, 38, 50 } };

        int n = mat.length;
        int m = mat[0].length;
        int target = 35;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            // because we know that row is sortred so we can add this check to find in which
            // row our target is present
            if (target >= mat[i][0] && target <= mat[i][m - 1]) {
                int row = i;
                int col1 = 0, col2 = m - 1;
                while (col1 <= col2) {

                    int mid = (col1 + col2) / 2;

                    if (mat[row][mid] == target) {
                        ans[0] = row;
                        ans[1] = mid;
                        break;
                    } else if (mat[row][mid] < target) {
                        col1 = mid + 1;
                    } else {
                        col2 = mid - 1;
                    }
                }

            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
