package com.runner;
import com.base.BaseClass;

public class TestClass extends BaseClass{
	public static void main(String[] args) {
		LaunchBrowser("chrome");
		LaunchUrl("https://www.google.com/");
	}

}
