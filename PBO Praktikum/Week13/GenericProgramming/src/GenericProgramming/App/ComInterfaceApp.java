package GenericProgramming.App;
import java.util.Arrays;
import GenericProgramming.ComparableInterface;
public class ComInterfaceApp {

	public static void main(String[] args) {
		ComparableInterface[] mahasiswa = {
				new ComparableInterface("Hanhan Septian", "201511041"),
				new ComparableInterface("Zulaikha", "201511200"),
		};
		
		Arrays.sort(mahasiswa);
	
		System.out.println(Arrays.toString(mahasiswa));
	}

}
