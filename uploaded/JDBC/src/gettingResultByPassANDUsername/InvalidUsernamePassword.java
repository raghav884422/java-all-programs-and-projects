package gettingResultByPassANDUsername;

public class InvalidUsernamePassword extends Exception{
@Override
public String getMessage() {
	// TODO Auto-generated method stub
	return "Please enter valid username and passWord";
}
}
