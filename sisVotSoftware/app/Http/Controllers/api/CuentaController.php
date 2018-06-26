<?php

namespace App\Http\Controllers\api;

use Illuminate\Http\Request;
use App\Http\Requests;
use App\Http\Controllers\Controller;
use App\Cuenta;

class CuentaController extends Controller {

    public function createCuenta(Request $request) {
        try {
            $cuenta = Cuenta::create($request->all());
            $result = array("code" => 200, "state" => true, "data" => "Cuenta Registrada");
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
        }
        return response()->json($result);
    }

    public function listCuenta() {
        try {
            $result = array("code" => 200, "state" => true, "data" => array());
            $cuenta = Cuenta::get();
            if ($cuenta) {
                $result = $cuenta;
            }
        } catch (\Exception $e) {
            $result = array("code" => 500, "state" => false, "data" => $e->getMessage());
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

    public function updateCuenta(Request $request, $id) {

        // Comprobamos si el id de cuenta que nos están pasando existe o no.
        $cuenta = Cuenta::find($id);

        $id_new = $request->input('id');
        $rutPersona_fk = $request->input('rutPersona_fk');
        $pass = $request->input('pass');
        $privilegio_fk = $request->input('privilegio_fk');

        echo 'ID RESCATO : ' . $id_new;
        echo ' RUT PERSONA : ' . $rutPersona_fk;
        echo ' PASS : ' . $pass;
        echo ' PRIVILEGIO : ' . $privilegio_fk;
        
        $cuenta->id = $id_new;
        $cuenta->rutPersona_fk = $rutPersona_fk;
        $cuenta->pass = $pass;
        $cuenta->privilegio_fk = $privilegio_fk;       
        
        $cuenta->save();

        return response()->json($cuenta);
    }

}
