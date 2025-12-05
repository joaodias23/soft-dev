<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <link rel="stylesheet" href="{{ asset('css/style.css') }}">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous" defer></script>
</head>
<body>

    <nav class="navbar navbar-dark bg-dark navbar-expand-lg custom-nav">
        <div class="container-fluid">

            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse justify-content-center" id="navbarSupportedContent">
                <ul class="navbar-nav gap-4">
                    <li class="nav-item"><a class="nav-link" href="{{route('welcome')}}">Welcome Page</a></li>
                    <li class="nav-item"><a class="nav-link" href="{{route('home')}}">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="{{route('hello')}}">Hello</a></li>
                    <li class="nav-item"><a class="nav-link" href="{{route('users.add')}}">Adicionar Utilizador</a></li>
                </ul>
            </div>

        </div>
    </nav>

    <div class="container">
        @yield('content')

        <img class="d-block mx-auto fixed-bottom" src="{{ asset('images/f075f8eafdf57e0a5530def18b83e9da.jpg') }}" alt="welcomeimg">

        <footer class="fixed-bottom text-center">
            Powered by s̵͎͖͓̔d̴͍̤̄̽f̷̦̫̹̾̎̂͘s̴͕̙͚̘̙̔͂͗̇͘d̸̺͍͓̫͊͗̉g̴͍̰̝̊̆̉͜͝f̶͙͍̒̎̇d̵̗̖̫̊g̸̰̅̔͋d̸̜͎̜̭̯̅̋̓ǧ̶̤̚d̸̩͔̓͑̍̾̐f̸̢̓̓̓̋̚ḡ̵̙̈̎ ̴̡͕͕͇̀̈̔͛̕
        </footer>
    </div>
</body>
</html>