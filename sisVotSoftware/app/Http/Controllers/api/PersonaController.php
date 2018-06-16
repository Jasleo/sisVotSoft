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
    
    public function createPersona(Request $request) {
        try {
            $persona = Persona::create($request->all());
            $result = array("code" => 200, "state" => true, "data" => "Persona Registrada");
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }

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
    
    public function deletePersona($id) {
        try {
            $result = array("code" => 200, "state" => true, "data" => "The search did not find results");
            $persona = Persona::find($id);
            if ($persona) {
                $persona->delete();
                $result = array("code" => 200, "state" => true, "data" => "The employee was deleted successfully");
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }

    //falta update

}
