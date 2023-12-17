package co.in.practice.restdemo.payload.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RegisterUser extends UserDto {

	private static final long serialVersionUID = 1L;
	@NotBlank
	@Size(min = 6, max = 40)
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
