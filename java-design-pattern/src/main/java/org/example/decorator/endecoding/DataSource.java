package org.example.decorator.endecoding;

/**
 * Source: https://refactoring.guru/design-patterns/decorator
 */
public interface DataSource {
    void writeData(String data);
    String readData();
}
