package ua.ihorshulha.ht_09.structural.facade;

public class Student {
    public void doHomeWorkBeforeDeadline(DayBook dayBook){
        if(dayBook.isHasHomeWork()){
            System.out.println("Student is doing homework");
        } else {
            System.out.println("Student plays game");
        }
    }
}
