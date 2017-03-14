package atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class atcoder06 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = readLineInt(sc);
		int b = readLineInt(sc);
		int c = readLineInt(sc);
		
		int[] d = new int[3];
		
		d[0] = a;
		d[1] = b;
		d[2] = c;
		
		Arrays.sort(d);
		
		for(int i=0;i<3;i++){
			if(d[i] == a){
				a = i+1;
			}else if(d[i] == b){	
				b = i+1;
			}else if(d[i] == c){
				c = i+1;
			}
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
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
