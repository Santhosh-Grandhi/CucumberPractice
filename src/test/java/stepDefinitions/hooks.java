package stepDefinitions;

import io.cucumber.java.Before;

public class hooks {
	
	@Before("@FirstOne")
	public void FirstPreRequisit()
	{
		System.out.println("***********First Pre Requisit Executed**************");
	}
	
	@Before("@SecondOne")
	public void AnotherPreRequisit()
	{
		System.out.println("***********Second Pre Requisit Executed**************");
	}

}
