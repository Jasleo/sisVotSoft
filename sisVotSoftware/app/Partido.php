<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Partido extends Model {
    
    public $timestamps = false;
    public $table = "partido";
    protected $fillable = ['id', 'descripcion', 'anio_fundacion'];

}
