package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sim 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int sno;
private String provider;
private String type;
private double cost;
private long phno;

public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getProvider() {
	return provider;
}
public void setProvider(String provider) {
	this.provider = provider;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}


}
