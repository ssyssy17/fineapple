package com.genie.fineapple.common;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ErrorResponse extends BasicResponse {
    private final String code;
    private final String message;
}
