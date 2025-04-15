/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_08_04;

/**
 *
 * @author Aluno
 */
public class ex_18 {
    
    public static void main(String[] args) {
        
        int[][] matriz = {
            
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };
        
        boolean identidade = true;
    for(int linha = 0; linha < 3; linha++){
      for(int coluna = 0; coluna < 3; coluna++){
        if(matriz[linha][coluna] != 1 && matriz[coluna][linha] != 0){
          identidade = false;
          break;
    }
      }
    }
        
    System.out.printf("\n");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.printf("%d ", matriz[i][j]);
      }
      System.out.printf("\n");
    }
 
    if (identidade){
       System.out.printf("\nA matriz informada e uma matriz identidade.\n");
    }
    else{
      System.out.printf("\nA matriz informada nao e uma matriz identidade.\n");
    }
    }   
}
