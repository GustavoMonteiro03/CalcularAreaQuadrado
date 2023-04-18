import java.util.Scanner;
public class CalculoAreaQuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

                while(continuar){
        System.out.print("Digite o lado do quadrado: ");
        double lado = input.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é: " + area);

        System.out.println("Deseja calcular a área de outro quadrado? (S/N) ");
        String resposta = input.next();

                    if (resposta.equalsIgnoreCase("N")) {
                        continuar = false;
                    }
    }
    }
}
