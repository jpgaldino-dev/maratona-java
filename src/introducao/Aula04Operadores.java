package introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;

        System.out.println(resultado);

        // %
        int resto = 21 % 2;

        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);

        // && (AND) || (OR) ! (NOT)

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario > 4612;
        boolean isIdadeMenor = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLei " + isDentroDaLei);
        System.out.println("isIdadeMenor " + isIdadeMenor);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlay = 5000F;
        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlay || valorTotalContaPoupanca > valorPlay;

        System.out.println("isPlaystation5Compravel " + isPlaystation5Compravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        int contador = 0;
        contador++;
        --contador;

        System.out.println(contador);
    }
}