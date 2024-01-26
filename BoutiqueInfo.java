package examen2022;

import java.util.Arrays;

public class BoutiqueInfo {
	MaterielInfo [] tabMat =new MaterielInfo[100];
	int nombreDeMateriels = 0;
	void ajoutMateriel(MaterielInfo i) {
		boolean b = false;
		if(nombreDeMateriels == 0) {
			tabMat[0]=i;
			nombreDeMateriels++;
		}else {
			for(int j=0;j<nombreDeMateriels ; j++) {
				if(tabMat[j].reference==i.reference) {
					tabMat[j].quantite+=i.quantite;
					b=true ;
					break;
				}
				
			}
			if(b==true) {
				System.out.println("qte ajouter");
			}else if(nombreDeMateriels==100) {
				System.out.println("complee");
			}else if(nombreDeMateriels<100) {
				tabMat[nombreDeMateriels]=i;
				nombreDeMateriels++;
			}
		}
	}
	
	void venteMateriel(long ref, int qte) throws ExceptionQte {
		for(int i=0;i<this.tabMat.length ; i++) {
			if(this.tabMat[i].reference == ref) {
				if(this.tabMat[i].quantite < qte) {
					throw new ExceptionQte("qte non disponible");
				}else {
					this.tabMat[i].quantite-=qte ;
				}
				break;
			}
		}
	}
	
	

	public static void main(String[] args) {
				
		BoutiqueInfo boutique = new BoutiqueInfo();
		String[] connexion1 = {"4 usb","Ble","wifi"};
		String[] connexion2 = {"4 usb","Ble","hdmi","wifi"};
		Ordinateur o1 = new Ordinateur("DELL", "Intel i3 2.5 4 15 500",connexion1,1,1800,4);
		Ordinateur o2 = new Ordinateur("hp", "Intel i5 4 8 15 1024",connexion2,2,2000,7);
		boutique.ajoutMateriel(o1);
		boutique.ajoutMateriel(o2);
		for(int i=0 ; i< boutique.nombreDeMateriels ; i++) {
			System.out.println(boutique.tabMat[i].toString());
			
		}
		double total = 0;
		for(int i=0 ; i< boutique.nombreDeMateriels ; i++) {
			total += boutique.tabMat[i].prixVente();			
		}
		System.out.println(total);
		try {
			boutique.venteMateriel(1, 2);
		}catch(ExceptionQte e) {
			System.out.println(e.getMessage());
		}
	}

}
