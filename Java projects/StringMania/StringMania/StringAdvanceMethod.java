package utility;

public class StringAdvanceMethod {
    private String input1;
    private String input2;

    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

    public String concatenateStrings() {
        return input1 + input2;
    }

    public String[] splitStrings() {
        return input1.split(input2);
    }

    public String getFirstCharacter() {
        if (input1 != null && !input1.isEmpty()) {
            return String.valueOf(input1.charAt(0));
        }
        return "";
    }

    public int findIndexOfString() {
        if (input1 != null && input2 != null) {
            return input1.indexOf(input2);
        }
        return -1;
    }

    public String trimString() {
        if (input1 != null) {
            return input1.trim();
        }
        return "";
    }

    public String concat(String input12, String input22) {
        return null;
    }

    public String split(String input12, String input22) {
        return null;
    }

    public String indexOf(String input12, String input22) {
        return null;
    }
}

