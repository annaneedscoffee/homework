package enumlab;

public enum Http {
    INFORMATIONAL(100,199), SUCCESS(200,299), REDIRECTION(300,399), CLIENT_ERROR(400,499), SERVER_ERROR(500,599);

    private final int minCode;
    private final int maxCode;

    Http(int minCode, int maxCode) {
        this.minCode = minCode;
        this.maxCode = maxCode;
    }

    static  public String handler(int code){
        Http[] https = values();
        for(Http http : https){
            if (code >= http.minCode && code <=http.maxCode){
                return "Code category: "+http.toString();
            }
        }
        throw new IllegalStateException(code+" is not supported");
    }

}
