<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Http\Request;
use App\Http\Controllers\Controllers;
use App\Nacionalidad;

class NacionalidadController extends Controller {

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

}
