package net.xdclass.sp.service;

import net.xdclass.sp.config.CustomConfig;
import net.xdclass.sp.domain.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("videoService")
public class VideoServiceImpl  implements VideoService {

	@Autowired
	private CustomConfig customConfig;

	public int save(Video video) {
		System.out.println("保存video");
		return 1;
	}
	public Video findById(int id) {
		System.out.println("根据id找视频");
		System.out.println("Host---------"+customConfig.getHost());
		return new Video();
	}
}