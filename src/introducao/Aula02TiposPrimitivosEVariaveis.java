package introducao;

public class Aula02TiposPrimitivosEVariaveis {
    public static void main(String[] args) {
        int idade = 21;
        long numeroGrande = 2121121212;
        byte idade2 = 22;
        short idade3 = 23;
        double salario01 = 1.500;
        float salario02 = 1.600F;
        char umCaracter = 'M';
        boolean verdadeiroOuFalso = true;
        String nome = "Galdino";

        System.out.println("A minha idade é " + idade);
        System.out.println("Ele tem " + numeroGrande + " de distância");
        System.out.println("A idade dela é " + idade2);
        System.out.println("A idade dele é " + idade3);
        System.out.println("Meu salário é de " + salario01);
        System.out.println("O salário dela é " + salario02);
        System.out.println("Banheiro masculino se escreve com: " + umCaracter);
        System.out.println(verdadeiroOuFalso);
        System.out.println("Olá, meu nome é " + nome);
    }
}