package net.xdclass.sp.domain;

import java.util.List;
import java.util.Map;

public class Video {
	private int id;

	private String title;

	public void  init(){
		System.out.println("init");
	}

	public void  destroy(){
		System.out.println("destroy");
	}
	public Video() {
	}

	public Video(String title) {
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
