package dao;

import model.Course;

public interface CourseDAO {

    void insert(Course course);

    Course findByCourseId(int courseId);
}
