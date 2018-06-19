<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreatePersonaTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('persona', function (Blueprint $table) {
            $table->string('rut');
            $table->string('nombre');
            $table->string('apellido');
            $table->string('direccion');
            $table->integer('edad');
            $table->integer('paisRecidencia_fk')->unsigned()
                  ->foreign('id')
                  ->on('pais');
            $table->integer('nacionalidad_fk')->unsigned()
                  ->foreign('id')
                  ->on('nacionalidad');                                 
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('persona');
    }
}
