package ex3;
/*Ecrire un programme java qui demande à l'utilisateur de saisir successivement deux nombres réels
 * et de lui afficher le maximum des deux.
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier nombre: ");
		double nombre1 = sc.nextDouble();
		System.out.println("Veuillez saisir le deuxième nombre: ");
		double nombre2 = sc.nextDouble();
		if (nombre1 > nombre2) {

			System.out.println("Le maximum est : " + nombre1);
		} else if (nombre2 > nombre1) {

			System.out.println("Le maximum est : " + nombre2);
		} else {

			System.out.println("Les deux nombres ont la même valeur");
		}
		// TODO Auto-generated method stub

	}

}
