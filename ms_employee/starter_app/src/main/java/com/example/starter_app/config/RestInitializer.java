package com.example.starter_app.config;

import com.example.domain.service.EmployeeService;
import com.example.infra_springdata.portimpl.EmployeePortImpl;
import com.example.infra_springdata.repository.EmployeeRepository;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class RestInitializer implements ApplicationContextInitializer {

    private final ConfigurableApplicationContext infraContext;

    public RestInitializer(ConfigurableApplicationContext infraContext) {
        this.infraContext = infraContext;
    }

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableBeanFactory beanFactory = applicationContext.getBeanFactory();
        beanFactory.registerSingleton("EmployeeService", new EmployeeService(new EmployeePortImpl(infraContext.getBean(EmployeeRepository.class))));
    }
}
