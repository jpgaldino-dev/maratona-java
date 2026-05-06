package introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = new int[]{1, 2};
        int[] numeros3 = {1, 2, 3};
//          for (int i = 0; i < numeros2.length; i++) {
//            System.out.println(numeros2[i]);
//            System.out.println(numeros2[i]);
//         }

        for(int i: numeros3){
            System.out.println(i);
        }
    }
}
