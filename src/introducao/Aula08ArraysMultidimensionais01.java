package introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] n = new int[3][3];

        n[0][0] = 31;
        n[0][1] = 35;
        n[0][2] = 36;

        n[1][0] = 39;
        n[1][1] = 30;
        n[1][2] = 32;

        n[2][0] = 35;
        n[2][1] = 33;
        n[2][2] = 34;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.println(n[i][j]);
            }
        }
        System.out.println("----------------");

        for (int[] arrBase: n) {
            for (int num: arrBase) {
                System.out.println(num);
            }
        }
    }
}
