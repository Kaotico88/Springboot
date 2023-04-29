
package com.gudmundsson.HolaMundo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
    
    @RequestMapping("/")
    public String holaMundo(){
        return "Hola mentecato como estas!! quiero ser un experto en java y spring boot "
		+ "amo a lizbet Zorca montaño";
    }
}
