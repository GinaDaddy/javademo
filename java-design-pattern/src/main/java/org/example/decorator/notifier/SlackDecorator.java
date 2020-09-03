package org.example.decorator.notifier;

public class SlackDecorator extends BaseDecorator {
    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        return super.send(message) + " through Slack";
    }
}
