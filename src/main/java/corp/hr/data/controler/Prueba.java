package corp.hr.data.controler;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/demo") // This means URL´s start with /demo (after Application path)
public class Prueba {
    @PostMapping(path ="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name ,
                                            @RequestParam String email){
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a paramet from the GET or POST request

        return "saved";
    }

}

