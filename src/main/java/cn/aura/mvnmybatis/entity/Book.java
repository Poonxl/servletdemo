package cn.aura.mvnmybatis.entity;

import java.math.BigDecimal;

public class Book {

	//添加备注测试
	private int bid;
	private String bname;
	private String author;
	private BigDecimal price;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Book(int bid, String bname, String author, BigDecimal price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}

	public Book(String bname, String author, BigDecimal price) {
		super();
		this.bname = bname;
		this.author = author;
		this.price = price;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}

}
