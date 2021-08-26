package ru.evant.learning_java_2nd_edition_oreilly.thread.sample7;

import java.io.FileOutputStream;
import java.io.IOException;

public class Writer extends Thread {
    private final Document doc;
    private final String path;

    public Writer(Document doc, String path) {
        this.doc = doc;
        this.path = path;
    }

    @Override
    public void run() {
        System.out.println("Сохранение документа в: " + path);

        synchronized (doc) {
            while ( ! doc.isReady()) {
                try {
                    doc.wait(); // Подписываем поток на ожидание события. Ждет пока кто либо вызовет метод no notifyAll()-дать отмашку всем, notify()-дать рандомно отмашку одному потоку
                } catch (InterruptedException e) {
                    return;
                }
            }
        }

        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(doc.getData());
            System.out.println("Успешно: " + path);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
