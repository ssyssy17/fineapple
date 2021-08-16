package com.genie.fineapple.zzz;

import com.genie.fineapple.zzz.BasicResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ErrorResponse extends BasicResponse {
    private final String code;
    private final String message;
}
