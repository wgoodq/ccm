package cn.ok.ccm.entity;

import lombok.Data;

/**
 * 配置项
 *
 * @author kyou on 2018-12-18 16:59
 */
@Data
public class Prop {
    // 配置项所属分组
    private String group;
    // 配置向名称
    private String propName;
    // 配置项内容
    private String propValue;
}
