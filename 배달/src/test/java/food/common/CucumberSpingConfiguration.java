package food.common;

import food.배달Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { 배달Application.class })
public class CucumberSpingConfiguration {}
