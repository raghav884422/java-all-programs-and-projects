package book;
class book {
	String title;
	int pages;
   public book(String title ,int pages) {
	   this.title = title;
	   this.pages=pages;
	   
   }
   public book(book ref) {
	   this.pages=ref.pages;
	   this.title= ref.title;
   }
   public void displayDetails() {
	   System.out.println("book title: "+title+"no. of pages: "+pages);
   }
}