package xxx;

import java.util.Scanner;

public class HelloEclipse {
	public static void main(String[] args) {
		int xx =0;
		String id = "^[A-Z][12][0-9]{8}$";
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入身分證字號:");
		
		String id1 = sc.next();
		if(id1.matches(id)) {
			System.out.println("OK");
		}else {
			System.out.println("not good");
		}
		
	}
}