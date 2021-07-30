package grails.example

class Contacto {

    String nombre
    String apellido
    Integer edad
    String genero
    Telefono telefono
    Direccion direccion

    static belongsTo = [Telefono, Direccion] 

    static constraints = {
        
        telefono blank: false, nullable: true
        direccion blank: false, nullable: true

    }
}
