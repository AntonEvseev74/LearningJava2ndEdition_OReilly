package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09;

public class SurgeonTest {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        surgeon.worksAtHospital = true;
        surgeon.treatPatient();
        surgeon.makeIncision();
    }
}
