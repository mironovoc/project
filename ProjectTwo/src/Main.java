import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String inputUser = input.nextLine();

        CheckText checkText = new CheckText();
        checkText.setExample(inputUser);
        char action = 0;
        try {
            action = checkText.getAction();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String[] dataValues = checkText.getValues();






        TextCalculate textCalculate = new TextCalculate();
        textCalculate.setValues(dataValues);
        textCalculate.setAction(action);


        textCalculate.ShowTime();
    }
}