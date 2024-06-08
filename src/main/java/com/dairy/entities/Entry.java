package com.dairy.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="entries")
public class Entry {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private Date entrydate;
	private String desc;
	
	private long userid;
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getEntrydate() {
		return entrydate;
	}
	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Entry(long id, Date entrydate, String desc, long userid) {
		super();
		this.id = id;
		this.entrydate = entrydate;
		this.desc = desc;
		this.userid = userid;
	}
	
	
}
