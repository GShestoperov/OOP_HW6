package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudentGroupView {
    Logger logger = Logger.getLogger(StudentView.class.getName());

    public void sendOnConsoleUserGroup(StudentGroup studentGroup) {
        logger.info(studentGroup.toString());
    }
}
