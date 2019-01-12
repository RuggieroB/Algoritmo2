/*Algoritmo che calcola la somma dei valori della diagonale principale e della diagonale secondatria di una matrice quadrata.*/ 

import java.util.*;
class Algoritmo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,i,j;
		double s_d_p=0,s_d_s=0;
		do {
			System.out.println("Dichiarare il numero di righe e di colonne della matrice:\t");
			n=input.nextInt();
		} while (n<=0 || n>100);
		double mat[][] = new double[n][n];
		System.out.println("\nInserire gli elementi della matrice:\n");
		for (i=0;i<n;i++) {
			for (j=0;j<n;j++) {
				mat[i][j]=input.nextDouble();
			}
		}
		System.out.println("\nLa matrice inserita è:\n");
   		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(""+mat[i][j]+("\t"));  
			}
			System.out.print("\n");
		}
		for (i=0;i<n;i++) {
			for (j=0;j<n;j++) {
				if (j==i) {
					s_d_p+=mat[i][j];
				}
			}
		}
		for (i=0;i<n;i++) {
			j=n-i-1;
			s_d_s+=mat[i][j];
		}
		System.out.println("\n\nLa somma dei valori della diagonale principale è:\t"+s_d_p+(" ;\t\tLa somma dei valori della diagonale secondaria è:\t"+s_d_s));
	}
}
/*Data: 12-01-2018
Classe: 4^Finf.
Alunni: Bucchianico Enrico Ruggiero; De Rosa Raffaele.*/