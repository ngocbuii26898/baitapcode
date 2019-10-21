<?php
    class listkindofmodel{
        function getlist($where) {
            include "database/connect.php";
            $sql = "SELECT productdetails.name, productdetails.code, products.id, productdetails.image, productdetails.price, productdetails.description 
            FROM products INNER JOIN productdetails 
            ON products.id = productdetails.id 
            WHERE productdetails.id = '$where'";
            $result = mysqli_query($connect, $sql);
            return $result;
        }
    }
?>