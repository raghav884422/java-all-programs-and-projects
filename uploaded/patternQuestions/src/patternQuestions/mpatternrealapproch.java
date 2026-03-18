package patternQuestions;

import java.util.Iterator;

public class mpatternrealapproch {
	public static void main(String[] args) {
		for (int  i = 0; i<=4;i++) {
			for(int j=0;j<=4;j++ ) {
				if(j==0||i==j|(j==3/2&&i==1)) {
					System.out.print("*");
				
				}
				else {				
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//		for(int i=0;i<=1;i++){
//            for(int j=0;j<=4;j++){
//                if(j==0||j==4){
//					System.out.print("*");
//
//                }else {
//                    System.out.print(" ");
//                }
//            }
//                    System.out.println();

//        }
	}

}
