package Questao03;


import java.util.Arrays;

/**
 *
 * @author Rafael
 */
public class Questao03 {
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String text = "ola mundo";
       // String text ="tenha um bom dia"; Teste do segundo Ex
        encriptar(text);
    }
    
    public static String encriptar(String texto){
        
        
        // apaga os espaçes da String
        String tirandoOsEspacos  = texto.replace(" ","");
        int tamanhoDaFrase = tirandoOsEspacos.length();
        
        // aux: auxiliar de contagem do tamanho da string parametro
        int aux =0;
        

        //encontra a raiz quadrada do comprimento da string
         double raiz = (int) Math.round(Math.sqrt(tamanhoDaFrase));;

        raiz = (int) Math.ceil(raiz);
        
        //rz raiz quadrada arredondada para cima castada em int
        int rz =(int)raiz;
        char[][] matrix =  new char[rz][rz];
        
        //atribui as letras da string a seus lugares
        for(int i = 0 ; i < rz; i++){
            for(int j = 0; j < rz; j++){
                
                // verfica se os caracteres da string chegaram ao fim 
                if(aux <= tirandoOsEspacos.length() - 1){
                matrix[i][j] = tirandoOsEspacos.charAt(aux);
                aux ++;
                }
            }
        }
        // output a matriz com colunas e linhas
        for (int i = 0; i < matrix.length; i++){
            if(i>0)
                System.out.print(" ");
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[j][i]);
                
            }
            
        }
        
        System.out.println(" ");
        
        return null;
    }
    
}
