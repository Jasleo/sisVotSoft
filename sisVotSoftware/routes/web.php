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
    $app->get('nacionalidad', 'NacionalidadController@listNacionalidad');
    $app->get('persona', 'PersonaController@listPersona');
    
    $app->get('partido', 'PartidoController@listPersona');
    
    
});

//admin

//$router->get('/api/v1/personas', function () use ($router) {
//    return $results = DB::select("SELECT * FROM persona");
//});
