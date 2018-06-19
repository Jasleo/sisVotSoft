<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateCuentaTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('cuenta', function (Blueprint $table) {
            $table->increments('id');
            
            $table->integer('pass');
            $table->integer('privilegio_fk')->unsigned()
                  ->foreign('id')
                  ->on('privilegio');
            $table->integer('rutPersona_fk')->unsigned()
                  ->foreign('rut')
                  ->on('persona'); 
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('cuenta');
    }
}
