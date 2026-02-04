package functionsInString;
class functions {
	public static void main(String[] args) {
		String s = "  Raja Rama Mohana raya";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf("o"));
		System.out.println(s.startsWith("R"));
		System.out.println(s.endsWith("raya"));
		System.out.println(s.length());
		System.out.println(s.substring(10));
		System.out.println(s.substring(10,15));
		System.out.println(s.substring(10,21));
		char arr[]= s.toCharArray();
		System.out.print("[");
		for(char c:arr) {
			System.out.print(c+" ");
		}
		System.out.println("]");
		
		System.out.println(s.replaceAll("a", "o"));
		
		
		
		String s2 = new String();
		System.out.println(s2.isEmpty());
	      s2=s2.concat("hello");
			System.out.println(s2.isEmpty());
			System.out.println();
			String s3 = new String();
			System.out.println(s3.isEmpty());
			System.out.println(s3.isBlank());
			System.out.println();
			s3 = s3.concat(" ");
			System.out.println(s3.isEmpty());
			System.out.println(s3.isBlank());
//			use for remove the space from leading and trailing
			String s4 = "  Raja Rama Mohana raya";
			System.out.println(s4);
			String trims1 = s4.trim();
			System.out.println(trims1);
			
	}
	
}