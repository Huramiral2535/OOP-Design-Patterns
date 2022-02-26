
public class Deneme {
	public static void main(String args[]) {

		Employee memur1 = new Memur("M", "Emre Kosar", 700, "Ugur");
		Employee memur2 = new Memur("M", "Ahmet Egeli", 700, "Ugur");
		Employee memur3 = new Memur("M", "Bora Kuzey", 1000, "Sedat");
		Employee memur4 = new Memur("M", "Onder Bati", 500, "Oguz");
		Employee memur5 = new Memur("M", "Erdem Altin", 500, "Oguz");
		Employee memur6 = new Memur("M", "Mehmet Bilir", 600, "Oguz");

		Employee director1 = new Director("D", "Mustafa Turksever", 5000, "Root");
		Employee director2 = new Director("D", "Halil Sengonca", 4000, "Mustafa");
		Employee director3 = new Director("D", "Bahar Karaoglan", 3500, "Mustafa");
		Employee director4 = new Director("D", "Ugur Guclu", 2000, "Halil");
		Employee director5 = new Director("D", "Sedat Tunc", 2500, "Halil");
		Employee director6 = new Director("D", "Oguz Demir", 3000, "Halil");

		director1.Ekleme(director2);
		director1.Ekleme(director3);
		director2.Ekleme(director4);
		director2.Ekleme(director5);
		director2.Ekleme(director6);
		director4.Ekleme(memur1);
		director4.Ekleme(memur2);
		director5.Ekleme(memur3);
		director6.Ekleme(memur4);
		director6.Ekleme(memur5);
		director6.Ekleme(memur6);
		director1.Yazdir();//Direactor Mustafa Turksever
		System.out.println("    -------------------------");
		director6.Yazdir();//Director Oğuz Demir
		System.out.println("    -------------------------");
		memur2.Yazdir();//Memur Ahmet Egeli

	}
}