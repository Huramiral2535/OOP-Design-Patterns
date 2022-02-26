import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DirectorTest {//test olarak en öenmli olanlar bunlardı her şeyin testi 
//yapılmasına gerek yok denildiği için en önemlilerini test ettik

	@Test
	void testEkleme() {
		
		Director director = new Director("D", "Halil Sengonca", 4000, "Mustafa");
		Memur memur = new Memur("M", "Erdem Altin", 500, "Oguz");
		director.Ekleme(memur);
		assertFalse(director.getEmployees().isEmpty());//ekleme yapılabiliyor mu test ettik
	}

	@Test
	void testToplamMaas() {
		Director director = new Director("D", "Halil Sengonca", 4000, "Mustafa");
		Memur memur = new Memur("M", "Erdem Altin", 500, "Oguz");
		director.Ekleme(memur);
		assertEquals(4500,director.toplamMaas());//toplam maas beklenen değere eşit mi test ettik
	}

	@Test
	void testYazdir() {
		Employee director = new Director("D", "Halil Sengonca", 4000, "Mustafa");
		Employee memur = new Memur("M", "Erdem Altin", 500, "Oguz");
		director.Ekleme(memur);
		director.Yazdir();//istediğimizi yazdırıyor mu test ettik
	}

}
