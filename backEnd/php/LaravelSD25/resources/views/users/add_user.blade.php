@extends('layouts.fe_master')

@section('content')

    <h2>Olá, aqui podes Adicionar Utilizadores</h2>
    <ul>
        @foreach ($users as $user)
            <li>{{ $user }}</li>
        @endforeach
    </ul>
@endsection