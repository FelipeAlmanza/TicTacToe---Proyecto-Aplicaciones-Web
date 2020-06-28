<?php

/**
 * Usuario usa X, computadora usa O
 */
define("TAM_TABLERO", 3);
define("CELDA_VACIA", "-"); //valor para campo sin usar en matriz
define("CARAC_USUARIO", "X");
define("CARAC_MAQUINA", "O");

class TicTacToe
{
  private $tablero = array(); //tablero
  private $estadoDeJuego; // en progreso, gana usuario, gana maquina, empate

  public function __construct()
  {
    $this->inicializarTablero();

    $estadoDeJuego = "en progreso";
    $turno = 0; //comienza usuario
  }

  private function inicializarTablero()
  {
    //Crear tablero del tamaño definido y se inicializa en vacío
    for ($i = 0; $i < TAM_TABLERO; $i++) {
      $this->tablero[] = array();
      for ($j = 0; $j < TAM_TABLERO; $j++) {
        $this->tablero[$i][] = CELDA_VACIA;
      }
    }
  }

  /**
   * Retorna el arreglo con el tablero
   */
  public function get_Tablero()
  {
    return $this->tablero;
  }

  public function printTablero()
  {
    for ($i = 0; $i < TAM_TABLERO; $i++) {
      for ($j = 0; $j < TAM_TABLERO; $j++) {
        echo $this->tablero[$i][$j];
      }
      echo "\n";
    }
  }

  //para el usuario
  public function turnoUsuario($posX, $posY)
  {
    $movimientoValido = false;
    $movimientoValido = $this->validarMovimiento($posX, $posY);

    if ($movimientoValido) {
      return "[{$posX}][{$posY}]";
      //$this->tablero[$posX][$posY] = $simboloColocar;
    } else {
      return "movimiento invalido";
    }
  }

  //ver si la movida es valida
  private function validarMovimiento($posX, $posY)
  {
    $valido = false;

    if (!($posX >= TAM_TABLERO || $posY >= TAM_TABLERO)) {
      if ($this->tablero[$posX][$posY] == CELDA_VACIA) { //Puede poner porque ya hay un valor asignado
        $valido = true;
      }
    }

    return $valido;
  }

  //Regresa una hilera con lo que sucede
  public function turnoMaquina()
  {
    $tableroCopia = $this->tablero;
    //Intento de gane
    for ($i = 0; $i < TAM_TABLERO; $i++) {
      for ($j = 0; $j < TAM_TABLERO; $j++) {
        if ($this->tablero[$i][$j] == CELDA_VACIA) {
          $tableroCopia[$i][$j] = CARAC_MAQUINA;

          //se revisa si el tablero con este posible movimiento hace que maquina gane
          if ($this->movidaGanadora(CARAC_MAQUINA, $tableroCopia)) {
            $this->estadoDeJuego = "Gana máquina";
            return "[{$i}][{$j}]";
          } else {
            //Si no funcion lo regresa a su valor original
            $tableroCopia[$i][$j] = CELDA_VACIA;
          }
        }
      }
    }

    //Intentar Bloquear gane de usuario
    for ($i = 0; $i < TAM_TABLERO; $i++) {
      for ($j = 0; $j < TAM_TABLERO; $j++) {
        if ($this->tablero[$i][$j] == CELDA_VACIA) {
          //Probar si poniendo una marca del usuario este gana, para impedirlo poniendo en este lugar
          $tableroCopia[$i][$j] = CARAC_USUARIO;
          if ($this->movidaGanadora(CARAC_USUARIO, $tableroCopia)) {
            return "[{$i}][{$j}]";
          } else {
            //Si no funcion lo regresa a su valor original
            $tableroCopia[$i][$j] = CELDA_VACIA;
          }
        }
      }
    }

    //Si ninguno fue posible, entonces elegir una posicion particular

    //elegir centro
    if ($this->tablero[1][1] == CELDA_VACIA) {
      return "[1][1]";
    }

    //El resto son las esquinas
    if ($this->tablero[0][0] == CELDA_VACIA) {
      return "[0][0]";
    }

    if ($this->tablero[0][2] == CELDA_VACIA) {
      return "[0][2]";
    }

    if ($this->tablero[2][0] == CELDA_VACIA) {
      return "[2][0]";
    }

    if ($this->tablero[2][2] == CELDA_VACIA) {
      return "[2][2]";
    }
  }

  private function movidaGanadora($caracter, $tablero)
  {
    for ($i = 0; $i < TAM_TABLERO; $i++) {
      if ($tablero[$i][0] == $caracter && $tablero[$i][1] == $caracter && $tablero[$i][2] == $caracter) {
        return true;
      }
    }

    for ($i = 0; $i < TAM_TABLERO; $i++) {
      if ($tablero[0][$i] == $caracter && $tablero[1][$i] == $caracter && $tablero[2][$i] == $caracter) {
        return true;
      }
    }

    if ($tablero[0][0] == $caracter && $tablero[1][1] == $caracter && $tablero[2][2] == $caracter) {
      return true;
    }

    if ($tablero[0][2] == $caracter && $tablero[1][1] == $caracter && $tablero[2][0] == $caracter) {
      return true;
    }

    return false;
  }

  //Si aun hay espacios vacios no hay empate
  private function buscarEmpate()
  {
    for ($i = 0; $i <= TAM_TABLERO; $i++) {
      for ($j = 0; $j <= TAM_TABLERO; $j++) {
        if ($this->tablero[$i][$j] == CELDA_VACIA) {
          return false;
        }
      }
    }
    return true;
  }

  public function marcarEnTablero($caracJugador, $movimiento)
  {
    $fila = $movimiento[1];
    $columna = $movimiento[4];
    $this->tablero[$fila][$columna] = $caracJugador;
  }

  public function estadoDeJuego()
  {
    $ganaUsuario = $this->movidaGanadora(CARAC_USUARIO, $this->tablero);
    if ($ganaUsuario) {
      return "Gana usuario";
    }

    $ganaMaquina = $this->movidaGanadora(CARAC_MAQUINA, $this->tablero);
    if ($ganaMaquina) {
      return "Gana maquina";
    }

    if ($this->buscarEmpate()) {
      return "Empate";
    }

    return "en progreso";
  }
}

$juego = new TicTacToe();
print_r($juego->get_Tablero());
$juego->printTablero();
$movida = $juego->turnoUsuario(1, 2);
$juego->marcarEnTablero(CARAC_USUARIO, $movida);
$juego->printTablero();
