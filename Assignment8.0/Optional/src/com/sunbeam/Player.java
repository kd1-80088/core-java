package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

abstract public class Player {
	int id;
	String name;
	int age;
	int matchesPlayed;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, int age, int matchesPlayed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id = ");
		this.id = sc.nextInt();
		System.out.print("Enter Name = ");
		this.name = sc.next();
		System.out.print("Enter Age = ");
		this.age = sc.nextInt();
		System.out.print("Matches Played = ");
		this.matchesPlayed = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return age == other.age && id == other.id && matchesPlayed == other.matchesPlayed
				&& Objects.equals(name, other.name);
	}

}
