package atcoder;

import java.util.Scanner;

public class atcoder012 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = readLineIntArray(sc); 
		int[] b = readLineIntArray(sc);
		int c = a[1];
		int d = 0;
		for(int i=0;i<a[0];i++){
			if(c > b[4]){
				c -= b[4];
			}else if((c+b[3]) > b[4]){
				d += b[2];
				c += b[3];
			}else if((c+b[1]) > b[4]){
				d += b[0];
				c += b[1];
			}
		}
		
		
		System.out.println(d);
		
		sc.close();
		
	}
	
	protected static long readLineLong(Scanner sc) {
		return Long.parseLong(sc.nextLine());
	}
	
	protected static long[] readLineLongArray(Scanner sc) {
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
	
	protected static double readLineDouble(Scanner sc) {
		return Double.parseDouble(sc.nextLine());
	}
	
	protected static double[] readLineDoubleArray(Scanner sc) {
		String split[] = sc.nextLine().split(" ");
		double ret[] = new double[split.length];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = Double.parseDouble(split[i]);
		}
		return ret;
	}
	
	protected static String readLineString(Scanner sc) {
		return sc.nextLine();
	}
	
	protected static String[] readLineStringArray(Scanner sc) {
		return sc.nextLine().split(" ");
	}
}
