package ex2;

import java.util.Scanner;

/*Ecrire un programme java qui demande à l'utilisateur de saisir un nombre et de lui afficher son double
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre: ");
		int nombre = sc.nextInt();
		System.out.println("Le double de " + nombre + " est " + 2 * nombre);
		// TODO Auto-generated method stub

	}

}
