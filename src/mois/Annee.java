package mois;

public class Annee
{
	public Annee()
	{
		this.monate=new Monat[12];
		String[] str= {"Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
		for(int i=0; i<12; i++)
			monate[i]=new Monat();
		for(int i=1; i<12; i++)
			monate[i].setBezeichner(str[i-1]);		    
	}
	
	public Annee(int bezeichner)
	{
		this();
		this.setBezeichner(bezeichner);
	}
	
	private Monat[] monate ;
	private int bezeichner;
	
	
	public int getBezeichner() {
		return bezeichner;
	}

	public void setBezeichner(int bezeichner) {
		this.bezeichner = bezeichner;
	}

	public Monat[] getMonate()
	{
		return this.monate;
	}
}
