package introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 2;

        switch (dia) {
            case 1, 7:
                System.out.println("Final de semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }
}