package com.driver.model.request;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailsRequestModel {

	private String[] items;
	private float cost;
	private String userId;
}