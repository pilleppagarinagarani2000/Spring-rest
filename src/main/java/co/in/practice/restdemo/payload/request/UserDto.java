package co.in.practice.restdemo.payload.request;

import java.io.Serializable;
import java.util.List;

import co.in.practice.restdemo.models.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;

	@NotBlank
	@Size(min = 3, max = 20)
	private String username;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	private List<String> address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserDto() {

	}

	public UserDto(long id, String username, String email, List<String> address) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public User createPersistanceUSer() {
		return new User(username, email, address);
	}

}
