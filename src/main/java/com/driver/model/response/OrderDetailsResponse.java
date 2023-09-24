package com.driver.model.response;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailsResponse {

	private String orderId;
	private float cost;
	private String items[];
	private String userId;
	private boolean status;

}
