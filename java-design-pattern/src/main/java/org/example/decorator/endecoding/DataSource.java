package org.example.decorator.endecoding;

/**
 * Source: https://refactoring.guru/design-patterns/decorator/java/example#:~:text=Decorator%20is%20a%20Conceptual%20pattern,decorators%20follow%20the%20same%20interface.
 */
public interface DataSource {
    void writeData(String data);
    String readData();
}
