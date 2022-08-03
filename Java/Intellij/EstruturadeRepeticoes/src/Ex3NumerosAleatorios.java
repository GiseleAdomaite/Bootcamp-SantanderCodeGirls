import java.util.Random;

public class Ex3NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[1] = numero;
        }
        System.out.print("Numeros Aletórios ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + "");

        }
        System.out.print("\nSucessor de Numeros Aletórios ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + "");

        }
    }
}
