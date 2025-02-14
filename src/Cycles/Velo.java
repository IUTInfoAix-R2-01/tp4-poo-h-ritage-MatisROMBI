package Cycles;

import java.util.Random; 

public class Velo {
	private double DEFAULT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
	public double getDEFAULT_BRAQUET() {
		return DEFAULT_BRAQUET;
	}
	
	public void setDEFAULT_BRAQUET(double DEFAULT_BRAQUET) {
		this.DEFAULT_BRAQUET = DEFAULT_BRAQUET;
	}
	
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		this.genAlea = new Random();
	}
	
	public Velo(double braquet) {
		this.braquet = braquet;
		this.diamRoue = 10;
		this.genAlea = new Random();
	}
	
	public Velo() {
		this.braquet = 10;
		this.diamRoue = 10;
		this.genAlea = new Random();
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public double getBraquet() {
		return braquet;
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	public String toString() {
		return ("Vélo=[braquet=" + braquet + ", diamRoue=" + diamRoue + "]");
	}
	
	public double getPuissance(double frequenceCoupsDePedale) {
		return frequenceCoupsDePedale*braquet*diamRoue*genAlea.nextDouble();
	}
	
	
	public static void main(String[] args) {
        Velo v1 = new Velo();
        Velo v2 = new Velo(16);
        Velo v3 = new Velo(18, 2.5);

        System.out.println("Test des constructeurs:");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        System.out.println("Test des getters et setters:");
        v1.setBraquet(14);
        v1.setDiamRoue(2.2);
        System.out.println(v1);

        System.out.println("Test de getPuissance:");
        System.out.printf("Puissance v3 (avec 90 tours/min) : %.2f\n", v3.getPuissance(90));
    }
}
