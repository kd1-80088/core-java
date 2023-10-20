package com.sunbeam;

public class Labor implements Emp {
	private int hours;
	private int rate;

	public Labor() {

	}

	public Labor(int hours, int rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public double getSal() {
		return this.hours * this.rate;
	}

	@Override
	public double calcIncentives() {
		if (this.hours > 300) {
			return (this.hours * 0.05);
		}
		return 0;
	}

}
