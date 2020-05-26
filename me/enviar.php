<?php
    $destino = "mvd_1996@hotmail.com";
    $nombre = $_POST["nombre"];
    $email = $_POST["email"];
    $mensaje = $_POST["mensaje"];
    $contenido = "Nombre: " . $nombre . "\nCorreo: " . $email . "\nMensaje" . $mensaje;
    mail($destino,"Contacto", $contenido);

?>
