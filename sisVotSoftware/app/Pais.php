<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Pais extends Model{
    public $table = "pais";
    protected $primaryKey = 'id';
    protected $fillable = ['id','descripcion'];
    protected $hidden = ['created_at','updated_at'];
}
