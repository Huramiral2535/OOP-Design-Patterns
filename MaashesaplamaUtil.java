import java.util.List;

public class MaashesaplamaUtil {
	public static int getToplamMemurmaasi(List<Memur> memurlistesi) {
		int toplamMaas = 0;

		for (Memur memur : memurlistesi) {
			toplamMaas += (memur.getMaasi());
		}
		return toplamMaas;
	}

	public static int getToplamDirectorMaasi(List<Director> directorlistesi) {
		int toplamMaas = 0;

		for (Director director : directorlistesi) {
			toplamMaas += (director.getMaasi());
		}
		return toplamMaas;
	}
}