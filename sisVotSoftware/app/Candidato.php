<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Candidato extends Model {

    public $timestamps = false;
    public $table = "candidato";
    protected $fillable = ['id', 'partido_fk', 'persona_fk'];

}
