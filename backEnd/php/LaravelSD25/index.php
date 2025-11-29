<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Servidor</title>
</head>
<body>
    <?php
        $myName = 'Joao';
        $myPassword = '123456';
        $myNumber = 15;
        $students = ['Ruben', 'Teresa', 15, true];

        foreach($students as $student){
            echo '<p>'.$student.'</p>';
        }
    ?>
    <h5>Olá Servidor</h5>
    <p>Olá, o meu nome é <?=$myName?>, o meu numero é <?=$myNumber?></p>
</body>
</html>