package com.wipro.springassignments;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HijackAroundMethod implements MethodInterceptor{

	@Override 
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date date=new Date();
		
		
		System.out.println("Method name : "
				+ methodInvocation.getMethod().getName()+"\t invoked at:\t"+formatter.format(date));

		long start = System.currentTimeMillis();
        System.out.println("Going to call the method.");
        Object result = methodInvocation.proceed();
        System.out.println("Method execution completed.");
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("************************************************************");
        System.out.println("Method execution time: " + elapsedTime + " milliseconds.");
		
        return result;

	}
}
