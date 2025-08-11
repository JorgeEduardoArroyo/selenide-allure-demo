package com.ejemplo.selenium.allure;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.*;

class LiverpoolFlujo01_Test {

	   @BeforeAll
	    static void setup() {
		    WebDriverManager.chromedriver().setup();
	        Configuration.browser = "chrome";
	        Configuration.headless = false;
	    }

	    @Test
	    @Severity(SeverityLevel.CRITICAL)
	    @Description("Verifica el test 01 exitoso")
	    @Story("Test01")
		void test() {

			open("https://www.liverpool.com.mx/tienda/home");
			sleep(2000);
			
			System.out.println("prueba impresion 01");
			
	        $("#mainSearchbar").shouldBe(Condition.visible);
	        $("#mainSearchbar").click();
	        sleep(2000);
	        
	        $("#mainSearchbar").setValue("telefonos celulares").pressEnter();
	        sleep(10000);

	        $("img[alt*='Samsung Galaxy A16 Super AMOLED 6.7 pulgadas']").shouldBe(Condition.visible);
	        sleep(2000);
	        
	        $("#img_0").click(); 
	        sleep(2000);
	        
	        $("img[alt='Liverpool Logo']").click();
	        sleep(2000);
	        
		}
	}
