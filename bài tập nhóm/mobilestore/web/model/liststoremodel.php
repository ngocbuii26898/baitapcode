<?php
    class liststoremodel {
        function getliststoremodel () {
            include "database/connect.php";
            $sql = "SELECT productdetails.name, productdetails.code, products.id, productdetails.image, productdetails.price, productdetails.description
                FROM products
                INNER JOIN productdetails
                ON products.id = productdetails.id;";
            $result = mysqli_query($connect, $sql);
            return $result;
        }
    }
?>