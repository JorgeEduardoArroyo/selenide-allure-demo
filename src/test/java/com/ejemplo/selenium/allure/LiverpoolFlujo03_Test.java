package com.ejemplo.selenium.allure;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

class LiverpoolFlujo03_Test {

	   @BeforeAll
	    static void setup() {
		    WebDriverManager.chromedriver().setup();
	        Configuration.browser = "chrome";
	        Configuration.headless = false;
	    }

		@Test
		void test() {
			
			/*
			 
		    Open Homepage
			Navigate to Store Locator page
			Enter store detail and Search
			Open Homepage
			Navigate to Preguntas Frecuentes (FAQ) from Footer Page (Esta en Soporte al cliente -> Ayuda)
			Navigate to Credito page from FAQ Page (Esta en Soporte al cliente -> Esta en Ayuda)
			Navigate to Contacto y notificaciones page from FAQ Page (Esta en Soporte al cliente -> Esta en Ayuda > Terminos y Condiciones)
			
			Navigate to mesa de regalos page from FAQ Page (Esta en Soporte al cliente -> Esta en Ayuda)
			Navigate to terminos y condiciones page from FAQ Page (Esta en Soporte al cliente -> Esta en Ayuda)
			Navigate to Contacto y notificaciones page from FAQ Page (Esta en Soporte al cliente -> Esta en Ayuda > Terminos y Condiciones)
			Navigate to seguros from Footer Page FAQ Page (Menu principal)

			 */
			
			//Open Homepage
	        open("https://www.liverpool.com.mx");
	        sleep(2000);
	        
	        
	        
	        //Navigate to Store Locator page
	        $("div.a-header__strongLink").shouldBe(Condition.visible).click();
	        sleep(2000);
	        
	        $("#CP").shouldBe(Condition.visible).click();
	        sleep(2000);
	        
	        
	        //Enter store detail and Search
	        $("#CP").shouldBe(Condition.visible).setValue("09200").pressEnter();
	        sleep(2000);
	        
	        $$("ul.stores-option li.stores-list").findBy(Condition.text("Liverpool - Tezontle"))
	        .$("input[type='radio']").click();
	        sleep(2000);
	        
	        
	        
	        //Open Homepage
	        $("img[alt='Liverpool Logo']").click();
	        sleep(2000);
	        
	        
	        
	        //Navigate to Preguntas Frecuentes (FAQ) from Footer Page (Esta en Soporte al cliente -> Ayuda)
	        $("footer").scrollIntoView(true);
	        sleep(2000);
	        
	        $$("a.a-footer__link").findBy(Condition.text("Ayuda")).shouldBe(Condition.visible).click();
	        sleep(2000);
	        
	        $$("a").findBy(Condition.text("Preguntas frecuentes")).scrollIntoView(true);
	        sleep(2000);
	        
	        

	        
	        //Navigate to Credito page from FAQ Page (Esta en Soporte al cliente -> Esta en Ayuda)
	        $$("a").findBy(Condition.text("Crédito")).shouldBe(Condition.visible).click();
	        sleep(4000);
	        
	        
	        
	        //Navigate to Contacto y notificaciones page from FAQ Page (Esta en Soporte al cliente -> Esta en Ayuda > Terminos y Condiciones)
	        $("footer").scrollIntoView(true);
	        sleep(2000);
	        
	        $$("a.a-footer__link").findBy(Condition.text("Ayuda")).shouldBe(Condition.visible).click();
	        sleep(2000);
	        
	        $$("a").findBy(Condition.text("Términos y condiciones")).scrollIntoView(true);
	        sleep(4000);
	        
	        
	        
	        //Navigate to mesa de regalos page from FAQ Page (Esta en Soporte al cliente -> Esta en Ayuda)
	        $("footer").scrollIntoView(true);
	        sleep(2000);
	        
	        $$("a.a-footer__link").findBy(Condition.text("Ayuda")).shouldBe(Condition.visible).click();
	        sleep(2000);
	        
	        $$("a").findBy(Condition.text("Mesa de regalos")).scrollIntoView(true);
	        sleep(2000);
	        
	        $$("a").findBy(Condition.text("Mesa de regalos")).shouldBe(Condition.visible).click();
	        sleep(2000); 
	        
	        
	        
	        //Navigate to terminos y condiciones page from FAQ Page (Esta en Soporte al cliente -> Esta en Ayuda)
	        $("footer").scrollIntoView(true);
	        sleep(2000);
	        
	        $$("a.a-footer__link").findBy(Condition.text("Ayuda")).shouldBe(Condition.visible).click();
	        sleep(2000);
	        
	        $$("a").findBy(Condition.text("Términos y condiciones")).scrollIntoView(true);
	        sleep(2000);    
	        
	        $$("a").findBy(Condition.text("Términos y condiciones")).shouldBe(Condition.visible).click();
	        sleep(2000); 
	        
	        
	        //Navigate to Contacto y notificaciones page from FAQ Page (Esta en Soporte al cliente -> Esta en Ayuda > Terminos y Condiciones)
	        $("footer").scrollIntoView(true);
	        sleep(2000);
	        
	        $$("a.a-footer__link").findBy(Condition.text("Ayuda")).shouldBe(Condition.visible).click();
	        sleep(2000);
	        
	        
	        $$("a").findBy(Condition.text("Términos y condiciones")).scrollIntoView(true);
	        sleep(2000);   
	        
	        
	        
	        //Navigate to seguros from Footer Page FAQ Page (Menu principal)
	        $("footer").scrollIntoView(true);
	        sleep(2000);
	        
	        
		}
	}
