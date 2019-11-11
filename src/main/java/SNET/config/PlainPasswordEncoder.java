package SNET.config;

/*
Данный класс реализует интерфейс PasswordEncoder, который отвечает за кодирование паролей
*/

import SNET.annotation.Benchmark;
import org.springframework.security.crypto.password.PasswordEncoder;


@Benchmark
public class PlainPasswordEncoder implements PasswordEncoder {

	@Override
	public String encode(CharSequence rawPassword) {
		return rawPassword.toString();
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		
		if (rawPassword.equals(encodedPassword)) {
			return true;
		}
		
		return false;
	}

}
