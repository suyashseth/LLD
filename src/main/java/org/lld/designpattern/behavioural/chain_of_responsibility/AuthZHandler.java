package org.lld.designpattern.behavioural.chain_of_responsibility;

public class AuthZHandler implements URLHandler {

    private final String token;

    //This is how we added next chain of Object
    public URLHandler next;

    public AuthZHandler(String token) {
        this.token = token;
    }

    @Override
    public String addHeader(String header) {
        if (token != null) {
            header = header + "\n" + token;
        }
        if (next != null) {
            return next.addHeader(header);
        }
        return header;
    }
}
