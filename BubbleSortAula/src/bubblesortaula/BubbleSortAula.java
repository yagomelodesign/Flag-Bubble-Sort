
package bubblesortaula;

import java.util.Random;
import java.util.Scanner;


public class BubbleSortAula {

    static void troca(Integer[] v, int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
    static void bSort(Integer v[], int n){
        int continua;
        do{
            continua=0;
        for(int fase=1;fase<n;fase++){
            for(int j=0;j<n-fase;j++){
                if(v[j]>v[j+1])
                    troca(v,j,j+1);
                continua=j;
                }
            }
        }while(continua != 0);
    }
    
    static Integer[] gerarVetor(int n, int max){
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        Integer[] vetor = new Integer[n];
        for(int i=0;i<n;i++)
            vetor[i] = entrada.nextInt();
        
        return vetor;
    }
    
    static void mostrarVetor(Integer[] v){
          int tamanho = v.length;
          for(int i=0;i<tamanho;i++)
              System.out.print(v[i]+ "|");
          System.out.println("");
    }
    
    public static void main(String[] args) {
        Integer[] meuVetor = gerarVetor(10, 100);
        System.out.println("Vetor Gerado");
        mostrarVetor(meuVetor);
        bSort(meuVetor, 10);
        System.out.println("Vetor Ordenado");
        mostrarVetor(meuVetor);
    }
    
}
