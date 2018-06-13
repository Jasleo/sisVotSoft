<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Http\Request;
use App\Http\Controllers\Controllers;
use App\Persona;
use App\Pais;
use App\Nacionalidad;
use App\TipoUsuario;


class PersonaController extends Controller
{
    
    public function listPersona(){
        try{
            $result = array("code" => 200, "state" => true, "data" => array());
            $persona = Persona::get();
                    
            if($persona){
                $result = array("code" => 200, "state" => true, "data" => $persona);
            }        
            
        } catch (\Exception $e){
            $result = array("code" => 500, "state" => false, "data" =>  $e->getMessage());    
        }
        
        return response()->json($result);
    }

}
