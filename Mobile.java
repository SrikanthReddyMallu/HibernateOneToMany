package com.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String brand;
private double cost;
private String color;
private String ram;
@OneToMany
private List<Sim> sims;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getRam() {
	return ram;
}
public void setRam(String ram) {
	this.ram = ram;
}
public List<Sim> getSims() {
	return sims;
}
public void setSims(List<Sim> sims) {
	this.sims = sims;
}

}
