package medcenter.backend;

import java.util.Arrays;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails u = new User(username, "p",
				Arrays.asList(createAuthotiry("ROLE_USER"), createAuthotiry("ROLE_ADMIN")));
		return u;
	}

	private GrantedAuthority createAuthotiry(String role) {
		return new SimpleGrantedAuthority(role);
	}

}
