package com.Testing.Annotation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import net.bytebuddy.asm.Advice.Return;

public class Retry_Class implements IRetryAnalyzer{
	
	
	
	int start =1;
	int end =3;

	public boolean retry(ITestResult result) {
		
		if (start <= end) {
		
			start++;
		
		return true; // Execute
		
		}
	
		return false; // stop the Execution
	}

	
}


