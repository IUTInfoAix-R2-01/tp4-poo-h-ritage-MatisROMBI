package tp3exosYaip4;

public class Person {
	private String name;
	private String adress;
	
	public Person(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String toString() {
		return ("Person[name=" + name + ", adress=" + adress + "]");
	}
	
	public static void main(String []args) {
		Person P1 = new Person("Matis", "Cassis");
		System.out.println(P1);
		System.out.println(P1.getName());
		System.out.println(P1.getAdress());
	}
}
