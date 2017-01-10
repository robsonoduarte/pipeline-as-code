package br.com.mystudies.seleninum;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;


public class ApplicationAuthenticationProviderTest {

	@InjectMocks
	private ApplicationAuthenticationProvider authenticationProvider;



	@Mock
	private Authentication authentication;





	@Before
	public void setUp() throws Exception {
		initMocks(this);
		when(authentication.getName()).thenReturn("user");
		when(authentication.getCredentials()).thenReturn("password");
	}



	@Test
	public void whenReceivingVerifyAuthenticationIsCalledHttpFacade() throws Exception {

		UsernamePasswordAuthenticationToken userToken  =
				(UsernamePasswordAuthenticationToken) authenticationProvider.authenticate(authentication);

        /*assertTha(userToken.getPrincipal(), equalTo("Robson"));*/


	}



}
