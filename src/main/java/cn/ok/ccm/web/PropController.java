package cn.ok.ccm.web;

import cn.ok.ccm.entity.Property;
import cn.ok.ccm.entity.PropertyKeys;
import cn.ok.ccm.repository.PropertyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 查询全部属性
     *
     * @return List<Property>
     */
    @GetMapping("/prop/getAll")
    public List<Property> getAll() {
        return propertyRepository.findAll();
    }

    /**
     * 新增属性（JSON格式字符串）
     *
     * @param property 新增属性（JSON格式字符串）
     */
    @PostMapping("/prop/save")
    public void save(@RequestBody Property property) {
        propertyRepository.save(property);
    }

    /**
     * 通过主键删除属性
     *
     * @param propertyKeys 属性主键
     */
    @DeleteMapping("/prop/del")
    public void del(@RequestBody PropertyKeys propertyKeys) {
        propertyRepository.deleteById(propertyKeys);
    }
}
