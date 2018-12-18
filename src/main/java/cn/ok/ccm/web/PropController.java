package cn.ok.ccm.web;

import cn.ok.ccm.dto.Result;
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
 * @author Kyou
 * @date 2018/12/18 21:26
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

        // for test
        Property property = new Property();
        property.setEnv("dev");
        property.setName("port");
        property.setValue("7001");

        propertyRepository.save(property);

        return propertyRepository.findAll();
    }

    @PostMapping("/addProperty")
    public Result<String> addProperty(Property property) {
        log.debug("property: {}", property.toString());

        propertyRepository.save(property);
        return Result.<String>builder().success(true).msg(property.toString()).build();
    }
}