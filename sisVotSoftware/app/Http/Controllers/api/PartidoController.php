<?php

namespace App\Http\Controllers\api;

use Illuminate\Http\Request;
use App\Http\Requests;
use App\Http\Controllers\Controller; 

use App\Partido;


class PartidoController extends Controller
{

    public function createPartido(Request $request) {
        try {
            $partido = Partido::create($request->all());
            $result = array("code" => 200, "state" => true, "data" => "Partido Registrada");
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }

    public function listPartido() {
        try {
            $result = array("code" => 200, "state" => true, "data" => array());
            $partido = Partido::get();

            if ($partido) {
                $result = $partido;
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }

        return response()->json($result);
    }
    
    public function deletePartido($id) {
        try {
            $result = array("code" => 200, "state" => true, "data" => "The search did not find results");
            $partido = Nacionalidad::find($id);
            if ($partido) {
                $partido->delete();
                $result = array("code" => 200, "state" => true, "data" => "The partido was deleted successfully");
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }

    //falta update

}
