package com.driver.model.response;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

	private String userId;
	private String email;
	private String firstName;
	private String lastName;

}
