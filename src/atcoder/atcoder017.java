package atcoder;

import java.util.Scanner;

public class atcoder017 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String aa = readLineString(sc);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		char[] aaa = aa.toCharArray();
		
		for(int i=0;i<aa.length();i++){
			if(aaa[i] == 'A'){
				a++;
			}else if(aaa[i] == 'B'){
				b++;
			}else if(aaa[i] == 'C'){
				c++;
			}else if(aaa[i] == 'D'){
				d++;
			}else if(aaa[i] == 'E'){
				e++;
			}else if(aaa[i] == 'F'){
				f++;
			}
					
		}
		
		
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
		
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
