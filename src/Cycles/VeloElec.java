package Cycles;

public class VeloElec extends Velo{
	private double DEFAULT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	private double DEFAULT_COUPLE_MOTEUR = 10.0;
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur = DEFAULT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getDEFAULT_COUPLE_MOTEUR() {
		return DEFAULT_COUPLE_MOTEUR; 
	}
	
	public void setDEFAULT_COUPLE_MOTEUR(double DEFAULT_COUPLE_MOTEUR) {
		this.DEFAULT_COUPLE_MOTEUR = DEFAULT_COUPLE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur(double coupleMoteur) {
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public String toString() {
		return ("VeloElec=[facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]");
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		VeloElec ve1 = new VeloElec();
		VeloElec ve2 = new VeloElec();
		VeloElec ve3 = new VeloElec();
		
		System.out.println("Test des constructeurs:");
        System.out.println(ve1);
        System.out.println(ve2);
        System.out.println(ve3);

        System.out.println("Test des getters et setters:");
        ve1.setBraquet(14);
        ve1.setDiamRoue(2.2);
        System.out.println(ve1);
        
        ve3.setFacteurPuissanceMoteur(12);
        System.out.println(ve3);
        

        System.out.println("Test de getPuissance:");
        System.out.printf("Puissance v3 (avec 90 tours/min) : %.2f\n", ve3.getPuissance(90));
	}
}
