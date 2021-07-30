import grails.example.ContactoService
import grails.example.Contacto

class BootStrap {

    ContactoService contactoService

    def init = { servletContext ->
   /*     def gump = new Contacto(
            nombre: "Juan", 
            apellido: "Jimenez", 
            edad: "24", 
            genero: "Masculino", 
            telefono:{ numeroDeTelefono: "809-555-5555" }, 
            direccion:{ descripcion: "calle Candida Rosa, No. 39"})
        gump.save(failOnError:true)*/
    Contacto nuevoContacto = new Contacto(
            nombre: "Juan", 
            apellido: "Jimenez", 
            edad: "24", 
            genero: "Masculino", 
            telefono:{ numeroDeTelefono: "809-555-5555" }, 
            direccion:{ descripcion: "calle Candida Rosa, No. 39"})

    Contacto cont = contactoService.save(nuevoContacto)
    
    }

    def destroy = {
    }
}
