package br.com.mystudies.seleninum;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class ApplicationAuthenticationProvider implements AuthenticationProvider {





	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
			return new UsernamePasswordAuthenticationToken(
					null,
					authentication
				);

	}

















	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}


}
