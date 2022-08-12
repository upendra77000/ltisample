package com.lti.oops;

public interface Readable {
	final static double pi=3.14;
	public abstract void getName();
}

interface Readable2 {
	public abstract void getName2();
}

interface Readable3 extends Readable, Readable2{
	
}