<?php

namespace App\Http\Controllers\api;

use Illuminate\Http\Request;
use App\Http\Requests;
use App\Http\Controllers\Controller; 
use App\Pais;

class PaisController extends Controller
{
    
    public function createPais(Request $request) {
        try {
            $pais = Pais::create($request->all());
            $result = array("code" => 200, "state" => true, "data" => "Pais Registrado");
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }

    public function listPais() {
        try {
            $result = array("code" => 200, "state" => true, "data" => array());
            $pais = Pais::get();

            if ($pais) {
                $result = $pais;
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }

        return response()->json($result);
    }
    
    public function deletePais($id) {
        try {
            $result = array("code" => 200, "state" => true, "data" => "The search did not find results");
            $pais = Pais::find($id);
            if ($pais) {
                $pais->delete();
                $result = array("code" => 200, "state" => true, "data" => "The Pais was deleted successfully");
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }

    //falta update

}
