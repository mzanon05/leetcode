package leetcode.problems.romantointeger;

import java.util.Map;

public class RomanToInteger {

    //Numero Romano se le da esquerda para direita.
    //Se o numero a direita for igual ou menor, estamos somando.
    //Se o numero a direita for maior, estamos subtraindo.

    //III -> 3 (Soma 1 tres vezes)
    //IV  -> 4 (Subtrai 1 de 5)
    //VI  -> 6 (Soma 5 e 1)
    //XVI -> 16 (Soma 10, 5 e 1)
    //XL  -> 40 (Subtrai 10 de 50)
    //XLI -> 41 (Subtrai 10 de 50 e depois soma 1)
    //XLIV -> 44 (Subtrai 10 de 50 e depois subtrai 1 de 5)
    //XLVI -> 46 (Subtrai 10 de 50 e depois soma 5 e soma 1)
    //XLVII -> 47 (Subtrai 10 de 50 e depois soma 5 e soma 2)
    //XLVIII -> 48 (Subtrai 10 de 50 e depois soma 5 e soma 3)
    //XLIX -> 49 (Subtrai 10 de 50 e depois subtrai 1 de 10)

    //Tem que ir fazendo a conta em 'blocos'
    //Quando se acha uma subtracao, se fecha o bloco.
    //Quando se acha uma soma, continua somando no resultado atual
    public static int romanToIntegerSolutionOne(String s) {
        var romanValues = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        var result = 0;
        var currIndex = 0;
        while(currIndex < s.length()) {
            var currRoman = s.charAt(currIndex);
            var currRomanValue = romanValues.get(currRoman);
            System.out.println("curr index: "+currIndex);
            System.out.println("curr roman: "+currRoman+" | Valor: "+currRomanValue);

            //Se nao tem proximo elemento, entao so soma ele no resultado.
            if (currIndex + 1 == s.length()) {
                System.out.println("Ultimo elemento, somando ao resultado atual.");
                result+=currRomanValue;
                currIndex+=1;
                continue;
            }

            var nextRoman = s.charAt(currIndex+1);
            var nextRomanValue = romanValues.get(nextRoman);
            System.out.println("next roman: "+nextRoman+" | Valor: "+nextRomanValue);

            // Se o numero atual for menor que o proximo valor, entao eh subtracao.
            // Subtracao so pode ser com 2 digitos.
            if (currRomanValue < nextRomanValue) {
                result+=nextRomanValue-currRomanValue;
                currIndex+=2;
                continue;
            }

            // Se o numero atual for igual ou maior que o proximo, entao eh soma.
            result+=currRomanValue;
            currIndex+=1;
        }

        return result;
    }

    public static int romanToIntegerSolutionTwo(String s) {
        var romanValues = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        var result = 0;

        for (int i = 0; i < s.length(); i++) {
            var currRomanValue = romanValues.get(s.charAt(i));

            //Se eh ultimo elemento, entao retorna resultado atual mais ele.
            if (i + 1 == s.length()) {
                result+=currRomanValue;
                continue;
            }

            //Se tem proximo elemento, entao verifica se eh operacao de soma ou subtracao.
            var nextRomanValue = romanValues.get(s.charAt(i+1));

            // Se o numero atual for menor que o proximo valor, entao eh subtracao.
            if (currRomanValue < nextRomanValue) {
                result+=nextRomanValue-currRomanValue;
                i++;
                continue;
            }

            // Se o numero atual for igual ou maior que o proximo, entao eh soma.
            result+=currRomanValue;
        }

        return result;
    }
}
