package ru.evant.learning_java_2nd_edition_oreilly.aBook.lesson09;

public class FamilyDoctorTest {
    public static void main(String[] args) {
        FamilyDoctor fDoc = new FamilyDoctor();
        fDoc.worksAtHospital = false;
        fDoc.makesHouseCalls = true;
        fDoc.treatPatient();
        fDoc.giveAdvice();
    }
}
