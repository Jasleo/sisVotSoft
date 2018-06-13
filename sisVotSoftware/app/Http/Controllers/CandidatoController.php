<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Http\Request;
use App\Http\Controllers\Controllers;
use App\Candidato;
use App\Persona;
use App\Partido;

class CandidatoController extends Controller {

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

}
