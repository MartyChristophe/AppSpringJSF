package controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SpinnerController {
    private int number1; 

    public SpinnerController() {
		this.setNumber1(10);
	}
    
    public int getNumber1() {
        return number1;
    }
 
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
 }
