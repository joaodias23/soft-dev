<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UtilController extends Controller
{
    public function home(){

        $myName = 'Joao';

        return view('homepage', compact('myName'));
    }

    public function hello(){
        return '<h1>Olá Mundo</h1>';
    }

    public function welcome($name){
        return "<h1>Bem Vindo $name</h1>";
    }

    public function fallback(){
        return view('fallback');
    }
}
