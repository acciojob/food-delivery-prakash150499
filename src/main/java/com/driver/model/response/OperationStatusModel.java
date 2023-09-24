package com.driver.model.response;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OperationStatusModel {

	private String operationResult;
	private String operationName;


}
