<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Privilegio extends Model {

    public $table = "privilegio";
    protected $fillable = ['id', 'descripcion'];

}
