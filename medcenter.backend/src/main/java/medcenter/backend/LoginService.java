package medcenter.backend;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements UserDetailsService {

	Map<String, User> users = new HashMap<>();

	@PostConstruct
	private void init() {
		this.users.put("user", new User("user", "$2a$04$q8abcGNXORhL/5iDKnvx1eOEaFZlfLsik0x/32/Mo/Kpa0LCshDK2",
				Arrays.asList(createAuthotiry("ROLE_USER"))));
		this.users.put("admin", new User("admin", "$2a$04$q8abcGNXORhL/5iDKnvx1eOEaFZlfLsik0x/32/Mo/Kpa0LCshDK2",
				Arrays.asList(createAuthotiry("ROLE_USER"), createAuthotiry("ROLE_ADMIN"))));
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (this.users.containsKey(username)) {
			final User user = this.users.get(username);
			return user;
		}
		return null;
	}

	private GrantedAuthority createAuthotiry(String role) {
		return new SimpleGrantedAuthority(role);
	}

}
