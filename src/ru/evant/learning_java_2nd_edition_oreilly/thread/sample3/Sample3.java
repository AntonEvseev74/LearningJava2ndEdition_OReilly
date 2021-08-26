package ru.evant.learning_java_2nd_edition_oreilly.thread.sample3;

/* Многопоточность.
 * Потоки.
 * Корректное завершение потока.
 */

class Test3Thread implements Runnable {

    @Override
    public void run() {
        int count = 0;                  //
        String str = "Загрузка: ";      //
        while (!Thread.currentThread().isInterrupted()){
            //System.out.println("Я еще выполняюсь");
            System.out.println(str + " " + count + "%");    //
            count += 20;                                    //
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                return;
            } // end try/catch
        } // end while
    } //end run()
} // end class Test3Thread

public class Sample3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Test3Thread());
        thread.start();

        Thread.sleep(6000);
        thread.interrupt(); // корректный способ попросить поток прерваться
    }
}
