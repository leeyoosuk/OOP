
package controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    
    
    @RequestMapping("/index")
    public Map<String, Object> index() {
    Map<String, Object> hasil = new HashMap<>();
    hasil.put("nama", "Lee");
    hasil.put("jurusan", "Teknik Informatika");
     return hasil;       }
   
    
    
}
