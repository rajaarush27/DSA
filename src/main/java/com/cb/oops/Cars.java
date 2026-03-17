package com.cb.oops;

public class Cars/* implements Comparable<Cars> */{

	private int price;
	private int speed;
	private String color;

	public Cars() {

	}

	public Cars(int price, int speed, String color) {
		this.price = price;
		this.speed = speed;
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "price=" + price + ", speed=" + speed + ", color=" + color;
	}

	/*
	 * @Override public int compareTo(Cars o) {
	 * 
	 * return this.price - o.price; }
	 */

}
