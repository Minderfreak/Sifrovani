
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println(Sifrovani.zasifrovat("M:\\novej text.txt", "Vojta"));
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
