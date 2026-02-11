package Comparable;


	class Person implements Comparable<Person> {
	    private String name;
	    private int age;

	    // TODO: Implement constructor, compareTo, and other necessary methods
	    public Person (String name, int age){
	        this.name= name;
	        this.age = age;
	    }
	    public int compareTo(Person p){
	       if(this.age>p.age) {
	         return 1;
	       }
	       if(this.age<p.age) {
	         return -1;
	       }
	       else{
	        return 0;
	       }
	    }
	    public String toString() {
	        return "Person{name='"+name+"', age="+age+"}";
	    }
}
