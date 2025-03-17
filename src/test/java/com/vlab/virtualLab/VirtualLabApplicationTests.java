package com.vlab.virtualLab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Import;
import org.testcontainers.utility.TestcontainersConfiguration;

//@Import(TestcontainersConfiguration.class)
@SpringBootTest
@ImportAutoConfiguration(exclude = TestcontainersConfiguration.class)
class VirtualLabApplicationTests {

	@Test
	void contextLoads() {
	}

}
