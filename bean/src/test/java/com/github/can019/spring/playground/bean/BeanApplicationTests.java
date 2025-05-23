package com.github.can019.spring.playground.bean;

import com.github.can019.spring.playground.bean.scope.PrototypeScopeWrapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class BeanApplicationTests {
	@Autowired
	private ApplicationContext context;

	@Test
	void prototypeBeanTest() {
		PrototypeScopeWrapper prototypeScopeWrapper1 = context.getBean(PrototypeScopeWrapper.class);
		PrototypeScopeWrapper prototypeScopeWrapper2 = context.getBean(PrototypeScopeWrapper.class);

		System.out.println("1: " +prototypeScopeWrapper1);
		System.out.println("2: "+ prototypeScopeWrapper2);



		System.out.println("1: " +prototypeScopeWrapper1.inner);
		System.out.println("2: "+ prototypeScopeWrapper2.inner);

		System.out.println("1: " +prototypeScopeWrapper1.inner.nestedInner);
		System.out.println("2: "+ prototypeScopeWrapper2.inner.nestedInner);

		Assertions.assertThat(prototypeScopeWrapper1).isNotEqualTo(prototypeScopeWrapper2);
	}
}
