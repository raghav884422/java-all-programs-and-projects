package customiseExpections;

public class invalidUsernamePAssWord extends Exception {
      @Override
    public String getMessage() {
    	// TODO Auto-generated method stub
    	return "Invailed username or passWord..please try again";
    }
}
