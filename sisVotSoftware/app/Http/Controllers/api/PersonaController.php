<?php

namespace App\Http\Controllers\api;

use Illuminate\Http\Request;
use App\Http\Requests;
use App\Http\Controllers\Controller;
use App\Persona;
use App\Pais;
use App\Nacionalidad;
use App\TipoUsuario;

class PersonaController extends Controller {

    public function createPersona(Request $request) {
        try {
            $persona = Persona::create($request->all());
            $result = array("code" => 200, "state" => true, "data" => "Persona Registrada");
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }

    public function listPersona() {
        try {
            $result = array("code" => 200, "state" => true, "data" => array());
            $persona = Persona::get();

            if ($persona) {
                $result = $persona;
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
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

    public function updatePersona(Request $request, $rut) {

//        echo 'RUT QUE LLEGA : ' . $rut;
        
        $persona = Persona::find($rut);

        $rutN = $request->input('rut');
        $nombre = $request->input('nombre');
        $apellido = $request->input('apellido');
        $direccion = $request->input('direccion');
        $edad = $request->input('edad');
        $paisRecidencia_fk = $request->input('paisRecidencia_fk');
        $nacionalidad_fk = $request->input('nacionalidad_fk');

//        echo 'RUT : ' . $rutN;
//        echo ' NOMBRE : ' . $nombre;
//        echo ' APELLIDO : ' . $apellido;
//        echo ' DIRECCION : ' . $direccion;
//        echo ' EDAD : ' . $edad;
//        echo ' PAIS : ' . $paisRecidencia_fk;
//        echo ' NACIONALIDAD : ' . $nacionalidad_fk;
//        
        $persona->rut = $rutN;
        $persona->nombre = $nombre;
        $persona->apellido = $apellido;
        $persona->direccion = $direccion;
        $persona->edad = $edad;
        $persona->paisRecidencia_fk = $paisRecidencia_fk;
        $persona->nacionalidad_fk = $nacionalidad_fk;

        $persona->save();

        return response()->json($persona);
    }

}
