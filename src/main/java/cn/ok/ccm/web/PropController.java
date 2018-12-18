package cn.ok.ccm.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * File Header
 *
 * @author kyou on 2018-12-18 14:52
 */
@RestController
public class PropController {

    @GetMapping("GetProp")
    public String getProp() {
        return "";
    }
}
