function verificarNumeroPerfecto() {

    var numero = parseInt(prompt("Ingresa un número:"));

    if (isNaN(numero) || numero <= 0) {
        alert("Debe ingresa un número válido.");
        verificarNumeroPerfecto();
        return;
    }

    var esNumeroPerfecto = function(n) {
        var sumaDivisores = 0;
        for (var i = 1; i < n; i++) {
            if (n % i === 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores === n;
    };

    if (esNumeroPerfecto(numero)) {
        alert(numero + " es un número perfecto.");
    } else {
        alert(numero + " no es un número perfecto.");
    }
    
    verificarNumeroPerfecto();
}

verificarNumeroPerfecto();
