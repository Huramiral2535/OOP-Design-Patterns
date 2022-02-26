public class Memur implements Employee {
	/*
	 * In this class,there are many methods which are not applicable to memur
	 * because it is a leaf node.
	 */
	protected String runk;//diðer class da da kullanýldýðý için protected yaptým
	protected String adi;
	protected int maas;
	protected String senior;

	public Memur(String runk, String adi, int maas, String senior) {
		this.runk = runk;
		this.adi = adi;
		this.maas = maas;
		this.senior = senior;
	}

	@Override
	public void Ekleme(Employee employee) {
		// this is leaf node so this method is not applicable to this class.
	}

	@Override
	public Employee getChild(int i) {
		// this is leaf node so this method is not applicable to this class.
		return null;
	}

	@Override
	public String getRunk() {
		// TODO Auto-generated method stub
		return runk;
	}

	@Override
	public String getAdi() {
		// TODO Auto-generated method stub
		return adi;
	}

	@Override
	public String getSenior() {
		// TODO Auto-generated method stub
		return senior;
	}

	@Override
	public void Yazdir() {
		System.out.println("   " + getRunk() + "(" + getAdi() + ", maaþý: " + getMaasi() + ")");

	}

	@Override
	public int getMaasi() {
		// TODO Auto-generated method stub
		return maas;
	}

	@Override
	public int toplamMaas() {
		// TODO Auto-generated method stub
		return maas;
	}

}