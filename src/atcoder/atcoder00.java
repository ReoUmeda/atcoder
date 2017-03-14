package atcoder;

import java.util.Scanner;




public class atcoder00 {

	public static void main(String[] args) {
		new atcoder00();
	}
	
	public atcoder00() {
		Scanner sc = new Scanner(System.in);
		
		int a = readLineInt(sc);
		int[] b = readLineIntArray(sc);
		String c = readLineString(sc);
		
		System.out.println((a+b[1]+b[0])+" "+c);
		
		
		sc.close();
	}

	protected long readLineLong(Scanner sc) {
		return Long.parseLong(sc.nextLine());
	}
	
	protected long[] readLineLongArray(Scanner sc) {
		String split[] = sc.nextLine().split(" ");
		long ret[] = new long[split.length];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = Long.parseLong(split[i]);
		}
		return ret;
	}
	protected int readLineInt(Scanner sc) {
		return Integer.parseInt(sc.nextLine());
	}
	
	protected int[] readLineIntArray(Scanner sc) {
		String split[] = sc.nextLine().split(" ");
		int ret[] = new int[split.length];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = Integer.parseInt(split[i]);
		}
		return ret;
	}
	
	protected double readLineDouble(Scanner sc) {
		return Double.parseDouble(sc.nextLine());
	}
	
	protected double[] readLineDoubleArray(Scanner sc) {
		String split[] = sc.nextLine().split(" ");
		double ret[] = new double[split.length];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = Double.parseDouble(split[i]);
		}
		return ret;
	}
	
	protected String readLineString(Scanner sc) {
		return sc.nextLine();
	}
	
	protected String[] readLineStringArray(Scanner sc) {
		return sc.nextLine().split(" ");
	}
}