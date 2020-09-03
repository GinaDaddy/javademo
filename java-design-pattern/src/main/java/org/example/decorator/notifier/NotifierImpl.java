package org.example.decorator.notifier;

public class NotifierImpl implements Notifier {
    @Override
    public String send(String message) {
        return "Message " + message + " was sent";
    }
}
