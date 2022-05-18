
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
import org.springframework.web.bind.annotation.RequestParam;
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

@PutMapping ("/modificar/usuario/{id}")
    public Usuario modificarUsuario (@PathVariable Long id,
                                     @RequestParam ("user") String nuevoUser,
                                     @RequestParam ("email") String nuevoEmail,
                                     @RequestParam ("password") String nuevoPassword) {      


       Usuario user =  userServ.buscarUsuario(id);     

             
        user.setUser(nuevoUser);
        user.setEmail(nuevoEmail);
        user.setPassword(nuevoPassword);
        
        userServ.crearUsuario(user);
       
        return user;
}


}
