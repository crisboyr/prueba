<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Cliente
 *
 * @author cristian
 */
abstract class SeleccionFutbol {
    private $id;
    private $nombre;
    private $apellidos;
    private $edad;
    private $array;
            
    function __construct($id, $nombre, $apellidos, $edad) {
        $this->id = $id;
        $this->nombre = $nombre;
        $this->apellidos = $apellidos;
        $this->edad = $edad;
        $this->array= array();
    }

    function getId() {
        return $this->id;
    }

    function getNombre() {
        return $this->nombre;
    }

    function getApellidos() {
        return $this->apellidos;
    }

    function getEdad() {
        return $this->edad;
    }

    function setId($id) {
        $this->id = $id;
    }

    function setNombre($nombre) {
        $this->nombre = $nombre;
    }

    function setApellidos($apellidos) {
        $this->apellidos = $apellidos;
    }

    function setEdad($edad) {
        $this->edad = $edad;
    }

        public function viajar(){
        echo 'Viajando en avión...';
    }
    public abstract function entrenar() ;
    public abstract function jugar() ;
    public function descansar(){
        echo 'Descansando...';
    }
    public function registrarIntegrante(SeleccionFutbol $seleccionFutbol){
        $this->array[]=$seleccionFutbol;
    }
    
    public function mostrarIntegrantes(){
        foreach ($this->array as $value) {
            print $value->nombre." ".$value->apellidos." ,";
            $this->viajar();
            print "<br/>";
        }
    }

}
