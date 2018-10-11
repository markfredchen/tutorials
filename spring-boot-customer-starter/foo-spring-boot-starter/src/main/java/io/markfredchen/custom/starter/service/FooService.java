package io.markfredchen.custom.starter.service;

/**
 * @author markfredchen
 * @since 2018/10/11
 */
public class FooService {
    private final String fooMessage;
    private final String barMessage;

    public FooService(String fooMessage, String barMessage) {
        this.fooMessage = fooMessage;
        this.barMessage = barMessage;
    }

    public String getFooMessage() {
        return this.fooMessage;
    }

    public String getBarMessage() {
        return this.barMessage;
    }
}
