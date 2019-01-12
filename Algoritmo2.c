/*Algoritmo che calcola la somma dei valori della diagonale principale e della diagonale secondatria di una matrice quadrata.*/

#include <stdio.h>
#include <stdlib.h>
#include <float.h>

#define l 100

int main() {
	int n,i,j;
	float mat[l][l];
	float s_d_p=0,s_d_s=0;
	do {
		printf("Dichiarare il numero di righe e di colonne della matrice:\t");
		scanf("%d",&n);
	} while (n<=0 || n>100);
	printf("\n\nInserire gli elementi della matrice:\n");
	for (i=0;i<n;i++) {
		for (j=0;j<n;j++) {
			scanf("%f",&mat[i][j]);
		}
	}
	printf("\n\nLa matrice inserita è:\n");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			printf("%f\t",mat[i][j]);  
		}
		printf("\n");
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
	printf("\n\n\n\nLa somma dei valori della diagonale principale è:\t%f ;\t\tLa somma dei valori della diagonale secondaria è:\t%f",s_d_p,s_d_s);
}
/*Data: 12-01-2018
Classe: 4^Finf.
Alunni: Bucchianico Enrico Ruggiero; De Rosa Raffaele.*/