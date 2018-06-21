<?php

namespace App\Http\Controllers\api;

use Illuminate\Http\Request;
use App\Http\Requests;
use App\Http\Controllers\Controller;

use App\Voto;
use App\Persona;
use App\Candidato;

class VotoController extends Controller {

    public function createVoto(Request $request) {
        try {
            $voto = Voto::create($request->all());
            $result = array("code" => 200, "state" => true, "data" => "Voto Registrada");
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->jons($result);
    }
    
    public function listVoto() {
        try {
            $result = array("code" => 200, "state" => true, "data" => array());
            $voto = Voto::get();
            if ($voto) {
                $result = array("code" => 200, "state" => true, "data" => $voto);
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }

        return response()->json($result);
    }

}
