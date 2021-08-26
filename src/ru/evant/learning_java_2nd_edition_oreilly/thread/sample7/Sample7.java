package ru.evant.learning_java_2nd_edition_oreilly.thread.sample7;

// Пример механизма ожидающего наступление определенного события для запуска потока.

// https://vk.com/bookmarks  Время на видео 53:00

public class Sample7 {
    static final String URL = "http://www.dropbox.com/s/38m1oakpbb3wkzru/Java%20Start.pdf?dl=0";

    public static void main(String[] args) {
        Document doc = new Document();

        Writer[] writers = {
                new Writer(doc, "file1x.pdf"),
                new Writer(doc, "file2x.pdf"),
                new Writer(doc, "file3x.pdf")
        };

        for (Writer writer : writers) writer.start();

        Downloader downloader = new Downloader(URL, doc);
        downloader.start();
    }
}
