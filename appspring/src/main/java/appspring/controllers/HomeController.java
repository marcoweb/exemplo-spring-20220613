package appspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("mensagem", "Olá Mundo!!!");
        return "/home/index";
    }

    @RequestMapping("/tabuada")
    public String tabuada(Model abacaxi) {
        int[] resultado = new int[10];
        for(int pos = 0;pos <10;pos++) {
            resultado[pos] = 5 * (pos + 1);
        }
        abacaxi.addAttribute("tabuada", resultado);
        return "/home/tabuada";
    }
}


 