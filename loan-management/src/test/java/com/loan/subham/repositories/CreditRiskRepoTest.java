package com.loan.subham.repositories;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.loan.subham.repositories.CreditRiskRepo;

@SpringBootTest
public class CreditRiskRepoTest {
	@MockBean
	private CreditRiskRepo crepo;

	@Test
	void isCreditExistById() {
		when(crepo.isCreditExistById("4")).thenReturn(true);
		Boolean actualResult=crepo.isCreditExistById("3");
		assertThat(actualResult).isTrue();
	}
}
