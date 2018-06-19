<?php

namespace App\Http\Controllers\api;

use Illuminate\Http\Request;
use App\Http\Requests;
use App\Http\Controllers\Controller; 
use App\Nacionalidad;

class NacionalidadController extends Controller {

    public function createNacionalidad(Request $request) {
        try {
            $nacionalidad = Nacionalidad::create($request->all());
            $result = array("code" => 200, "state" => true, "data" => "Nacionalidad Registrada");
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }

    public function listNacionalidad() {
        try {
            $result = array("code" => 200, "state" => true, "data" => array());
            $nacionalidad = Nacionalidad::get();

            if ($nacionalidad) {
                $result = array("code" => 200, "state" => true, "data" => $nacionalidad);
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }

        return response()->json($result);
    }
    
    public function deleteNacionalidad($id) {
        try {
            $result = array("code" => 200, "state" => true, "data" => "The search did not find results");
            $nacionalidad = Nacionalidad::find($id);
            if ($nacionalidad) {
                $nacionalidad->delete();
                $result = array("code" => 200, "state" => true, "data" => "The employee was deleted successfully");
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }

    //falta update
    

}
