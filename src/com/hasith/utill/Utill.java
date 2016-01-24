package com.hasith.utill;

import com.hasith.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasith on 1/24/2016.
 */
public class Utill {

    public static List<Student> getAllStudent(){
        List<Student> students = new ArrayList<>();
        Student kamal = new Student("1", "Kamal", 23, "0770776543");
        Student nimal = new Student("2", "Nimal", 24, "0770290443");
        Student sunil = new Student("3", "Sunil", 22, "0713333455");
        Student ranil = new Student("4", "Ranil", 27, "0714342222");
        Student janith = new Student("5", "Janith", 30, "07244444444");
        students.add(kamal);
        students.add(nimal);
        students.add(sunil);
        students.add(ranil);
        students.add(janith);
        return students;
    }
}
