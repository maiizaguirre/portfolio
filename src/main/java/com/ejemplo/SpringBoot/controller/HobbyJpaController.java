
package com.ejemplo.SpringBoot.controller;


import com.ejemplo.SpringBoot.model.Hobby;
import com.ejemplo.SpringBoot.service.IHobbyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HobbyJpaController {
   
    @Autowired    
    private IHobbyService hobbyServ;

    @PostMapping ("/new/hobby")
    public void agregarHobby (@RequestBody Hobby hobby) {
        hobbyServ.crearHobby(hobby);
    }

    @GetMapping ("/ver/hobby")
    @ResponseBody
    public List<Hobby> verHobby () {
       return hobbyServ.verHobby();
    }      
    @DeleteMapping ("/delete/{idHobby}")
    public void borrarHobby (@PathVariable Long id) {
        hobbyServ.borrarHobby(id);
    }

//agregado mio
    @PutMapping ("/modificar/hobby")
    public void modificarHobby (@RequestBody Hobby hobby) {
        hobbyServ.crearHobby(hobby);
}

}