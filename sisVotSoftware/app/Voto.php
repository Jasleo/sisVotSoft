<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Voto extends Model {

    public $table = "voto";
    protected $fillable = ['id', 'fecha_voto', 'votante_fk', 'candidato_fk'];

}
