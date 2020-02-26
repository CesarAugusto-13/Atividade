public class Calculadora {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);

        int num1 = 0;
        int num2 = 0;
        int soma = 0;
        int sub = 0;
        int multi = 0;
        int div = 0;

        System.out.print("Digite o primeiro numero: ");
        num1 = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = entrada.nextInt();

        soma = num1 = num2;
        sub = num1 - num2;
        multi = num1 * num2; 
        div = num1 / num2;

        System.out.print("A soma é %d\n", soma);
        System.out.print("A subtração é %d\n", sub);
        System.out.print("A multiplicação é %d\n", multi);
        System.out.print("A divisão é %d\n", div);
    }
}