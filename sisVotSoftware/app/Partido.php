<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Partido extends Model {

    public $table = "partido";
    protected $fillable = ['id', 'descripcion', 'anio_fundacion'];

}
