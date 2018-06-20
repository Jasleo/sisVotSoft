<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateCandidatoTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('candidato', function (Blueprint $table) {
            $table->increments('id');
            $table->integer('partido_fk')->unsigned()->foreign('id')->on('partido');           
            $table->string('persona_fk')->foreign('rut')->on('persona');    
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('candidato');
    }
}
