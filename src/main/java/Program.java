import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero decimal para ser convertido em binario: ");
        int x = sc.nextInt();
        String binstr = Integer.toBinaryString(x);

        System.out.println("O numero " + x + " em binario é: " + binstr);
        System.out.println("test");
    }
}