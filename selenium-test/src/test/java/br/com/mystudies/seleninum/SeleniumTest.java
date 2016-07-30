package br.com.mystudies.seleninum;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SeleniumTest {



	@Test
	public void unitTest() {
		assertThat("unit test", equalTo("unit test"));
	}




}
