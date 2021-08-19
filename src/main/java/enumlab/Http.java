package enumlab;

public enum Http {
    INFORMATIONAL(1), SUCCESS(2), REDIRECTION(3), CLIENT_ERROR(4), SERVER_ERROR(5);

    private final int code;

    Http(int code) {
        this.code = code;
    }

    static  public String handler(int code){
        Http[] https = values();
        for(Http http : https){
            if (code/100 == http.code){
                return "Code category: "+http.toString();
            }
        }
        throw new IllegalStateException(code+" is not supported");
    }

}
