package com.cursospring.cursomc.Controller;


import com.cursospring.cursomc.Model.CategoriaModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CategoriaController {


    @GetMapping("/categorias")
    public List<CategoriaModel> listar() {

        CategoriaModel cat1 = new CategoriaModel(1,"Informatica");
        CategoriaModel cat2 = new CategoriaModel(2,"Escritório");

        List<CategoriaModel> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);
        return lista;
    }

}
