package container;

public class Vehicule {
	static int count;
	private int num;
	private String marque;
	private String modele;
	private int année_creation;
	private double prix;
	Vehicule(String marque,String modéle, int année, double prix){
		this.marque=marque;
		this.modele=modéle;
		this.année_creation=année;
		this.prix=prix;
	}
	String getmarque() {
		return this.marque;
	}
	String getmodele() {
		return this.modele;
	}
	double getprix() {
		return this.prix;
	}
	int getannee() {
		return this.année_creation;
	}
	int getcount() {
		return Vehicule.count;
	}
	void setnum(int d) {
		this.num=d;
	}
	void setmarque(String a) {
		this.marque=a;
	}
	void setmodele(String b) {
		this.modele=b;
	}
	void setannee(int c) {
		this.année_creation=c;
	}
	
	void decris_Vehicule() {
		System.out.println("numero"+num+"marque"+marque+"modele"+modele
				           +"année"+année_creation+"prix"+prix);
	}
	
	
	
	
	
	
	

}
