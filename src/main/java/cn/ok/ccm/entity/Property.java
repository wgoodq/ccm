package cn.ok.ccm.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * File Header
 * PROJECT_NAME: ccm
 * PACKAGE_NAME: cn.ok.ccm.ccm.entity
 *
 * @author Kyou on 2018/12/18 21:22
 */
@Data
@Entity
@IdClass(PropertyKeys.class)
public class Property {
    @Id
    private String env;
    @Id
    private String name;
    private String value;
}
