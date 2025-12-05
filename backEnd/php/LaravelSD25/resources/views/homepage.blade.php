@extends('layouts.fe_master')

@section('content')

@if($myName)
    <h2>Bem-vindo, {{$myName}}</h2>
@else
    <h2>Faça login amigo, não tenho o seu nome</h2>
@endif

@endsection
