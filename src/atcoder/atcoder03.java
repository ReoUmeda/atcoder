package atcoder;

import java.util.Scanner;

public class atcoder03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int a = readLineInt(sc);
//		int[]d = {1,2,4,8};
//		
//		aaa(a,0,d);
		System.out.println(a);
		for(int i=0;i<a;i++){
			System.out.println(1);
		}
		
		
		sc.close();
	} 	
	
	public static int aaa(int b,int c,int[] d){
		int ret = 0;
		
		
		for(int i=0;i<d.length;i++){
			if(b == d[i]){
				
			}else{
				
			}
			
		}
		
		
		return ret;
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
