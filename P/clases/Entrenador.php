<?php
require_once 'SeleccionFutbol.php';
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Entrenador
 *
 * @author cristian
 */
class Entrenador extends SeleccionFutbol{
    
    
     public function __construct($id, $nombre, $apellidos, $edad){
        parent::__construct($id, $nombre, $apellidos, $edad);
      
    }
    public function entrenar() {
        echo 'Dirigir entrenamiento';
    }

    public function jugar() {
        echo 'Dirigir juego';
    }

//put your code here
}
