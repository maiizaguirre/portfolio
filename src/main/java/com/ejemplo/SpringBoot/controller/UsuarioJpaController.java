
package com.ejemplo.SpringBoot.controller;


import com.ejemplo.SpringBoot.model.Usuario;
import com.ejemplo.SpringBoot.service.IUsuarioService;
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
public class UsuarioJpaController {
   
    @Autowired    
    private IUsuarioService userServ;

    @PostMapping ("/new/usuario")
    public void agregarUsuario (@RequestBody Usuario user) {
        userServ.crearUsuario(user);
    }

    @GetMapping ("/ver/usuarios")
    @ResponseBody
    public List<Usuario> verUsuarios () {
       return userServ.verUsuarios();
    }      
    @DeleteMapping ("/delete/{idUser}")
    public void borrarUsuario (@PathVariable Long id) {
        userServ.borrarUsuario(id);
    }

//agregado mio
    @PutMapping ("/modificar/usuario")
    public void modificarUsuario (@RequestBody Usuario user) {
        userServ.crearUsuario(user);
}


}
