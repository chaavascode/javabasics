package com.avis.sub;
import com.avis.base.Base;
public class Sub extends Base{

protected void wai(){
		System.out.println(Sub.class.getName());
	}

	public static void main(String[] args){
		System.out.println("In sub main method");
	}

}
