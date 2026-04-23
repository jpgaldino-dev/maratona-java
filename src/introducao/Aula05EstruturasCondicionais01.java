package introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarbebida = idade >= 18;

        if (isAutorizadoComprarbebida) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Não autorizado");
        }


        System.out.println("Fora do if");
    }
}