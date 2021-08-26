package ru.evant.learning_java_2nd_edition_oreilly.thread.sample7;

public class Document {
    private volatile byte[] data;

    public byte[] getData() { return data; }

    public void setData(byte[] data) { this.data = data; }

    public boolean isReady() { return data != null; }
}
