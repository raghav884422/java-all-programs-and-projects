package rough;

public class main {
	
    public static void main(String[] args) {
        Abc.DatabaseConfig.setConfig("jdbc:mysql://localhost:3306/mydb", "admin", "password123");
        System.out.println("Initial Configuration:");
        System.out.println(Abc.DatabaseConfig.getConnectionString()); 

        Abc.DatabaseConfig.setConfig("jdbc:postgresql://localhost:5432/newdb", "user", "newpass456");
        System.out.println("\nUpdated Configuration:");
        System.out.println(Abc.DatabaseConfig.getConnectionString()); 
      }
  }

}
