package org.example.decorator.notifier;

public class BaseDecorator implements Notifier {
    private Notifier wrapee;

    public BaseDecorator(Notifier wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public String send(String message) {
        return wrapee.send(message);
    }
}
