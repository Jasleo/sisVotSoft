<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Http\Request;
use App\Http\Controllers\Controllers;
use App\Voto;
use App\Persona;
use App\Candidato;

class VotoController extends Controller {

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
