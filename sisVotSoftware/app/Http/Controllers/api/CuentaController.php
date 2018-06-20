<?php

namespace App\Http\Controllers\api;

use Illuminate\Http\Request;
use App\Http\Requests;
use App\Http\Controllers\Controller; 
use App\Cuenta;


class CuentaController extends Controller
{
    
    public function createCuenta(Request $request) {
        try {
            $cuenta = Cuenta::create($request->all());
            $result = array("code" => 200, "state" => true, "data" => "Cuenta Registrada");
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }

    public function listCuenta(){
        try{
            $result = array("code" => 200, "state" => true, "data" => array());
            $cuenta = Cuenta::get();
            if($cuenta){
                $result = array("code" => 200, "state" => true, "data" => $cuenta);
            }        
        } catch (\Exception $e){
            $result = array("code" => 500, "state" => false, "data" =>  $e->getMessage());    
        }
        
        return response()->json($result);
    }
    
    public function deleteCuenta($id) {
        try {
            $result = array("code" => 200, "state" => true, "data" => "The search did not find results");
            $cuenta = Cuenta::find($id);
            if ($cuenta) {
                $cuenta->delete();
                $result = array("code" => 200, "state" => true, "data" => "The cuenta was deleted successfully");
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }

    //falta update

}
