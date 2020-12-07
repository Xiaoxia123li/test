package com.fix.entity;

import org.apache.ibatis.type.Alias;

@Alias("wisdom")
public class Wisdom {
	int id;
	String info;
	String author;

//	List<Wisdom> list;

	public Wisdom() {	}

	public Wisdom(String info, String author) {
		super();
		this.info = info;
		this.author = author;

	}
	public Wisdom(int id, String info, String author) {
		super();
		this.id = id;
		this.info = info;
		this.author = author;

	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "\nWisdom [id=" + id + ", info=" + info + ", author=" + author + "]\n";
	}

}
