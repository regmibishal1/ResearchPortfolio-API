package com.researchportfolio.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class APIErrorResponse {
    private String message;
    // Additional fields like errorCode, details, etc., can be added as needed
}
