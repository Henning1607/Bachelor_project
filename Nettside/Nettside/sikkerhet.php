<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
            session_start();
            if(isset($_SESSION['id']))
            {
                session_destroy();
                header("location:index.html");
            }
            else
            {
                session_destroy();
                header("location:index.html");

            }
        ?>
    </body>
</html>
