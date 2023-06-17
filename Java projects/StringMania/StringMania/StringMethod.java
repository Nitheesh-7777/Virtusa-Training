package utility;

public class StringMethod {
    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String convertToLowercase() {
        if (input != null) {
            return input.toLowerCase();
        }
        return "";
    }

    public String convertToUppercase() {
        if (input != null) {
            return input.toUpperCase();
        }
        return "";
    }

    public String getFirstCharacter() {
        if (input != null && !input.isEmpty()) {
            return String.valueOf(input.charAt(0));
        }
        return "";
    }

    public int getStringLength() {
        if (input != null) {
            return input.length();
        }
        return 0;
    }

    public String trimString() {
        if (input != null) {
            return input.trim();
        }
        return "";
    }

    public String upper(String input2) {
        return null;
    }

    public String firstCharacter(String input2) {
        return null;
    }

    public String length(String input2) {
        return null;
    }

    public String trim(String input2) {
        return null;
    }

    public String lower(String input2) {
        return null;
    }
}

