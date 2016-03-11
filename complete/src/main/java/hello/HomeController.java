package hello;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    @Secured("ROLE_USER")
    public String getHome(){
        return "hello";
    }

    @RequestMapping("json")
    @Secured("ROLE_USER")
    public @ResponseBody Map returnJSON(){
        Map<String, Object> m = new HashMap<String, Object>();
        m.put("test",1);
        return m;
    }
}
