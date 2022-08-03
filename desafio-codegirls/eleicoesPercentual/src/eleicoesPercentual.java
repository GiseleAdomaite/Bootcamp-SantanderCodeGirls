// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;

public class eleicoesPercentual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int habitantes, brancos, nulos, validos;

// TODO: complete os espaços em branco com sua solução para o problema

        habitantes = input.nextInt();
       // brancos = input.nextInt();
        nulos = input.nextInt();
     //   validos = input.nextInt();


       // int pBrancos = (100 /(habitantes/brancos));
        int pNulos = ((100*nulos)/habitantes);
      //  int pValidos = (100/(habitantes/validos));


       // System.out.println("Brancos: " +pBrancos +"%");

        System.out.println("Nulos: " + pNulos+"%");

       // System.out.println("Validos: " + pValidos +"%");
    }
}