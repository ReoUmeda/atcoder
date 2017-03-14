package atcoder;

import java.util.Scanner;

public class atcoder018 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String a = readLineString(sc);
		int b = readLineInt(sc);
		char[] aaa = a.toCharArray();
		char tmp;
		String w = "";
		int q = 0;
		for(int i=0;i<b;i++){
			q = a.length();
			w = "";
			int[] c = readLineIntArray(sc);
			c[0]--;
			c[1]--;
			if(c[0] != 0){
				w = a.substring(0, c[0]-1);
			}
			
			w = w + gss(a.substring(c[0], c[1]));
			System.out.println(a.length()-1);
			w = w + a.substring(c[1]+1, q-1);
			a = w;
		}
		
		
		System.out.println(a);
		
		sc.close();
		
	}
	private static String gss(String a){
        StringBuffer sb = new StringBuffer(a) ;
        sb.reverse() ;
        return sb.toString();
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
