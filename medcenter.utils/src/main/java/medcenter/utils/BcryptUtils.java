package medcenter.utils;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BcryptUtils implements PasswordEncoder {

	@Override
	public String encode(CharSequence rawPassword) {
		return BCrypt.hashpw(rawPassword.toString(), BCrypt.gensalt());
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return BCrypt.checkpw(rawPassword.toString(), encodedPassword.toString());
	}

}
