package dao;

import model.Course;

public interface UserDAO {

    void insert(Course course);

    Course findByCourseId(int courseId);
}
