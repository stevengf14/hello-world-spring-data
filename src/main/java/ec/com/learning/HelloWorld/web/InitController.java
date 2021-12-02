
package ec.com.learning.HelloWorld.web;

import ec.com.learning.HelloWorld.dao.PersonDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class InitController {
    
    @Autowired
    private PersonDao personaDao;
    
    @GetMapping("/")
    public String init(Model model){
        var people = personaDao.findAll();
        log.info("Executing Spring MVC controller");
        model.addAttribute("people", people);
        return "index";
    }
}
