

package commonLine;

import org.apache.commons.cli.*;

import java.io.*;

public class InputData {
    static int leftArgs;
    static int rightArgs;
    static double result;
    static String operation;

    public static void main(String[] args) throws ParseException, IOException {
        leftArgs = 0;
        rightArgs = 0;
        result = 0;
        operation = " ";
        Options option = new Options();
        option.addOption("l", "leftArgs", true, "leftOperand");
        option.addOption("r", "rightArgs", true, "rightOperand");
        option.addOption("o", "operation", true, "operation");
        CommandLineParser parser = new GnuParser();
        CommandLine line = parser.parse(option, args);
        args = line.getOptionValues("l");
        setLeftOperand(Integer.parseInt(args[0]));
        System.out.println(leftArgs);
        args = line.getOptionValues("r");
        setRightOperand(Integer.parseInt(args[0]));
        System.out.println(rightArgs);
        args = line.getOptionValues("o");
        System.out.println(setOperation(args[0]));
        result = setOperation(args[0]);
    }

    public static void setLeftOperand(int leftOperand) {
            leftArgs = leftOperand;
    }

    public static void setRightOperand(int rightOperand) {
            rightArgs = rightOperand;
    }
    public static double getResult(){
        return  result;
    }
    public static double setOperation(String operation) {

            switch (operation) {
                case "+": {
                    return leftArgs + rightArgs;

                }
                case "*": {
                    return leftArgs * rightArgs;

                }
                case "-": {
                    return leftArgs - rightArgs;

                }
                case "/": {
                    return leftArgs / rightArgs;
                }

        }
        return 0;
    }
}

