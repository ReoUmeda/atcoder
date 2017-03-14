package atcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class atcoder016 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] a = readLineIntArray(sc);
		int b = readLineInt(sc);
		
		ArrayList<SyainClass> al = new ArrayList<SyainClass>();
		//Integer型の数値を追加する
		for(int i=0;i<b;i++){
			al.add(new SyainClass(readLineInt(sc)));
		}
		
		
		
		Collections.sort(al, new SyainComparator(a));
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i).getSyainNo());
		}
		
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
class SyainClass {

    private int syainNo;

	public SyainClass(int i) {
		// TODO 自動生成されたコンストラクター・スタブ
		setSyainNo(i);
	}

	public int getSyainNo() {
		return syainNo;
	}

	public void setSyainNo(int syainNo) {
		this.syainNo = syainNo;
	}
}
class SyainComparator implements Comparator<SyainClass> {
	private int[] n;
    public SyainComparator(int[] a) {
		// TODO 自動生成されたコンストラクター・スタブ
    	n = a;
	}

	//比較メソッド（データクラスを比較して-1, 0, 1を返すように記述する）
    public int compare(SyainClass a, SyainClass b) {
        int no1 = a.getSyainNo();
        int no2 = b.getSyainNo();

        //こうすると社員番号の昇順でソートされる
        if (cop(no1,no2)) {
            return 1;

        } else if (no1 == no2) {
            return 0;

        } else {
            return -1;

        }
    }
    
    public boolean cop(int na,int nb){
    	boolean ret = true;
    	char[] a = String.valueOf(na).toCharArray();
    	char[] b = String.valueOf(nb).toCharArray();
    	
    	if(a.length < b.length){
    		ret = false;
    		return ret;
    	}else if(a.length > b.length){
    		return ret;
    	}else{
        	for(int i=0;i<a.length;i++){
        		if(coee(Character.getNumericValue(a[i])) < coee(Character.getNumericValue(b[i]))){
        			ret = false;
        			break;
        		}else if(coee(Character.getNumericValue(a[i])) > coee(Character.getNumericValue(b[i]))){
        			break;
        		}
        	}
    	}
    	
    	

    	
    	
    	return ret;
    }
    public int coee(int a){
    	int ret = -1;
    	
    	for(int i=0;i<10;i++){
    		if(n[i] == a){
    			ret = i;
    		}
    	}
    	
    	return ret;
    }

}
