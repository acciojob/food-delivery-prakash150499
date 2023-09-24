package com.driver.model.response;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FoodDetailsResponse {

	private String foodId;
	private String foodName;
	private float foodPrice;
	private String foodCategory;


}
