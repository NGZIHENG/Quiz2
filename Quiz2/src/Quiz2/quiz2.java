package Quiz2;

public class quiz2 {

	public static void main(String[] args) {
		System.out.println("For 1.");
		int max = 5;
		for (int n=1; n<=max; n++) {
			System.out.println(n);
		}
		System.out.println();
		
		System.out.println("While 1.");
		int maxx=5;
		int n=1;
		while(n<=max) {
			System.out.println(n);
			n++;
		}
		System.out.println();
		
		System.out.println("For 2.");
		int total=25;
		for (int number=1; number<= (total/2); number++) {
			total=total-number;
			System.out.println(total + " " + number);
		}
		System.out.println();
		
		System.out.println("While 2.");
		int total1=25;
		int number1=1;
		while (number1<=(total1/2)){
			total1=total1-number1;
			System.out.println(total1 + " " + number1);
			number1++;
		}
		System.out.println();
		
		System.out.println("For 3.");
		for (int i=1;i<=2;i++) {
			for (int j=1; j<=3;j++) {
				for (int k=1; k<=4; k++) {
					System.out.print("*");
				}
				System.out.print("!");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("While 3.");
		int i=1;
		while (i<=2) {
			int j=1;
			while (j<=3) {
				int k=1;
				while (k<=4) {
					System.out.print("*");
					k++;
				}
				System.out.print("!");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		
		
		System.out.println("For 4.");
		int number=4;
		for(int count=1;count<=number;count++) {
			System.out.println(number);
			number=number/2;
		}
		
		
		System.out.println("While 4.");
		int number2=4;
		int count=1;
		while(count<=number2) {
			System.out.println(number2);
			number2=number2/2;
			count++;
		}

	}

}
