
package com.ejemplo.SpringBoot.controller;


import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.service.IPersonaService;
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
public class PersonaController {
   
    @Autowired    
    private IPersonaService persoServ;

    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }

    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
       return persoServ.verPersonas();
    }      
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }


    @PutMapping ("/modificar/persona/{id}")
    public Persona modificarPersona (@PathVariable Long id,
                                     @RequestParam ("nombre") String nuevoNombre,
                                     @RequestParam ("apellido") String nuevoApellido,
                                     @RequestParam ("dni") String nuevoDni,
                                     @RequestParam ("fechaNac") String nuevoFechaNac,
                                     @RequestParam ("celular") String nuevoCelular,
                                     @RequestParam ("email") String nuevoEmail,
                                     @RequestParam ("fotoPerfil") String nuevoFotoPerfil,
                                     @RequestParam ("fotoPortada") String nuevoFotoPortada,
                                     @RequestParam ("descripcion") String nuevoDescripcion,
                                     @RequestParam ("ciudad") String nuevoCiudad,
                                     @RequestParam ("provincia") String nuevoProvincia,
                                     @RequestParam ("pais") String nuevoPais) {      

//busco la persona
Persona perso =  persoServ.buscarPersona(id);     

             
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setDni(nuevoDni);
        perso.setFechaNac(nuevoFechaNac);
        perso.setApellido(nuevoApellido);
        perso.setCelular(nuevoCelular);
        perso.setEmail(nuevoEmail);
        perso.setFotoPerfil(nuevoFotoPerfil);
        perso.setFotoPortada(nuevoFotoPortada);
        perso.setDescripcion(nuevoDescripcion);
        perso.setCiudad(nuevoCiudad);
        perso.setProvincia(nuevoProvincia);
        perso.setPais(nuevoPais);

        
        persoServ.crearPersona(perso);
        //retorna la nueva persona
        return perso;
}


}
