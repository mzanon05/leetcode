package leetcode.problems.palindrome;

public class PalindromeNumber {

    public static boolean isPalindromeSolutionOne(int x) {
        var strNumber = String.valueOf(x);
        // Verificar se a primeira metade eh igual a segunda metade inverida.
        // Se qtd digitos for par, entao so dividir no meio, inverter segunda metade, e
        // comparar igualdade. Ex: 1221
        var firstHalf = strNumber.substring(0, strNumber.length() / 2);
        String secondHalf = null;

        // Se qtd digitos for impar, ex: 12321, divide no meio (2.5), aplica 'floor'
        // (2), -1 eh o fim da primeira metade.
        // e inicio segunda metade e o 'ceil' da metade ate o final.
        if (strNumber.length() % 2 == 0) {
            secondHalf = strNumber.substring(strNumber.length() / 2);
        } else {

            secondHalf = strNumber.substring(strNumber.length() / 2 + 1);
        }

        for (int i = 0; i < firstHalf.length(); i++) {
            if (firstHalf.charAt(i) != secondHalf.charAt(firstHalf.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
