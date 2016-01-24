package com.hasith.dao.imple;

import com.hasith.dao.StudentManipulation;
import com.hasith.model.Student;
import com.hasith.utill.Utill;

import java.util.List;

/**
 * Created by hasith on 1/24/2016.
 */
public class StudentManipulationImple implements StudentManipulation{

    public List<Student> getStudents(){
        return Utill.getAllStudent();
    }
}
