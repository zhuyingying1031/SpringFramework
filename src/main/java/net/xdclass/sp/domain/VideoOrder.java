package net.xdclass.sp.domain;

public class VideoOrder {

	private int id;

	//订单号
	private String outTradeNo;

	private Video video;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		System.out.println("video对象注入");
		this.video = video;
	}
}
