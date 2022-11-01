package kodlamaio;

import kodlamaio.entities.Course;
import kodlamaio.business.CourseManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.core.logging.MailLogger;
import kodlamaio.dataAccess.HibernateCourseDao;


public class Main {


		public static void main(String[]args) throws Exception {
			Course course1=new Course(1,"PHP","Engin Demiroğ","WEB",10);
			Logger[] loggers= { new DatabaseLogger(), new FileLogger(),new MailLogger()};
			
			CourseManager courseManager=new CourseManager(new HibernateCourseDao(), loggers);
			courseManager.add(course1);
			
			
		}

	}


