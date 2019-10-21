<?php
    class updateproductmodel {
        function getupdate ($id, $code, $name, $image, $price, $description) {
            include "database/connect.php";
            $sql = "UPDATE productdetails SET price = '$price', image = '$image', description = '$description', name = '$name' WHERE code = '$code'";
            mysqli_query($connect, $sql);
        }
    }
?>