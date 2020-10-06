import util.Input;
public class InputTest{
    public static void main(String[] args) {
        Input userInput = new Input();
        userInput.getString();
        userInput.getString("Give me a sentence");
        userInput.yesNo();
        userInput.getInt(1,10);
        userInput.getInt();
        userInput.getDouble(2,10);
        userInput.getDouble();
    }
}
