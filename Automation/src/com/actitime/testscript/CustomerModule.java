package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule extends BaseClass{
	@Test(groups= {"smoketest","regressiontest"})
public void cretecustomer() {
		Reporter.log("cretecustomer",true);
	}
	@Test(groups= {"smoketest","regressiontest"})
	public void Modifycustomer() {
			Reporter.log("Modifycustomer",true);
		}
	@Test(groups= {"smoketest","regressiontest"})
	public void Deletecustomer() {
			Reporter.log("Deletecustomer",true);
		}
}
