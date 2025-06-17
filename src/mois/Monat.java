package mois;

public class Monat
{
	public Monat()
	{
		this.setIdentifier(01);
		this.setBezeichner("Janvier");
	}
	
	private int identifier;
	private String bezeichner;
	
	public int getIdentifier() {
		return identifier;
	}
	
	public void setIdentifier(int identifier) {
		if (identifier<1 || identifier>12)
			throw new IllegalArgumentException("l'index ne correspond à aucun mois");
		this.identifier = identifier;
	}
	
	public String getBezeichner() {
		return bezeichner;
	}
	
	public void setBezeichner(String bezeichner) {
		this.bezeichner = bezeichner;
	}
	
	public String toString()
	{
		return this.bezeichner;
	}
	
}
