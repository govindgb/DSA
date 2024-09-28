public class GB {
    public static void main(String[] args) {
        // initalize a array
        int[] arr = { 1, 2, 3, 4, 5 };

        // ecleare an array
        int[] a = new int[5];
        int[][] mat = new int[3][3];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = j;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }
        // for (int i = 0; i < arr.length; i++) {
        // em.out.println(arr[i]);
        // }

        // for (int i = 0; i < a.length; i++) {
        // = i + 6;
        // }s

        // for (int i = 0; i < a.length; i++) {
        // em.out.println(a[i]);
        // }

    }
}
