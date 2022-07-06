import java.util.Scanner;
import java.util.Arrays;

public class SplitStrings {
    public static String[] solution(String s) {
        int tamanhoArray = 0;
        if (s.length()/2 % 2 == 0) {
            tamanhoArray = s.length();
        } else {
            tamanhoArray = s.length() + 1;
        }


        String[] lista = s.split(("(?<=\\G..)"));
        if (s.length() % 2 != 0) {
            lista[lista.length-1] += "_";
        }

        return lista;
    }



    //MAIN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String listaDeCaracteres = scanner.nextLine();

        System.out.println(Arrays.toString(solution(listaDeCaracteres)));

    }


}
