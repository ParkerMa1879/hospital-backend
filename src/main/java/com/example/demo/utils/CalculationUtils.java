package com.example.demo.utils;

import com.example.demo.assessment.recognition.MMSE.MMSE;


import java.lang.reflect.*;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CalculationUtils {

	public static int getSumScore(Object object, int start, int end){
		int sum = 0;
		List<String> fields;
		for (int x = start; x <= end; x ++){
			String methodName="getAnswer" + Integer.toString(x);
			Method getValueMethod = null;
			try{
				getValueMethod = object.getClass().getMethod(methodName);
			}catch (NoSuchMethodException e){
				System.out.println("No such Method");
			}
			String value = "";
			try{
				value = (String) getValueMethod.invoke(object);
			}catch(IllegalAccessException | InvocationTargetException e){
				System.out.println("Illegal access or Invocation target");
			}
			if (!value.equals("")){
				sum += Integer.parseInt(value);
			}
		}
		return sum;
	}

}
