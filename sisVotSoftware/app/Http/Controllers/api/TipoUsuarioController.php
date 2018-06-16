<?php

namespace App\Http\Controllers\api;

use Illuminate\Http\Request;
//use App\Http\$_REQUEST;
use App\Http\Controllers\Controllers;
use App\TipoUsuario;

class ExampleController extends Controller
{
    //solo se necesita saber los tipos de usuarios
    public function listTipoUsuario(){
        try{
            $result = array("code" => 200, "state" => true, "data" => array());
            $tipoUsuario = TipoUsuario::get();
                    
            if($tipoUsuario){
                $result = array("code" => 200, "state" => true, "data" => $tipoUsuario);
            }        
            
        } catch (\Exception $e){
            $result = array("code" => 500, "state" => false, "data" =>  $e->getMessage());    
        }
        
        return response()->json($result);
    }
    
}
