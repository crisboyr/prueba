<?php
require_once 'SeleccionFutbol.php';
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Futbolista
 *
 * @author cristian
 */

class Futbolista extends SeleccionFutbol {
    
    private $dorsal;
    private $demarcacion;
    
    public function __construct($id, $nombre, $apellidos, $edad,$dorsal,$demarcacion){
        parent::__construct($id, $nombre, $apellidos, $edad);
        $this->dorsal=$dorsal;
        $this->demarcacion=$demarcacion;
    }

    function getDorsal() {
        return $this->dorsal;
    }

    function getDemarcacion() {
        return $this->demarcacion;
    }

    function setDorsal($dorsal) {
        $this->dorsal = $dorsal;
    }

    function setDemarcacion($demarcacion) {
        $this->demarcacion = $demarcacion;
    }

        public function entrenar() {
        echo 'Realizando un entrenamiento';    
    }

    public function jugar() {
        echo 'Jugando un partido';
    }

    

}
