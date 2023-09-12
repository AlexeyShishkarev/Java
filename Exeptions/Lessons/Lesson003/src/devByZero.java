public class devByZero extends ArithmeticException{

    public devByZero(String message){
        super(message);
    }

    public devByZero(){
        super("Нельзя делить на 0!!!");
    }
}
