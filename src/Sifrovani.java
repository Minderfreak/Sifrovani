import java.io.FileReader;
import java.util.Random;

/**
 * Tøída pro šifrování
 * @author Karel Muroò
 *
 */
public class Sifrovani {
	public static Random r = new Random();
	public static String zasifrovat(String adresa,String heslo) throws Exception {	
		String vysledek="";
		int mezi=0;
		int index=0;
		FileReader reader= new FileReader(adresa);
		while((mezi=reader.read())!=-1) {
			mezi= mezi ^ heslo.charAt(index);
			/*while(mezi<33) {
				mezi+=r.nextInt(60);
			}
			while(mezi>126) {
				mezi-=r.nextInt(50);
			}*/
			vysledek+=(char)mezi;
			index++;
			if(index==heslo.length()) index=0;
		}	
		reader.close();
		return vysledek;
	}
}
