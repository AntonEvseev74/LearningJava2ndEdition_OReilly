package ru.evant.learning_java_2nd_edition_oreilly.thread.sample7;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Downloader extends Thread {
    private final String link;
    private final Document doc;

    public Downloader(String link, Document doc) {
        this.link = link;
        this.doc = doc;
    }

    @Override
    public void run() {
        System.out.println("Файл скачивается...");

        synchronized (doc) {
            byte[] data = downloadFile();
            if (data == null) throw new RuntimeException("Скачать не удалось");

            doc.setData(data);
            doc.notifyAll(); // Всем ожидающим потокам, которые ждут событие связанное с этим документом(объектом) дается отмашка, что документ(объект) готов
        }
    }

    private byte[] downloadFile() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            URL url = new URL(link);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            try {
                InputStream stream = connection.getInputStream();
                byte[] buf = new byte[1024];
                int read;

                while ((read = stream.read(buf)) != -1) {
                    bos.write(buf, 0, read);
                }
            } finally {
                connection.disconnect();
            }
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }

        return bos.toByteArray();
    }
}
