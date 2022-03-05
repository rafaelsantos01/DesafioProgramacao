package Questao02;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Questao02 {
     public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        int[] n = {1, 5, 3, 4, 2};
        
        System.out.println("Digite o valor de X!");
        int valor = entrada.nextInt();
        
        //na linha abaixo é lançados os parametros N e valor na funcao verificar() realizando a chamada do mesmo.
        System.out.println(verificar(n, valor));
    }

    
    public static int verificar(int[] n, int valor){
        int cont = 0;
        
        //relaiza contagem dos valores e armazena na variavel cont
         for(int i = 0; i < n.length -1; i++){
            for(int j=(i+1); j < n.length; j++ ){
                if(n[i] == n[j]+valor || n[i]==n[j]-valor){
                    cont++;
                }
            }
        }
         
        //mostrando o resltado
        return cont;
    }
    
}
