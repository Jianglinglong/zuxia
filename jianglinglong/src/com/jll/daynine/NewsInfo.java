package com.jll.daynine;

public class NewsInfo {
	private int newsId;
	private String newsTitle;
	private String newsContent;
	public NewsInfo(int newsId, String newsTitle, String newsContent) {
		super();
		this.newsId = newsId;
		this.newsTitle = newsTitle;
		this.newsContent = newsContent;
	}
	public void show() {
		System.out.println(newsId+"\t\t\t"+newsTitle+"\t\t\t\t\t"+newsContent);
	}
	
	@Override
	public String toString() {
		return "[newsId=" + newsId + ", newsTitle=" + newsTitle + ", newsContent=" + newsContent + "]";
	}

	public NewsInfo() {
		super();
	}
	public int getNewsId() {
		return newsId;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	
}
