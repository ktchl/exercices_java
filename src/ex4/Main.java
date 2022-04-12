package ex4;

import java.util.Scanner;

/*Ecrire un programme java qui demande à l'utilisateur de saisir un nombre entier et de lui afficher que le nombre
 * est pair ou impair selon la valeur tapée
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre: ");
		int nombre = sc.nextInt();
		if (nombre % 2 == 0) {

			System.out.println("Ce nombre est pair");
		} else {
			System.out.println("Ce nombre est impair");
		}
		// TODO Auto-generated method stub

	}

}
