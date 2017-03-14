package atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class atcoder011 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = readLineLong(sc);
		long[] b = readLineLongArray(sc);
		long c = 0L;
		int f = 0;
		
		Arrays.sort(b);
		
		for(long i=0;i<a;i++){
			f = 0;
			if(b[(int)i] == -1){
				continue;
			}
			for(long j=0;j<a;j++){
				if(b[(int)i] == b[(int)j]){
					if(f == 0){
						f++;
					}else{
						b[(int)i] = -1;
					}
				}else if(saiki(b[(int)i],b[(int)j])){
					b[(int)j] = -1;
				}
			}
			if(f == 1){
				b[(int)i] = -2;
			}
		}
		
		
		
		int r = 0;
		for(int i=0;i<a;i++){
			if(b[i] == -2){
				r++;
			}
		}
		
		System.out.println(r);
		
		sc.close();
		
	}
	
	private static boolean saiki(long a ,long b){
		boolean  ret = true;
		
		
		if(a > b){
			ret = false;
		}else if(a < b){
			ret = saiki(a*2L,b);
		}
		
		
		return ret;
		
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
