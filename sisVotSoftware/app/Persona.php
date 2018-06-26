<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Persona extends Model {
    
    public $timestamps = false;
    public $table = "persona";
    protected $primaryKey = 'rut';
    public $incrementing = false;
    protected $fillable = ['rut', 'nombre', 'apellido', 'direccion', 'edad', 'paisRecidencia_fk', 'nacionalidad_fk', 'tipoUsuario_fk'];

}
