package com.safecare.abdm.healthidlinking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CareContext {
	private String referenceNumber;
	private String display;
}
