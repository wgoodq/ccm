package cn.ok.ccm.entity;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * File Header
 * PROJECT_NAME: ccm
 * PACKAGE_NAME: cn.ok.ccm.entity
 *
 * @author Kyou on 2018/12/18 21:48
 */
@Data
public class PropertyKeys implements Serializable {

    @Column(length = 50)
    private String env;

    @Column(length = 100)
    private String name;
}
