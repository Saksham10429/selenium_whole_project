package test_ng;

import org.testng.annotations.Test;

public class groups {
	@Test(groups= {"smoke"},priority=0)
	public void testcase1() {
		System.out.println("smoke testing");
	}
	
	@Test(groups= {"regression"},priority=0)
	public void testcase2() {
		System.out.println("regression testing");
	}
	
	@Test(groups= {"regression"},priority=1)
	public void testcase3() {
		System.out.println("regression testing");
	}
	
	@Test(groups= {"smoke"},priority=1)
	public void testcase4() {
		System.out.println("smoke testing");
	}

}
