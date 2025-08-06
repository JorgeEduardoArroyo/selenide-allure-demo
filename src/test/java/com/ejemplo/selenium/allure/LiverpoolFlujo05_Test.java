package com.ejemplo.selenium.allure;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.ejemplo.selenium.allure.utils.locatorReader.LocatorReader;
import io.github.bonigarcia.wdm.WebDriverManager;

class LiverpoolFlujo05_Test {

	   @BeforeAll
	    static void setup() {
		     WebDriverManager.chromedriver().setup();
	         Configuration.browser = "chrome";
	         Configuration.headless = false; 

	    }

		@Test
		void test() {
			
			LocatorReader locatorReader = new LocatorReader("locators.properties");
			
			String selector0 = locatorReader.get("features.layout.mainSearchbar");
			System.out.println("selector0: " + selector0);
			//selector0: #mainSearchbar
			
			String selector1 = locatorReader.get("features.layout.productcard");
			System.out.println("selector1: " + selector1);
			//selector1: li.m-product__card
			
			String selector2 = locatorReader.get("features.layout.pagination");
			System.out.println("selector2: " + selector2);	
			//selector2: .pagination .page-item a.page-link

			
			open("https://www.liverpool.com.mx/tienda/home");
			sleep(2000);
			
	        $(selector0).shouldBe(Condition.visible);
	        $(selector0).click();
	        sleep(2000);
	        
	        $(selector0).setValue("telefonos celulares").pressEnter();
	        sleep(2000);

	        $("#img_0").shouldBe(Condition.visible);
	        sleep(2000);
	        
	        SelenideElement paginacion = $("nav[aria-label='Pagination']");
	        paginacion.scrollIntoView(true);
	        paginacion.shouldBe(Condition.visible);
	        sleep(2000);
	        
	        ElementsCollection productos = $$(selector1);
	        System.out.println("Número de productos en página 1: " + productos.size());
	        sleep(2000);
	        
	        $$(selector2)
            .findBy(Condition.text("2"))
            .click();
	        sleep(2000);
	        
	        $(selector1).should(Condition.appear);
	        sleep(2000);
	        
	        paginacion.scrollIntoView(true);
	        paginacion.shouldBe(Condition.visible);
	        sleep(2000);
	        
	        ElementsCollection productos2 = $$(selector1);
	        System.out.println("Número de productos en página 2: " + productos2.size());
	        sleep(2000);
	        
	        
	        $$(selector2)
            .findBy(Condition.text("3"))
            .click();
	        sleep(2000);
	        
	        $(selector1).should(Condition.appear);
	        sleep(2000);
	        
	        paginacion.scrollIntoView(true);
	        paginacion.shouldBe(Condition.visible);
	        sleep(2000);
	        
	        ElementsCollection productos3 = $$(selector1);
	        System.out.println("Número de productos en página 3: " + productos3.size());
	        sleep(2000);
	        
	        
	        $$(selector2)
           .findBy(Condition.text("4"))
           .click();
	        sleep(2000);
	        
	        $(selector1).should(Condition.appear);
	        sleep(2000);
	        
	        paginacion.scrollIntoView(true);
	        paginacion.shouldBe(Condition.visible);
	        sleep(2000);
	        
	        ElementsCollection productos4 = $$(selector1);
	        System.out.println("Número de productos en página 4: " + productos4.size());
	        sleep(2000);
	        
	        
	        
	        $$(selector2)
	        .findBy(Condition.text("5"))
            .click();
	        sleep(2000);
	        
	        $(selector1).should(Condition.appear);
	        sleep(2000);
	        
	        paginacion.scrollIntoView(true);
	        paginacion.shouldBe(Condition.visible);
	        sleep(2000);
	        
	        ElementsCollection productos5 = $$(selector1);
	        System.out.println("Número de productos en página 5: " + productos5.size());
	        sleep(2000);
	        
	        
		}

	}