package examen2022;

import java.util.Arrays;

public class Ordinateur extends MaterielInfo implements Affichable{
	String marque ;
	String description ;
	String [] typeConnexion ;
	
	public Ordinateur(String mar, String des, String[] typ,long l, double p, int q) {
		super(l,p,q);
		this.description=des;
		this.marque = mar ;
		this.typeConnexion = typ ;
	}
	
	
	
	@Override
	public String toString() {
		return "Ordinateur ref :"+ super.reference +" prixHt :"+super.getPrixHT()+", Marque :" + marque + ", Description :" + description + ", Connection disponibles :"+ Arrays.toString(typeConnexion) + "Quantite en stock :"+super.quantite;
	}

	double prixVente() {
		return super.getPrixHT()*1.15 ;
	}
	public void afficheToi() {
		System.out.println(this.toString());
	}

	public static void main(String[] args) {
		/*String[] type = {"ff","ff"};
		Ordinateur o = new Ordinateur("dell", "excelent",type,111,2500,5);
		o.afficheToi();*/

	}

}
