package cn.ok.ccm.web;

import cn.ok.ccm.entity.Property;
import cn.ok.ccm.repository.PropertyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * File Header
 * PROJECT_NAME: ccm
 * PACKAGE_NAME: cn.ok.ccm.web
 *
 * @author Kyou on 2018/12/18 21:26
 */
@Slf4j
@RestController
public class PropController {

    private final PropertyRepository propertyRepository;

    @Autowired
    public PropController(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @GetMapping("/getProps")
    public List<Property> getProps() {

        return propertyRepository.findAll();
    }

    @PostMapping("/addProperty")
    public String addProperty(Property property) {
        log.debug("property: {}", property.toString());

        propertyRepository.save(property);
        return "SUCCESS";
    }
}
