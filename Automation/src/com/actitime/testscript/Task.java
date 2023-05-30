package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class Task extends BaseClass{
	@Test(groups= {"smoketest","regressiontest"})
public void creteTask() {
		Reporter.log("creteTask",true);
	}
	@Test(groups= {"smoketest","regressiontest"})
	public void ModifyTask() {
			Reporter.log("ModifyTask",true);
		}
	@Test(groups= {"smoketest","regressiontest"})
	public void DeleteTask() {
			Reporter.log("DeleteTask",true);
		}
}

