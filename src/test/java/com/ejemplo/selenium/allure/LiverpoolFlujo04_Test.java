package com.ejemplo.selenium.allure;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import static com.codeborne.selenide.Selenide.*;

class LiverpoolFlujo04_Test {

	   @BeforeAll
	    static void setup() {
		     WebDriverManager.chromedriver().setup();
	         Configuration.browser = "chrome";
	         Configuration.headless = false; 

	    }

	    @Test
	    @Severity(SeverityLevel.CRITICAL)
	    @Description("Verifica el test 04 exitoso")
	    @Story("Test04")
		void test() {
			
			open("https://www.liverpool.com.mx/tienda/home");
			sleep(2000);
			
	        $("#mainSearchbar").shouldBe(Condition.visible);
	        $("#mainSearchbar").click();
	        sleep(2000);
	        
	        $("#mainSearchbar").setValue("telefonos celulares").pressEnter();
	        sleep(2000);

	        $("#img_0").shouldBe(Condition.visible);
	        sleep(2000);
	        
	        SelenideElement paginacion = $("nav[aria-label='Pagination']");
	        paginacion.scrollIntoView(true);
	        paginacion.shouldBe(Condition.visible);
	        sleep(2000);
	        
	        ElementsCollection productos = $$("li.m-product__card");
	        System.out.println("Número de productos en página 1: " + productos.size());
	        sleep(2000);
	        
	        $$(".pagination .page-item a.page-link")
           .findBy(Condition.text("2"))
           .click();
	        sleep(2000);
	        
	        $("li.m-product__card").should(Condition.appear);
	        sleep(2000);
	        
	        paginacion.scrollIntoView(true);
	        paginacion.shouldBe(Condition.visible);
	        sleep(2000);
	        
	        ElementsCollection productos2 = $$("li.m-product__card");
	        System.out.println("Número de productos en página 2: " + productos2.size());
	        sleep(2000);
	        
	        
	        $$(".pagination .page-item a.page-link")
           .findBy(Condition.text("3"))
           .click();
	        sleep(2000);
	        
	        $("li.m-product__card").should(Condition.appear);
	        sleep(2000);
	        
	        paginacion.scrollIntoView(true);
	        paginacion.shouldBe(Condition.visible);
	        sleep(2000);
	        
	        ElementsCollection productos3 = $$("li.m-product__card");
	        System.out.println("Número de productos en página 3: " + productos3.size());
	        sleep(2000);
	        
	        
	        $$(".pagination .page-item a.page-link")
           .findBy(Condition.text("4"))
           .click();
	        sleep(2000);
	        
	        $("li.m-product__card").should(Condition.appear);
	        sleep(2000);
	        
	        paginacion.scrollIntoView(true);
	        paginacion.shouldBe(Condition.visible);
	        sleep(2000);
	        
	        ElementsCollection productos4 = $$("li.m-product__card");
	        System.out.println("Número de productos en página 4: " + productos4.size());
	        sleep(2000);
	        
	        
	        
	        $$(".pagination .page-item a.page-link")
           .findBy(Condition.text("5"))
           .click();
	        sleep(2000);
	        
	        $("li.m-product__card").should(Condition.appear);
	        sleep(2000);
	        
	        paginacion.scrollIntoView(true);
	        paginacion.shouldBe(Condition.visible);
	        sleep(2000);
	        
	        ElementsCollection productos5 = $$("li.m-product__card");
	        System.out.println("Número de productos en página 5: " + productos5.size());
	        sleep(2000);
	        
	        
		}
	}