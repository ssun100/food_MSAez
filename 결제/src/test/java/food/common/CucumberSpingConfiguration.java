package food.common;

import food.결제Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { 결제Application.class })
public class CucumberSpingConfiguration {}
