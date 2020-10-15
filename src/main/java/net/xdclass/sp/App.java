package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
import net.xdclass.sp.domain.VideoOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	public static void main(String [] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		testscope(context);
	}

	/**
	 * 匹配内存地址来验证将bean 属性scope设置为singleton是返回是同一个对象
	 *
	 * 匹配内存地址来验证将bean 属性scope设置为prototype是返回不是同一个对象
	 * @param context
	 */
	public static  void  testscope(ApplicationContext context){
		Video video1 = (Video) context.getBean("video");
		Video video2 = (Video) context.getBean("video");

		System.out.println(video1==video2);

	}
}
