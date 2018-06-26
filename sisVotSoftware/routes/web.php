<?php

/*
  |--------------------------------------------------------------------------
  | Application Routes
  |--------------------------------------------------------------------------
  |
  | Here is where you can register all of the routes for an application.
  | It is a breeze. Simply tell Lumen the URIs it should respond to
  | and give it the Closure to call when that URI is requested.
  |
 */

$router->get('/', function () use ($router) {
    return $router->app->version();
});

$router->group(['namespace' => 'api', 'prefix' => 'api/v1'], function ($app) {
    $app->get('listNacionalidad', 'NacionalidadController@listNacionalidad');
    $app->post('nacionalidad', 'NacionalidadController@createNacionalidad');
    $app->delete('nacionalidad/{id}', 'NacionalidadController@deleteNacionalidad');
    //$app->put('nacionalidad/in/{id}', 'NacionalidadController@updateNacionalidad');

    $app->get('listPais', 'PaisController@listPais');
    $app->post('pais', 'PaisController@createPais');
    $app->delete('pais/{id}', 'PaisController@deletePais');
    //$app->put('pais/in/{id}', 'PaisController@updatePais');

    $app->get('privilegio', 'PrivilegioController@listPrivilegio');

    $app->get('listCuenta', 'CuentaController@listCuenta');
    $app->post('cuenta', 'CuentaController@createCuenta');
//    $app->delete('cuenta/{id}', 'CuentaController@deleteCuenta');
    $app->put('cuenta/{id}', 'CuentaController@updateCuenta');

    $app->get('listPersona', 'PersonaController@listPersona');
    $app->post('persona', 'PersonaController@createPersona');
//    $app->delete('persona/{id}', 'PersonaController@deletePersona');
    $app->put('persona/{rut}', 'PersonaController@updatePersona');

    $app->get('listPartido', 'PartidoController@listPartido');
    $app->post('partido', 'PartidoController@createPartido');
    $app->delete('partido/{id}', 'PartidoController@deletePartido');
    //$app->put('partido/in/{id}', 'PartidoController@updatePartido');

    $app->get('listCandidato', 'CandidatoController@listCandidato');
    $app->post('candidato', 'CandidatoController@createCandidato');
    $app->delete('candidato/{id}', 'CandidatoController@deleteCandidato');
    //$app->put('candidato/in/{id}', 'CandidatoController@updateCandidato');

    $app->get('listVoto', 'VotoController@listVoto');
    $app->post('voto', 'VotoController@createVoto');
});

//admin
//
$router->get('/api/v1/listPersona/{texto}', function ($texto) {
//    return $results = DB::select("SELECT * FROM persona WHERE rut like '19851468-3'");
    return $results = DB::select("SELECT * FROM persona WHERE rut like '%$texto%' or nombre like '%$texto%' or apellido like '%$texto%'");
});

$router->get('/api/v1/getPersona/{rut}', function ($rut) {
    return $results = DB::select("SELECT * FROM persona WHERE rut like '%$rut%'");
});

$router->get('/api/v1/getCandidato/{rut}', function ($rut) {
    return $results = DB::select("SELECT candidato.id AS 'id', candidato.persona_fk AS 'rut', persona.nombre AS 'nombre', persona.apellido AS 'apellido', partido.descripcion AS 'partido' FROM persona, partido, candidato WHERE persona.rut = candidato.persona_fk AND partido.id = candidato.partido_fk AND persona.rut like '$rut'");
});
