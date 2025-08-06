package com.ejemplo.selenium.allure.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class locatorReader {
	
	public static class LocatorReader {
	    private Properties props = new Properties();

	    public LocatorReader(String fileName) {
	        try (InputStream input = getClass().getClassLoader().getResourceAsStream(fileName)) {
	            if (input == null) {
	                throw new RuntimeException("Archivo de propiedades no encontrado: " + fileName);
	            }
	            props.load(input);
	        } catch (IOException e) {
	            throw new RuntimeException("Error al cargar propiedades: " + fileName, e);
	        }
	    }

	    public String get(String key) {
	        return props.getProperty(key);
	    }
	}

}
