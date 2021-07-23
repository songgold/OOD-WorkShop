package MyRange;

public class MyRange {

    public static final int ASCII_VALUE_OF_1 = 48;
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public int getStart() {
        if(isStartWithInclude()) {
            return this.input.charAt(1) - ASCII_VALUE_OF_1;
        }
        return this.input.charAt(1) - 47;
    }

    public boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }
    public int getEnd(){
        if(isEndWithInclude()){
            return this.input.charAt(3) - ASCII_VALUE_OF_1;
        }
        else{
            return this.input.charAt(3) - 48;
        }
    }

    public String getResult() {
        int startNumber = getStart();
        int endNumber = getEnd();
        return "12345";
    }
}