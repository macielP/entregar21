import java.util.*;
public class ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
	
		double a[] = new double [10];
		
		for (int i=0;i<a.length;i++) {
			System.out.println("Digite o " + (i+1) + " n�mero ");
			a[i] = in.nextInt();
		
		}
		for (int i=0;i<a.length;i++) {
			
		
			if(a[i] % i == 0) {
				System.out.println(a[i] + " � Primo");
			}else {
				System.out.println(a[i] + " n�o � Primo");
			}
			
		}
			
		
		
	}

}
