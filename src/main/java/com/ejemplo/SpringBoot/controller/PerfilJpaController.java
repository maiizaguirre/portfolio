
package com.ejemplo.SpringBoot.controller;


import com.ejemplo.SpringBoot.model.Perfil;
import com.ejemplo.SpringBoot.service.IPerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerfilJpaController {
   
    @Autowired    
    private IPerfilService perfilServ;

    @PostMapping ("/new/perfil")
    public void agregarPerfil (@RequestBody Perfil perfil) {
        perfilServ.crearPerfil(perfil);
    }

    @GetMapping ("/ver/perfil")
    @ResponseBody
    public List<Perfil> verPerfil () {
       return perfilServ.verPerfil();
    }      
    @DeleteMapping ("/delete/{idPerfil}")
    public void borrarPerfil (@PathVariable Long id) {
        perfilServ.borrarPerfil(id);
    }

@PutMapping ("/modificar/perfil/{id}")
    public Perfil modificarPerfil (@PathVariable Long id,
                                     @RequestParam ("rol") String nuevoRol) {      


       Perfil perfil =  perfilServ.buscarPerfil(id);     

             
        perfil.setRol(nuevoRol);
        
        
        perfilServ.crearPerfil(perfil);
        
        return perfil;
}


}
