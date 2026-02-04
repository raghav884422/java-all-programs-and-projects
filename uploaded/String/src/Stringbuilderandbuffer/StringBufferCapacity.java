package Stringbuilderandbuffer;

public class StringBufferCapacity {
     	public static void main(String[] args) {
//    		the intial capacity of String buffer is 16 and
//     		in string buffer the capacity is increase in form of 
//     		capacity = old_capacity *2+2;
			StringBuffer sb = new StringBuffer("Rama");
			sb.append("Sita");
			System.out.println(sb);
			System.out.println(sb.capacity());
			System.out.println("===========================================");
			StringBuffer sbu = new StringBuffer();
			System.out.println(sbu.capacity());
			sbu.append("omkar is a batsman");
			System.out.println(sbu.capacity());
			sbu.append("He lives in banglore");
			System.out.println(sbu.capacity());
			System.out.println("===========================================");
//			here we initialising the capacity earlier 
			StringBuffer sbu1 = new StringBuffer(100);
			System.out.println(sbu1.capacity());
			System.out.println("===========================================");
//			another way to initialising the capacity
			StringBuffer sbu2 = new StringBuffer();
			sbu2.ensureCapacity(500);
			System.out.println(sbu2.capacity());
			System.out.println("===========================================");
//			 capaity in Stringbuilder
			
			
			
		}
}
