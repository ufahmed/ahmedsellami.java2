package container;

public class TestVehicule {
	public static void main(String[] args) 
	{
		AgenceMobiliere ag=new AgenceMobiliere(3);
		Vehicule v=new Vehicule("Clio","Classique",2000,20.000);
		Vehicule w=new Vehicule("Mercedes","Fantome",2008,60.000);
		Vehicule x=new Vehicule("KIA","Picanto",2012,35.000);
		
		ag.ajoutVehicule(v);
		ag.ajoutVehicule(w);
		ag.ajoutVehicule(x);
		
		
		ag.decriretab();
		ag.selection("Mercedes");
		ag.selection(40.000);
		ag.selection_ancienne();


		
		
		
		
		
		
		
		
		
		
	}
	

}
