<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Nacionalidad extends Model {
    
    public $timestamps = false;
    public $table = "nacionalidad";
    protected $fillable = ['id', 'descripcion'];
}
