package com.jsp.springbootcrud.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Mobile {
	@Id
private int id;
private String name;
private double mrp;
private int ram;
private String cPin;
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
public double getMrp() {
	return mrp;
}
public void setMrp(double mrp) {
	this.mrp = mrp;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public String getcPin() {
	return cPin;
}
public void setcPin(String cPin) {
	this.cPin = cPin;
}

}
