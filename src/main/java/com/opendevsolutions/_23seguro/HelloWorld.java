package com.opendevsolutions._23seguro;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class HelloWorld implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String birthDate;
	private java.lang.Integer age;
	private java.lang.String magicString;

	public HelloWorld() {
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.String getMagicString() {
		return this.magicString;
	}

	public void setMagicString(java.lang.String magicString) {
		this.magicString = magicString;
	}

	public java.lang.String getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(java.lang.String birthDate) {
		this.birthDate = birthDate;
	}

	public HelloWorld(java.lang.String birthDate, java.lang.Integer age,
			java.lang.String magicString) {
		this.birthDate = birthDate;
		this.age = age;
		this.magicString = magicString;
	}

}