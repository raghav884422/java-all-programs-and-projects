package singletonDesignPattern;

public class Priminster {
   private static Priminster primMinister = null;
   String name;
   String party;
   int age;
   int term;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getParty() {
	return party;
}
public void setParty(String party) {
	this.party = party;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getTerm() {
	return term;
}
public void setTerm(int term) {
	this.term = term;
}
public Priminster(String name, String party, int age, int term) {
	super();
	this.name = name;
	this.party = party;
	this.age = age;
	this.term = term;
}
public static Priminster getInstance(String name,String party, int age, int term) {
	if(primMinister==null) {
		primMinister = new Priminster(name, party, age, term);
	}
	return primMinister;
}

}
