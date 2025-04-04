package org.example.demofxformulario

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.text.Text

/**
 * @param introducirNombre -- nombre que se introducirá en el formulario
 * @param mensajeLabel -- Mensaje que aparece antes de rellenar el formulario
 * @param mensajeFinal -- Mensaje que aparece tras rellenar el formulario
 */
class FormularioController {

    @FXML
    private lateinit var introducirNombre: TextField

    @FXML
    private lateinit var mensajeLabel: Label

    @FXML
    private lateinit var mensajeFinal: Label

    @FXML
    //Mensaje que aparecerá al iniciar la aplicacion
    private fun initialize() {
        println("Cargando controladores...")
    }

    @FXML
    //Mensaje que aparecera tras rellenar el TextField
    private fun MensajeFinal() {
        val introducirNombre = introducirNombre.text
        mensajeLabel.text = "Hola $introducirNombre"
    }
}