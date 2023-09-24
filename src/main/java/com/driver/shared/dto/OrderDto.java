package com.driver.shared.dto;

import lombok.*;

import java.io.Serializable;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto{

	private long id;
	private String orderId;
	private float cost;
	private String[] items;
	private String userId;
	private boolean status;
}
