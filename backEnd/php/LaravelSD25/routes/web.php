<?php

use App\Http\Controllers\UserController;
use App\Http\Controllers\UtilController;
use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
})->name('welcome');

Route::get('/home', [UtilController::class, 'home'])->name('home');

Route::get('/hello', [UtilController::class, 'hello'])->name('hello');

Route::get('/welcome/{name}', [UtilController::class, 'welcome'])->name('');

Route::get('/add-users', [UserController::class, 'addUsers'])->name('users.add');

Route::fallback([UtilController::class, 'fallback'])->name('fallback');