package org.example.demofxformulario

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("views/formulario-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }

    //Mensaje que aparecerá al cerrar el programa
    override fun stop() {
        println("Aplicacion cerrada correctamente")
    }

    //Mensaje que aparecerá al iniciar el programa
    override fun init() {
        println("Iniciando aplicacion...")
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}