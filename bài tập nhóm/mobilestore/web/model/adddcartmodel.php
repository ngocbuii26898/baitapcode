<?php  
    class addcartmodel {
        function getadd($id_username, $username, $id, $code, $name, $image, $price)
        {
        include "database/connect.php";
            $sql = "INSERT INTO addcart (`idLogin`, `nameLogin`, `id`, `code`, `name`, `image`, `price`)  
            VALUES ( '$id_username', '$username','$id', '$code', '$name', '$image', '$price');";
            mysqli_query($connect, $sql);
        }
        function selecttable($id_username) {
        include "database/connect.php";
            $sql = "SELECT * FROM `addcart` where $id_username;";
            $result = mysqli_query($connect, $sql);
            return $result;
        }
    }
?>