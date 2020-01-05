package ua.ihorshulha.ht_09.structural.facade;

public class StudyFlow {

    Student student = new Student();
    Study study = new Study();
    DayBook dayBook = new DayBook();

    public void solveProblem(){
        study.doStudy();
        dayBook.startHomeWork();
        student.doHomeWorkBeforeDeadline(dayBook);
        dayBook.finishHomeWork();
        student.doHomeWorkBeforeDeadline(dayBook);
    }
}
