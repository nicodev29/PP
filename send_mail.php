<?php

// Incluyendo el archivo de conexión
include 'conexion.php';

// El resto de tu código para manejar el formulario y guardar el mensaje
if($_SERVER["REQUEST_METHOD"] == "POST") {
    $nombre = $_POST['nombre'];
    $telefono = $_POST['telefono'];
    $mensaje = $_POST['mensaje'];

    // Validar que todos los campos estén completos
    if(empty($nombre) || empty($telefono) || empty($mensaje)) {
        echo "<script>alert('Por favor, rellena todos los campos.');</script>";
        exit; // Termina la ejecución del script
    }

    $stmt = $pdo->prepare("INSERT INTO mensajes (nombre, telefono, mensaje) VALUES (?, ?, ?)");
    if($stmt->execute([$nombre, $telefono, $mensaje])) {
        // Redireccionar a index.html con un parámetro de éxito
        header("Location: index.html?status=success");
        exit;
    } else {
        echo "<script>alert('Hubo un error al guardar el mensaje.');</script>";
        exit;
    }
}
