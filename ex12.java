import java.util.*;
public class ex12 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a[] = new int [10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"� valor");
			a[i] = input.nextInt();
		}
		
		if(a[0] == a[9] && a[1] == a[8] && a[2] == a[7] && a[3] == a[6]) {
			System.out.println("� pal�ndromo");
		}
		else {
			System.out.println("N�o � pal�ndromo");
		}
	}
}

