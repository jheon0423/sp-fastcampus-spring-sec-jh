package com.sp.fc.web.config;

import groovy.transform.builder.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@lombok.Builder
public class RequestInfo {

    private String remoteIp;
    private String sessionId;
    private LocalDateTime loginTime;

}
