package Questao01;

import java.util.Arrays;

/**
 *
 * @author Rafael
 */
public class Questao01 {

    public static void main(String args[]) {
        int[] arr = {9, 2, 1, 4, 6};
        //int[] arr = {15,20,10,5,2};Teste
        //int[] arr = {7,2,9,3,10}; Teste

        System.out.println(mediana(arr));
    }

    public static int mediana(int[] arr) {
        int mediana;

        // O método sort() ordena os elementos do proprio arrray ex (1,2,4,6,9)
        Arrays.sort(arr);
        
        //exemplo de como o array ficou apos o sort().
        //System.out.println(arr[0]);  = 1
        //System.out.println(arr[1]);  = 2
        //System.out.println(arr[2]);  = 4
        //System.out.println(arr[3]);  = 6
        //System.out.println(arr[4]);  = 9
      
        //Na linha abaixo ele simplesmente divide o array em 2 partes sobrando a mediana apos a orndenação.
        mediana = arr.length / 2;

        return arr[mediana];
    }

}
