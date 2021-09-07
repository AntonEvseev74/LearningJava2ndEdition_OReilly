package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09.example3;

/* страница 216 */

public class ProgramTest2 {
    public static void main(String[] args) {
        Animal3[] animals = new Animal3[5];
        animals[0] = new Dog3();
        animals[0].picture = "СОБАКА";
        animals[1] = new Cat3();
        animals[1].picture = "КОТ";
        animals[2] = new Wolf3();
        animals[2].picture = "ВОЛК";
        animals[3] = new Hippo3();
        animals[3].picture = "БЕГИМОТ";
        animals[4] = new Lion3();
        animals[4].picture = "ЛЕВ";

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].roam();
        }
    }
}
