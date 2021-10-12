import java.util.*;
public class CustomException {
    int balance=1000;
    private String password="password";
    public void formFilling(int age, int withdrawalAmount, String key) throws InvalidAgeException,
            NegativeBankBalanceException, IncorrectPasswordException {
        if(age<18)
            throw new InvalidAgeException();
        if(withdrawalAmount>balance)
            throw new NegativeBankBalanceException();
        if(!key.equals(password))
            throw new IncorrectPasswordException();
    }
}
class InvalidAgeException extends Exception{

}

class NegativeBankBalanceException extends Exception{

}

class IncorrectPasswordException extends Exception{

}


