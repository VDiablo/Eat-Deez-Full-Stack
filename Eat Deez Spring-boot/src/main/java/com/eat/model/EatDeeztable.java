package com.eat.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class EatDeeztable
{
	@Id
	private int fid;
	private String name;
	private String type;
	private String origin;
	private int serving;
	private double price;
	
	
		
	public EatDeeztable() {
		super();
		
	}
	public EatDeeztable(int fid, String name, String type, String origin, int serving, double price) {
		super();
		this.fid = fid;
		this.name = name;
		this.type = type;
		this.origin = origin;
		this.serving = serving;
		this.price = price;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getServing() {
		return serving;
	}
	public void setServing(int serving) {
		this.serving = serving;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "EatDeeztable [fid=" + fid + ", name=" + name + ", type=" + type + ","
				+ " origin=" + origin + ", serving=" + serving + ", price=" + price +"]";
	}
	
	

}
