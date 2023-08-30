package com.example.bestpractices.exception;

import java.time.LocalDateTime;
import java.util.List;

public record ApiError(
        LocalDateTime timestamp,
        int status,
        List<String> errors,
        String path
) {
}
