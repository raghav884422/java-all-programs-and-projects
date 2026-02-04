package Stringbuilderandbuffer;

class bufferAndbuilder {
	public static void main(String[] args) {
//		String builder and String buffer are use to create mutable String 
		StringBuffer sb = new StringBuffer("Rama ");
		System.out.println(sb);
		sb.append("Sita");
		System.out.println(sb);
//		System.out.println(sb.toString().toUpperCase()); it is use when we want to convert to string than only we apply upper or lower case
//		String builder is faster than string buffer
		StringBuilder sbi = new StringBuilder("Rama ");
		System.out.println(sbi);
		sbi.append(" Sita");  // apend is use to store or concatinate the element in String builder as well as string buffer   
		System.out.println(sbi);
	}
}

