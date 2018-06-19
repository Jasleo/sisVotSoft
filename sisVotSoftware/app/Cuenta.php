<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Cuenta extends Model
{
	protected $fillable = ['id','rutPersona_fk','pass','privilegio_fk'];
}

