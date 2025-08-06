package com.ejemplo.selenium.allure;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class LiverpoolFlujo02_Test {

	   @BeforeAll
	    static void setup() {
		    WebDriverManager.chromedriver().setup();
	        Configuration.browser = "chrome";
	        Configuration.headless = false;
	    }

		@Test
		void test() {

			open("https://www.liverpool.com.mx/tienda/home");
			sleep(2000);
			
	        $("#mainSearchbar").shouldBe(Condition.visible);
	        $("#mainSearchbar").click();
	        sleep(2000);
	        
	        $("#mainSearchbar").setValue("telefonos celulares").pressEnter();
	        sleep(10000);

	        $("#img_14").shouldBe(Condition.visible);
	        sleep(2000);
	        
	        $("#img_14").click();
	        sleep(2000);

	        String tituloProducto = $("h1.a-product__information--title")
	        	    .shouldBe(Condition.visible)
	        	    .getText();

	       System.out.println("Título del producto: " + tituloProducto);
	       sleep(2000);
	       
	        $("img[alt='Liverpool Logo']").click();
	        sleep(2000);
	        
		}
	}