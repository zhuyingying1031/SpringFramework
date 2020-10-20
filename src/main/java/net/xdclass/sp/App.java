package net.xdclass.sp;

import net.xdclass.sp.aop.AnnotationAppConfig;
import net.xdclass.sp.config.CustomConfig;
import net.xdclass.sp.domain.Video;
import net.xdclass.sp.domain.Video2;
import net.xdclass.sp.domain.VideoOrder;
import net.xdclass.sp.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {


	public static void main(String[] args) {



			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationAppConfig.class);
			VideoService videoService = (VideoService) context.getBean("videoService");
			videoService.findById(2);

		/*VideoService videoService = (VideoService) context.getBean("videoService");
		videoService.findById(2);*/
		/*Video video = (Video) context.getBean("video");
		video.init();*/

		//VideoOrder videoOrder=(VideoOrder) context.getBean("videoOrderName");


	}




}
