package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
import net.xdclass.sp.domain.Video2;
import net.xdclass.sp.domain.VideoOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	public static void main(String [] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//testscope(context);
	//	test(context);

		//testBean(context);
		testInitAndDestroy(context);
	}

	/**
	 * 作用域验证
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

	/**
	 * 注入方式验证
	 */
	public static  void  test(ApplicationContext context){
		/**
		 * 构造函数注入
		 */
		/*Video video = (Video) context.getBean("video");
		VideoOrder videoOrder=(VideoOrder)context.getBean("videoOrder");
		System.out.println(videoOrder.getVideo().getTitle());*/

		/**
		 * List-Map类型的注入验证
		 */
		Video2 video2 = (Video2) context.getBean("video2");
		System.out.println("list的值"+video2.getChapterList().get(1));
		System.out.println("map的值"+video2.getVideoMap().get(2));
	}

	/**
	 * Bean之间的依赖和继承验证
	 */
	public static  void  testBean(ApplicationContext context) {
		Video2 video2 = (Video2) context.getBean("video2");
		System.out.println("Title的值"+video2.getTitle());
		System.out.println("Summary的值"+video2.getSummary());
	}

	/**
	 * 生命周期的init和destroy方法验证
	 */

	public static  void  testInitAndDestroy(ApplicationContext context) {
		Video video = (Video) context.getBean("video");
		((ClassPathXmlApplicationContext) context).registerShutdownHook();
	}
}
