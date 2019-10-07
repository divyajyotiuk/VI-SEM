/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author root
 */
public class Addition extends ActionSupport {
    private int num1,num2;
    private int result=0;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
        //num1=num1+num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    @Override
    public String execute()
    {
        result=num1+num2;
        return "success";
    }
}
