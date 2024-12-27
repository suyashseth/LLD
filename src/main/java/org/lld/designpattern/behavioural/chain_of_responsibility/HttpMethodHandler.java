package org.lld.designpattern.behavioural.chain_of_responsibility;

public class HttpMethodHandler implements URLHandler {

    private final String httpMethod;

    public URLHandler next;

    public HttpMethodHandler(String httpMethod) {
        this.httpMethod = httpMethod;
    }


    @Override
    public String addHeader(String header) {
        header = httpMethod == null ? header + "\nGET" : header + "\n" + httpMethod;
        if (next != null) {
            return next.addHeader(header);
        }
        return header;
    }
}
