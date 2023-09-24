package com.driver.model.request;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsRequestModel {

	private String firstName;
	private String lastName;
	private String email;


}
