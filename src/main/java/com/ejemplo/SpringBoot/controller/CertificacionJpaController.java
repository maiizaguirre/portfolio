
package com.ejemplo.SpringBoot.controller;


import com.ejemplo.SpringBoot.model.Certificacion;
import com.ejemplo.SpringBoot.service.ICertificacionService;
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
public class CertificacionJpaController {
   
    @Autowired    
    private ICertificacionService certServ;

    @PostMapping ("/new/certificacion")
    public void agregarCertificacion (@RequestBody Certificacion cert) {
        certServ.crearCertificacion(cert);
    }

    @GetMapping ("/ver/certificacion")
    @ResponseBody
    public List<Certificacion> verCertificacion () {
       return certServ.verCertificacion();
    }      
    @DeleteMapping ("/delete/{idCert}")
    public void borrarCertificacion (@PathVariable Long id) {
        certServ.borrarCertificacion(id);
    }

//agregado mio
    @PutMapping ("/modificar/certificacion")
    public void modificarCertificacion (@RequestBody Certificacion cert) {
        certServ.crearCertificacion(cert);
}

}