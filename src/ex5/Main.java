package ex5;

import java.util.Scanner;

/*Question 1: Ecrire un programme java qui calcul la somme des 100 premiers entiers	
 * Question 2: Ecrire un programme java qui demande à l'utilisateur de saisir un nombre entier n et lui affiche la somme
 * des n premiers nombres entiers
 */
public class Main {

	public static void main(String[] args) {

		int result1 = 0;
		for (int i = 1; i <= 100; i++) {

			result1 += i;
		}

		System.out.println("La sommes des 100 premiers entiers est : " + result1);

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre: ");
		int nombre = sc.nextInt();
		int result2 = 0;
		for (int i = 1; i <= nombre; i++) {

			result2 += i;
		}
		System.out.println("La sommes des " + nombre + " premiers entiers est : " + result2);

		// TODO Auto-generated method stub

	}

}
