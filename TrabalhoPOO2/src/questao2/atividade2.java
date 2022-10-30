package questao2;

public class atividade2 {
public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int b[]= {1,2,3,4,5,6,7,8,9,10};
		int c[]=new int[10];
		int resultado;
		
		for(int i=0;i < a.length; ++i) {
			resultado=a[i]+b[i];
			c[i]=resultado;
			System.out.println("O vetor A tem["+a[i]+"] + ["+b[i]+"]que tem o vetor B,que resulta no vetor C=["+c[i]+"]");			
		}
	}

}
