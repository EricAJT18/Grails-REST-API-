package grails.example

import grails.transaction.Transactional

@Transactional
class ContactoService {

    def getAll() {
        def list = []

        def contacto = Contacto.getAll()

        contacto.each { con ->
            list.add(mappedObject(con))
        }

        return list
    }

    def save(def body) {
        Contacto contacto = new Contacto()
        Telefono telefono = new Telefono()
        Direccion direccion = new Direccion()
        telefono.numeroDeTelefono = body.telefono
        direccion.descripcion = body.direccion

        contacto.nombre = body.nombre
        contacto.apellido = body.apellido
        contacto.edad = body.edad
        contacto.genero = body.genero
        contacto.telefono = telefono
        contacto.direccion = direccion

        contacto.save(flush: true)
    }

    def mappedObject(def contacto) {
        def result = [:]

        result.nombre = contacto.nombre
        result.apellido = contacto.apellido
        result.edad = contacto.edad
        result.genero = contacto.genero
        result.telefono = contacto.telefono
        result.direccion = contacto.direccion
        
        return result
    }
}
