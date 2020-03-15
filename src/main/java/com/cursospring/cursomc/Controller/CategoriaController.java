package com.cursospring.cursomc.Controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaController {


    @GetMapping("/categorias")
    public String listar() {
        return "REST está funcionando!";
    }
    
}
