package org.example.decorator.notifier;

public class Demo {
    public static void main(String[] args) {
        Notifier notifier = new SlackDecorator(
                                new SMSDecorator(
                                    new NotifierImpl(

                                    )));

        String hello_brian = notifier.send("Hello Brian");
        System.out.println(hello_brian);

    }
}
