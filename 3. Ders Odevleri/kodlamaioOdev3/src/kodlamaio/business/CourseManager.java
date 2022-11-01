package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.entities.Course;

public class CourseManager {

	private CourseDao courseDao;

	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {

		if (course.getCoursePrice() <= 0) {

			throw new Exception("Kurs ücreti 0'dan büyük olmalı");
		} 
		if (course.getCategories() =="Yazılım") {

			throw new Exception(course.getCategories()+": Bu kategori var tekrarlanamaz");
		} if (course.getCourseName()=="Java") {

			throw new Exception(course.getCourseName()+": Bu kurs var tekrarlanamaz");
		} courseDao.add(course);

			for (Logger logger : loggers) {
				logger.log(course.getCourseName());
			
		}

	}
}