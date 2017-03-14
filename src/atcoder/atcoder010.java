package atcoder;

import java.util.Scanner;

public class atcoder010 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = readLineString(sc);
		char[] c = a.toCharArray();
		String b ="";
		int tmp = 1;
		
		for(int i=0;i<a.length();i++){
			if((i+1) == a.length()){
				b = b + c[i]+tmp;
			}
			else if(c[i] == c[i+1]){
				
				tmp++;
			}else{
				b = b + c[i]+tmp;
				tmp = 1;
			}
		}
		
		System.out.println(b);
		
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
	
	protected static String readLineString(Scanner sc) {
		return sc.nextLine();
	}
	
	protected String[] readLineStringArray(Scanner sc) {
		return sc.nextLine().split(" ");
	}
}
