package sort_mod;
/**
 *
 * @author asmnoak
 *   sort modification
 *     sort array data
 *      for examle
 *        45,34,89,56,2,3,4,11,22,81
 *      into
 *        2 4 22 34 56 89 81 45 11 3
 *
 */
public class Sort_mod {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] a= {45,34,89,56,2,3,4,11,22,81};
		int le; // last even index
        le=sort1(a);  // 1. even and odd sort
        for(int p:a) System.out.print(p+" ");
        System.out.println("");
        System.out.println(le);
        System.out.println("");
        sort(a,le);  // 2. ascendant sort of even number
        for(int p:a) System.out.print(p+" ");
        System.out.println("");
        System.out.println("");
        sortd(a,le+1);  // 3. descendant sort of odd number
        for(int p:a) System.out.print(p+" ");
        System.out.println("");
  	}
	public static int sort1 (int[] m) {
		int i;
		int j=0;
		int k=0;
		for(i=0;i<m.length;i++) {
			for(j=i+1;j<m.length;j++) {
				if(m[j]%2==0) { // even?
					int s;
					s=m[i];
					m[i]=m[j];
					m[j]=s;
					k=i;  // save last even index
				}
			}
		}
		return k;
	}
	public static void sort (int[] m,int t) {
		int i;
		int j;
		for(i=0;i<t+1;i++) {
			for(j=i+1;j<t+1;j++) {
				if(m[i]>m[j]) {
					int s;
					s=m[i];
					m[i]=m[j];
					m[j]=s;
				}
			}
		}
	}
	public static void sortd (int[] m,int t) {
		int i;
		int j;
		for(i=t;i<m.length;i++) {
			for(j=i+1;j<m.length;j++) {
				if(m[i]<m[j]) {
					int s;
					s=m[i];
					m[i]=m[j];
					m[j]=s;
				}
			}
		}
	}
}
