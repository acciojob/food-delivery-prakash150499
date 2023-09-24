package com.driver.model.request;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FoodDetailsRequestModel {

	private String foodName;
	private String foodCategory;
	private float foodPrice;

}