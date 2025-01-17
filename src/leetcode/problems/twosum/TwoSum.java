package leetcode.problems.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSumSolutionOne(int[] nums, int target) {
        System.out.println("Numeros disponiveis:" + Arrays.toString(nums));
        System.out.println("Alvo de soma: " + target);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                System.out.println("'i': " + i + " | Numero: "+ nums[i]);
                System.out.println("'j': " + j + " | Numero: "+ nums[j]);

                //  Nao podemos utilizar o mesmo numero do array duas vezes, entao
                // se for o mesmo numero, pula essa combinacao.
                if (i == j) {
                    System.out.println("'i' e 'j' sao iguais... pulando iteracao.");
                    continue;
                }

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        System.out.println("Nenhuma solucao encontrada para o problema...");
        return new int[]{-1, -1};
    }

    public static int[] twoSumSolutionTwo(int[] nums, int target) {
        System.out.println("Numeros disponiveis:" + Arrays.toString(nums));
        System.out.println("Alvo de soma: " + target);
        System.out.println();

        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            // Quanto falta do numero atual ate o alvo para fechar a soma
            var restante = target - nums[i];
            System.out.println("Indice atual: "+i+" | Valor atual: "+nums[i]);
            System.out.println("Indice numero restante: "+map.get(restante) + " | Restante: "+restante);
            // Se o que falta para o numero atual existe no mapa
            // E nao eh o mesmo indice (para nao usar duas vezes o mesmo numero)
            // Entao achamos a resposta
            if (map.containsKey(restante) && map.get(restante) != i) {
                return new int[]{i, map.get(restante)};
            }
        }

        System.out.println("Nenhuma solucao encontrada para o problema...");
        return new int[]{-1, -1};
    }

}
