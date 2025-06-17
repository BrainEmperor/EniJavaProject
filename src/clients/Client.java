package clients;
import java.util.Scanner;
import java.util.ArrayList;

class clients 
{
	clients(String name)
	{
		this(name, false);
	}
		
	clients(String name, boolean status)
	{
		if (name=="")
			throw new IllegalArgumentException("Veuillez entrer un nom valide");
		this.name=name;
		this.Id=clients.nombre_de_clients;
		liste.add(this);
		nombre_de_clients++;
		if (status)
			System.out.println(this.toString()+ " ajouté");
	}
	
	private String name;
	private int Id;
	static int nombre_de_clients;
	static ArrayList<clients> liste=new ArrayList<clients>();
	
	@Override
	public String toString() {
		return "client n°" + Id + "[" + name + "]";
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getName()
	{
		return this.name;
	}

	public static void afficher_les_clients()
	{
		String str="";
		for(clients client : liste)
			str+=client.toString()+"\n";
		System.out.print(str);
	}
	
	public static void supprimer_client(int id)
	{
	    supprimer_client(id, false);	
	}
	
	public static void supprimer_client(int id, boolean print_status)
	{
		if(id>=liste.size() || id<0)
			System.out.println("Aucun client n'a cet Id");
		else 
		{
			if (print_status)
				System.out.println(String.format("Client %s supprimé avec succès", liste.get(id).getName()));
			liste.remove(id);
			for(clients client : liste)
				if(liste.indexOf(client)>=id)
					client.setId(client.Id-1);
			clients.nombre_de_clients--;			
		}
	}		
}

public class Client {
	
	public static void afficher_menu()
	{
		System.out.println("""
				--Menu--
				1- Afficher les clients
				2- Creer un client
				3- Supprimer un client
				4- Quitter
				          """);
	}
	
	public static Scanner eingabe=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int numMenu;
		do
		{
			afficher_menu();
			numMenu=Integer.parseInt(eingabe.nextLine());
			switch(numMenu)
			{
			    case 1:
			    	clients.afficher_les_clients();
			    	break;
			    case 2:
			    	System.out.println("Nom ?");
			    	new clients(eingabe.nextLine(), true);
			    	break;
			    case 3:
			    	System.out.println("Id du client à supprimer ?");
			    	clients.supprimer_client(eingabe.nextInt(), true);
			    	eingabe.nextLine();
			    	break;
			    default:
			    	continue;
			}						
		}
		while(numMenu!=4);
	}
}
