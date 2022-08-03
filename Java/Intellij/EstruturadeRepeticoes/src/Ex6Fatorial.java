import java.util.Scanner;

public class Ex6Fatorial {
    public static void main(String[] args) {
        //5!= 120 (5x4x3x2x1)
        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial+ "!= ");

        for (int i= fatorial; i >= 1;i--){
            multiplicacao = multiplicacao*i;
        }
        System.out.print(multiplicacao);
    }
}
