package atcoder;

import java.util.Scanner;

public class atcoder020 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = readLineInt(sc);
		String b = readLineString(sc);
		char[] c = b.toCharArray();
		int d = -1;
		for(int i=0;i<b.length();i++){
			if(c[i] == 'a'){
				
			}else if(c[i] == 'b'){
				
			}else if(c[i] == 'c'){
				
			}else{
				System.out.println(d);
				return;
			}
			
			
		}
		String f ="b";
		int e = 1;
		int k = 1;
		while(f.length() < b.length()){
			if(e%3 == 1){
				f = "a"+f+"c";
			}else if(e%3 == 2){
				f = "c"+f+"a";
			}else if(e%3 ==0){
				f = "b"+f+"b";
			}
			if(f.equals(b)){
				d = k;
				break;
			}
			e++;
			e = e%3;
			k++;
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
