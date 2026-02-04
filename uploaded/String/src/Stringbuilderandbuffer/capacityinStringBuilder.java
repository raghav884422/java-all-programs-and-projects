package Stringbuilderandbuffer;

public class capacityinStringBuilder {
	public static void main(String[] args) {
//		the intial capacity of String bhuilder is 16 and
// 		capacity = old_capacity *2+2;
//		both have the same capacity

		StringBuilder sb = new StringBuilder("Rama");
		sb.append("Sita");
		System.out.println(sb);
		System.out.println(sb.capacity());
//		deleteing the element from 2 to 4 position
		sb.delete(2, 4);
		System.out.println(sb);
//    insert  the element from 2 to 4 position
		sb.insert(3, ",");
		System.out.println(sb);
		System.out.println("===========================================");
		StringBuilder sbu = new StringBuilder();
		System.out.println(sbu.capacity());
		sbu.append("omkar is a batsman");
		System.out.println(sbu.capacity());
		sbu.append("He lives in banglore");
		System.out.println(sbu.capacity());
		System.out.println("===========================================");
//		here we initialising the capacity earlier 
		StringBuilder sbu1 = new StringBuilder(100);
		System.out.println(sbu1.capacity());
		System.out.println("===========================================");
//		another way to initialising the capacity
		StringBuilder sbu2 = new StringBuilder();
		sbu2.ensureCapacity(500);
		System.out.println(sbu2.capacity());
		System.out.println("===========================================");
//		 capaity in Stringbuilder

		
	}

}
