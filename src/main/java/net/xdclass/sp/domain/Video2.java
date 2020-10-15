package net.xdclass.sp.domain;

import java.util.List;
import java.util.Map;

public class Video2 {
	private int id;

	private String title;

	private String summary;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

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

	public Video2() {
	}

	public Video2(String title) {
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
		this.title = title;
	}
}
