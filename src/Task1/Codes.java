package Task1;

public enum Codes {
    ERROR5("Code 500"), ERROR4("Code 400"),  ERROR2("Code 200");

    private String code;

    Codes(final String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }
}