<?php

namespace App\Http\Controllers\api;

use Illuminate\Http\Request;
use App\Http\Requests;
use App\Http\Controllers\Controller; 
use App\Candidato;
use App\Persona;
use App\Partido;

class CandidatoController extends Controller {

    public function createCandidato(Request $request) {
        try {
            $candidato = Candidato::create($request->all());
            $result = array("code" => 200, "state" => true, "data" => "Candidato Registrada");
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }

    public function listCandidato() {
        try {
            $result = array("code" => 200, "state" => true, "data" => array());
            $candidato = Candidato::get();

            if ($candidato) {
                $result = array("code" => 200, "state" => true, "data" => $candidato);
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }

        return response()->json($result);
    }

    public function deleteCandidato($id) {
        try {
            $result = array("code" => 200, "state" => true, "data" => "The search did not find results");
            $candidato = Candidato::find($id);
            if ($candidato) {
                $candidato->delete();
                $result = array("code" => 200, "state" => true, "data" => "Candidato eliminado");
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }
 
}
