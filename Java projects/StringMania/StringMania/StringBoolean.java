package utility;

public class StringBoolean {
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

    public boolean checkStringContains() {
        if (input1 != null && input2 != null) {
            return input1.contains(input2);
        }
        return false;
    }

    public boolean checkStringStartsWith(char letter) {
        if (input1 != null) {
            return input1.startsWith(String.valueOf(letter));
        }
        return false;
    }

    public boolean checkStringEndsWith(char letter) {
        if (input1 != null) {
            return input1.endsWith(String.valueOf(letter));
        }
        return false;
    }

    public boolean checkStringsEqual() {
        if (input1 != null && input2 != null) {
            return input1.equals(input2);
        }
        return false;
    }

    public boolean checkStringsEqualIgnoreCase() {
        if (input1 != null && input2 != null) {
            return input1.equalsIgnoreCase(input2);
        }
        return false;
    }

    public boolean contains(String input12, String input22) {
        return false;
    }

    public boolean startsWith(String input12, String input22) {
        return false;
    }

    public boolean endsWith(String input12, String input22) {
        return false;
    }

    public boolean equals(String input12, String input22) {
        return false;
    }

    public boolean equalsIgnoreCase(String input12, String input22) {
        return false;
    }
}
