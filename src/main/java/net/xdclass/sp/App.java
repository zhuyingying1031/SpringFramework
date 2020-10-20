package net.xdclass.sp;

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



		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//扫描指定的包，包括子包
		context.scan("net.xdclass");
		//里面完成初始化操作，核心方法
		context.refresh();
		VideoService videoService = (VideoService) context.getBean("videoService");
		videoService.findById(2);
		/*Video video = (Video) context.getBean("video");
		video.init();*/

		//VideoOrder videoOrder=(VideoOrder) context.getBean("videoOrderName");


	}




}
