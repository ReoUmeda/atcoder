package atcoder;

import java.util.Scanner;

public class atcoder07 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] a = readLineIntArray(sc);
		int tmp;
		tmp = (a[0]+1)*a[1];
		if(tmp > (a[1]+1)*a[0]){
			System.out.println(tmp);
		}else{
			System.out.println((a[1]+1)*a[0]);
		}
		
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
	protected static int readLineInt(Scanner sc) {
		return Integer.parseInt(sc.nextLine());
	}
	
	protected static int[] readLineIntArray(Scanner sc) {
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
