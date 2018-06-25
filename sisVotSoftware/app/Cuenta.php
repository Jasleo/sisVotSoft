<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Cuenta extends Model {

    public $timestamps = false;
    public $table = "cuenta";
    protected $fillable = ['id', 'rutPersona_fk', 'pass', 'privilegio_fk'];

}
