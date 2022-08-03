// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;
import java.util.function.DoublePredicate;

public class descontoLoja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer desconto, precoAntigo;


// TODO: complete os espaços em branco com sua solução para o problema
        System.out.println("Informe o desconto: ");
        desconto = scan.nextInt();

        System.out.println("Informe o preço anterior: ");
        precoAntigo = scan.nextInt();

        Integer precoNovo = (precoAntigo - (precoAntigo * desconto / 100));
        System.out.println(precoNovo);
    }
}
