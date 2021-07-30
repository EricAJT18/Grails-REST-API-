package grails.example

import grails.converters.JSON

import java.time.Instant

class ContactoController {
	static responseFormats = ['json', 'xml']

    ContactoService contactoService

    def index() {
        def result = [:]

        result.successful = false

        try {
            result.contacto = contactoService.getAll()
            result.successful = true
        } catch (Exception e) {
            result.error = e.getLocalizedMessage()
        }

        render result as JSON
    }

    def save() {
        def result = [:]

        result.successful = false

        def body = request.JSON

        try {
            result.contacto = contactoService.save(body)
            result.successful = true
        } catch (Exception e) {
            result.error = e.getLocalizedMessage()
        }

        render result as JSON
    }
}
