<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Http\Request;
use App\Http\Controllers\Controllers;
use App\Partido;


class ExampleController extends Controller
{

    public function listPartido() {
        try {
            $result = array("code" => 200, "state" => true, "data" => array());
            $partido = Partido::get();

            if ($partido) {
                $result = array("code" => 200, "state" => true, "data" => $partido);
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }

        return response()->json($result);
    }

}
