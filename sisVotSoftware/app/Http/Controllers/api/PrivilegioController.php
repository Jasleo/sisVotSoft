<?php

namespace App\Http\Controllers\api;

use Illuminate\Http\Request;
use App\Http\Requests;
use App\Http\Controllers\Controller; 
use App\Privilegio;


class PrivilegioController extends Controller {

    //solo se necesita saber los tipos de usuarios

        public function listPrivilegio() {
        try {
            $result = array("code" => 100, "state" => true, "data" => array());
            $privilegio = Privilegio::get();

            if ($privilegio) {
                $result = array("code" => 200, "state" => true, "data" => $privilegio);
            }
        } catch (\Exception $e) {
            $result = array("code" => 404, "state" => false, "data" => $e->getMessage());
        }

        return response()->json($result);
    }


}
