package com.m0921;

public class Car {
//	privateは他のclassからアクセスさせない為に付ける
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
//constructor >> returnを持たない
//	default constructor
	public Car() {
		doors = "closed";
		driver = "seated";
		engine = "on";
		speed = 5;
	}
//parameterized constructor
	public Car(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.driver = driver;
		this.engine = engine;
		this.speed = speed;
				
	}
	
	
//	right click >> Source >> Generate getter and setter
//	get~~()とset~~()を自動で表示してくれる
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0) {
			return "runnning";
		}else {
			return "not running";
		}
	}
}
