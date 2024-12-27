package org.lld.designpattern.behavioural.chain_of_responsibility;

public class Client {
    public static void main(String[] args) {

        HttpMethodHandler http = new HttpMethodHandler("POST");
        AuthZHandler authZ = new AuthZHandler("b89093");
        ContentTypeHeader contentType = new ContentTypeHeader("JSON");

        http.next = authZ;
        authZ.next = contentType;

        String completeHeader = http.addHeader("www.google.com");
        System.out.println(completeHeader);

    }
}
