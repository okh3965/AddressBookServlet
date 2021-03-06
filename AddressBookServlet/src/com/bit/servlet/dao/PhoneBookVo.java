package com.bit.servlet.dao;


public class PhoneBookVo {

	//field
	private Long id;
	private String name;
	private String hp;
	private String tel;
	
	//constructors
	public PhoneBookVo() {
		
	}
	
	public PhoneBookVo(String name, String hp, String tel) {
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}
	
	public PhoneBookVo(Long id, String name, String hp, String tel) {
		this(name, hp, tel);
		this.id = id;
	}

	// getter, setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	//print out
	@Override
	public String toString() {
		return id + ". " + name + " " + hp + " " + tel + " ";
	}
		
	
}
