package org.lld.designpattern.behavioural.chain_of_responsibility;

public class ContentTypeHeader implements URLHandler {

    private final String contentType;

    public URLHandler next;

    public ContentTypeHeader(String contentType) {
        this.contentType = contentType;
    }


    @Override
    public String addHeader(String header) {
        if (contentType != null) {
            header = header + "\n" + contentType;
        }
        if (next != null) {
            return next.addHeader(header);
        }
        return header;
    }
}
