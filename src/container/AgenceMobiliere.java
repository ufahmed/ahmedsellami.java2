package container;

public class AgenceMobiliere {
	private int max;
	Vehicule[]tab;
	private int nb;
	
	AgenceMobiliere(int max){
		tab=new Vehicule[max];

		this.max=max;
	}
	void ajoutVehicule(Vehicule v) {
		if(nb<max){
				tab[nb]=v;
				nb=nb+1;
		}
		else{
			System.out.println("erreur");
				
		}
	}
	void selection(int n)
	{
			if(n<0 || n>=nb || tab[n]==null) {
				System.out.println("erreur");
				
			}
			else {
				tab[n].decris_Vehicule();
		}
	}
	void selection(String mq){
		int i;
		boolean ok=false;
		for(i=0;i<nb;i++) {
			if(tab[i].getmarque()==mq) {
				tab[i].decris_Vehicule();
				ok=true;
				
			}
		
		}
		if(ok==false) {
			System.out.println("il n’y a pas de véhicules de cette marque");
		}
		
	}
	
	void selection(double px) {
		int i;
		boolean verif11=false;
		for(i=0;i<max;i++) {
			if(tab[i].getprix()<px){
				tab[i].decris_Vehicule();
				verif11=true;
		    }
	    }
		if(verif11==false){
			System.out.println("il n’y a pas de véhicules dans cette margee de prix");
		}
	}
	void decriretab()
	{
		for(int i=0;i<nb;i++)
		{
			System.out.println(tab[i]);
		}
	}
	void selection_ancienne()
	{
		
		Vehicule V=tab[0];
		for(int i=1;i<nb;i++)
		{
			if(tab[i].getannee()<V.getannee())
			{
				V=tab[i];
			}
		}
		System.out.println(V);
	}	
		  
}
