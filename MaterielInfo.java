package examen2022;

public abstract class MaterielInfo {
	protected long reference ;
	private double prixHT ;
	int quantite ;
	
	public MaterielInfo(long l) {
		this.reference = l ;
	}
	public MaterielInfo(long l, double p, int q) {
		this(l);
		this.prixHT = p ;
		this.quantite = q ;
	}
	
	
	double getPrixHT() {
		return this.prixHT;
	}
	void setPrixHT(double p) {
		this.prixHT = p ;
	}
	
	boolean equals(MaterielInfo m) {
		return m.reference == this.reference ;
	}

	@Override
	public String toString() {
		return "[MaterielInfo ref " + reference + " prixHt " + prixHT + " Quantite " + quantite + "]";
	}
	
	abstract double prixVente();
	

}
