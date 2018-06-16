<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Persona extends Model
{
        protected $fillable = ['rut','nombre', 'apellido','direccion','edad','paisRecidencia_fk','nacionalidad_fk','tipoUsuario_fk'];
}


