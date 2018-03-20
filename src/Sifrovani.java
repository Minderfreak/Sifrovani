import java.io.FileReader;

/**
 * T��da pro �ifrov�n�
 * @author Karel Muro�
 *
 */
public class Sifrovani {
	public static String zasifrovat(String adresa,String heslo) throws Exception {	
		String vysledek="";
		int mezi=0;
		int index=0;
		FileReader reader= new FileReader(adresa);
		while((mezi=reader.read())!=-1) {
			mezi= mezi ^ heslo.charAt(index);
			vysledek+=(char)mezi;
			index++;
			if(index==heslo.length()) index=0;
		}	
		reader.close();
		return vysledek;
	}
}
