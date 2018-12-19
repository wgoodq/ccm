package cn.ok.ccm.dto;

import lombok.Builder;
import lombok.Data;

/**
 * File Header
 * PROJECT_NAME: ccm
 * PACKAGE_NAME: cn.ok.ccm.dto
 *
 * @author Kyou on 2018/12/18 22:11
 */
@Data
@Builder
public class Result<T> {
    private boolean success;
    private String msg;
    private T data;
}
