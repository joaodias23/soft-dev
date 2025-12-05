<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    public function addUsers(){
        $users = $this->getAllUsers();
        return view('users.add_user', compact('users'));
    }

    private function getAllUsers(){
        $users = ['Antonio', 'Miguel', 'Tirolino', 'Cervantes'];
        return $users;
    }
}
