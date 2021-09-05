package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09;

/*
 * Самообучение по книге:
 * "Изучаем Java. 2е издание.O`Reilly"
 * Перевод на русский язык. ООО "Айдиономикс", 2011
 * Оформление. ООО "Издательство "Эксмо", 2021
 *
 * Код со страниц: 199
 */

/*
 * Наследование
 */

public class Test {
    public static void main(String[] args) {

        Doctor doc = new Doctor();
        doc.worksAtHospital = true;
        doc.treatPatient();

        System.out.println();

        FamilyDoctor fDoc = new FamilyDoctor();
        fDoc.worksAtHospital = false;
        fDoc.makesHouseCalls = true;
        fDoc.treatPatient();
        fDoc.giveAdvice();

        System.out.println();

        Surgeon surgeon = new Surgeon();
        surgeon.worksAtHospital = true;
        surgeon.treatPatient();
        surgeon.makeIncision();
    }
}
