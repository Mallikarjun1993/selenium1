package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class Project extends BaseClass{
	@Test(groups= {"smoketest","regressiontest"})
public void creteProject() {
		Reporter.log("creteProject",true);
	}
	@Test(groups= {"smoketest","regressiontest"})
	public void ModifyProject() {
			Reporter.log("ModifyProject",true);
		}
	@Test(groups= {"smoketest","regressiontest"})
	public void DeleteProject() {
			Reporter.log("DeleteProject",true);
		}
}