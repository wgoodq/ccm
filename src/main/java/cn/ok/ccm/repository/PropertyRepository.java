package cn.ok.ccm.repository;

import cn.ok.ccm.entity.Property;
import cn.ok.ccm.entity.PropertyKeys;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * File Header
 * PROJECT_NAME: ccm
 * PACKAGE_NAME: cn.ok.ccm.repository
 *
 * @author Kyou on 2018/12/18 21:41
 */
public interface PropertyRepository extends JpaRepository<Property, PropertyKeys> {
}
