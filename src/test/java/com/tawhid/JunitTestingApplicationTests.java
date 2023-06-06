package com.tawhid;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class JunitTestingApplicationTests {

    private Calculator calculator = new Calculator();

    @Test
    void contextLoads() {
    }

    @Test
    void testAdd() {
        int acceptedResult = 60;
        int result = calculator.add(10, 20, 30);
        assertThat(result).isEqualTo(acceptedResult);
    }



}
