public interface Employee {//bu fonksiyonlar hepsinde olacağı için interface kullandım
	public String getRunk();

	public String getAdi();

	public int getMaasi();

	public String getSenior();

	public void Yazdir();

	public int toplamMaas();

	public void Ekleme(Employee employee);

	public Employee getChild(int i);
}