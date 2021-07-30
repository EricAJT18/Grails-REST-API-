package grails.example

class UrlMappings {

    static mappings = {

            group "/contacto", {
                get "/consultarContacto"(controller: "contacto", action:"index")        
            }

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
