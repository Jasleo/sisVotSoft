<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Http\Request;
use App\Http\Controllers\Controllers;
use App\Pais;

class PaisController extends Controller
{
    
    public function listPais() {
        try {
            $result = array("code" => 200, "state" => true, "data" => array());
            $pais = Pais::get();

            if ($pais) {
                $result = array("code" => 200, "state" => true, "data" => $pais);
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }

        return response()->json($result);
    }

}
