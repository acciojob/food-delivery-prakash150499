package com.driver.io.entity;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "foods")
public class FoodEntity{
	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String foodId;

	@Column(nullable = false)
	private String foodName;

	@Column(nullable = false)
	private float foodPrice;

	@Column(nullable = false)
	private String foodCategory;

}