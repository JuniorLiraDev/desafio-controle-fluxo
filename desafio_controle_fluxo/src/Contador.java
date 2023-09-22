import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.printf("Digite o primeiro parâmetro: ");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametro2 = terminal.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

        terminal.close();
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        } else if (parametro1 < parametro2) {
            int quantidadeInteracoes = parametro2 - parametro1;
            for (int i = 0; i < quantidadeInteracoes; i++) {
                System.out.println("Imprimindo o nº " + (i + 1));
            }
        }

    }
}
