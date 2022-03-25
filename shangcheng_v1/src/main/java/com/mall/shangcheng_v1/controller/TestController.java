package controller;

import entity.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*****
 * 测试
 */

@RestController
@RequestMapping("/mall")

public class TestController {
    @getMapping("/test")
    public R test(){
        return R.ok("javaaaaaaaaaaaaaaa");
    }

}
