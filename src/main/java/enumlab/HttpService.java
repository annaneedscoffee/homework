package enumlab;

public class HttpService {
    public static void handleHttpCode(int httpCode) {
        System.out.println(Http.handler(httpCode));
    }
    public static void main(String[] args){

        handleHttpCode(69);
    }
}
