
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Director extends Memur implements Employee {//memur s�n�f�na benzer oldu�u i�in extends ettik
	public Director(String runk, String adi, int maas, String senior) {
		super(runk, adi, maas, senior);
		// TODO Auto-generated constructor stub
	}

	List<Employee> employees = new ArrayList<Employee>();//�al��an listesi

	@Override
	public void Ekleme(Employee employee) {
		employees.add(employee);
	}

	@Override
	public Employee getChild(int i) {
		return employees.get(i);
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public int toplamMaas() {
		int toplamMaas = 0;
		Iterator<Employee> it = employees.iterator();//iterator kullanarak �al��anlar�n maaliyetini hesaplad�k
		while (it.hasNext()) {
			Employee employee = it.next();
			toplamMaas += employee.toplamMaas();
			employee.toplamMaas();
		}
		toplamMaas += maas;
		return toplamMaas;
	}

	@Override
	public void Yazdir() {//kendi tostring metodumuzu iterator kullanarak olu�turduk
		System.out.println(
				 getRunk() + "(" + getAdi() + ", maa��: " + getMaasi() + ", maaliyet: " + toplamMaas() + ")");
				//director da memurdan farkl� olarak maaliyet de yazd�r�l�r
		Iterator<Employee> it = employees.iterator();
		while (it.hasNext()) {
			Employee employee = it.next();
			System.out.print("  ");
			employee.Yazdir();
		}
	}
}