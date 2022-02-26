
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Director extends Memur implements Employee {//memur sýnýfýna benzer olduðu için extends ettik
	public Director(String runk, String adi, int maas, String senior) {
		super(runk, adi, maas, senior);
		// TODO Auto-generated constructor stub
	}

	List<Employee> employees = new ArrayList<Employee>();//çalýþan listesi

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
		Iterator<Employee> it = employees.iterator();//iterator kullanarak çalýþanlarýn maaliyetini hesapladýk
		while (it.hasNext()) {
			Employee employee = it.next();
			toplamMaas += employee.toplamMaas();
			employee.toplamMaas();
		}
		toplamMaas += maas;
		return toplamMaas;
	}

	@Override
	public void Yazdir() {//kendi tostring metodumuzu iterator kullanarak oluþturduk
		System.out.println(
				 getRunk() + "(" + getAdi() + ", maaþý: " + getMaasi() + ", maaliyet: " + toplamMaas() + ")");
				//director da memurdan farklý olarak maaliyet de yazdýrýlýr
		Iterator<Employee> it = employees.iterator();
		while (it.hasNext()) {
			Employee employee = it.next();
			System.out.print("  ");
			employee.Yazdir();
		}
	}
}