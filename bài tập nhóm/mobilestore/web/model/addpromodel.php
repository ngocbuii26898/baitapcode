<?php
    class addpromodel {
        function addmodel($id, $code, $name, $price, $image, $description) {
            include "database/connect.php";
            $sql = "INSERT INTO `productdetails`(`id`, `code`, `name`, `image`, `price`, `description`) 
            VALUES ('$id', '$code', '$name','$image','$price','$description')";
            mysqli_query($connect, $sql);
        }
    }
?>