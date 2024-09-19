import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//metodo base
public class Main {
    public static void main(String[] args) {

    //pra poder digitar algo (Scanner)
        Scanner sc = new Scanner(System.in);
        double um, dois, media, soma;

    //entrada dos dados (calculos)
        um = sc.nextDouble();

        dois = sc.nextDouble();

        soma = um+dois;

        //soma dividida pela quantidade

        media = soma/2;

        System.out.println("media=" + media);
    }
}

