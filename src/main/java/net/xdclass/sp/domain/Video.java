package net.xdclass.sp.domain;

import java.util.List;
import java.util.Map;

public class Video {
	private int id;

	private String title;

	private List<String> chapterList;


	private Map<Integer,String> videoMap;

	public List<String> getChapterList() {
		return chapterList;
	}

	public void setChapterList(List<String> chapterList) {
		this.chapterList = chapterList;
	}

	public Map<Integer, String> getVideoMap() {
		return videoMap;
	}

	public void setVideoMap(Map<Integer, String> videoMap) {
		this.videoMap = videoMap;
	}

	public Video() {
	}

	public Video(String title) {
		System.out.println("构造函数方式注入");
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		System.out.println("set注入");
		this.title = title;
	}
}
