package net.xdclass.sp.domain;

public class Video {
	private int id;

	private String title;


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
