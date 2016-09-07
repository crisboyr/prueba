<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
       require_once './clases/SeleccionFutbol.php';
       require_once './clases/Entrenador.php';
       require_once './clases/Futbolista.php';
        $entrenador=new Entrenador(1, "Viente", "Del Bosque", 60);
        $futbolista=new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        $entrenador->registrarIntegrante($entrenador);
        $entrenador->registrarIntegrante($futbolista);
        echo '<h1>Todos los integrantes viajan para jugar un partido</h1>';
        $entrenador->mostrarIntegrantes();
        ?>
    </body>
</html>
