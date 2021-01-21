package com.example.demo.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

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

	public static void saveFile(String uploadDir, String fileName,
								MultipartFile multipartFile) throws IOException {
		Path uploadPath = Paths.get(uploadDir);

		if (!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
		}

		try (InputStream inputStream = multipartFile.getInputStream()) {
			Path filePath = uploadPath.resolve(fileName);
			Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException ioe) {
			throw new IOException("Could not save image file: " + fileName, ioe);
		}
	}

}
