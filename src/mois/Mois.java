package mois;
import java.util.Scanner;

public class Mois {	
	
	public static String print_monat(Annee Jahr, int identifier)
	{
		if (identifier<1 || identifier>12)
			throw new IllegalArgumentException("l'index ne correspond à aucun mois");
		return Jahr.getMonate()[identifier-1].toString();
	}
	
	public static Annee Jahr=new Annee();
	
	public static Scanner eingabe=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Entrez l'indexe de l'année à afficher");
		int index=eingabe.nextInt();
		
		System.out.println(print_monat(Jahr, index));
	}
		
}
