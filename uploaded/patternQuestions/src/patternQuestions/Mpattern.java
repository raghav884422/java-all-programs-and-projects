package patternQuestions;

public class Mpattern {
	public static void main(String[] args) {
for(int i= 1;i<=6;i++) {

	for(int j =1;j<=4;j++) {
		if(i==j||j==1) {
				System.out.print("*");}
	
	else {
		System.out.print(" ");
		}
	}   
	System.out.println();
}
for(int i= 1;i<=6;i++) {

	for(int j =3;j>=1;j--) {
		if(i==j||j==1) {
				System.out.print("*");}
	
	else {
		System.out.print(" ");
		}
	}   System.out.println();
}

	}
	}

	
