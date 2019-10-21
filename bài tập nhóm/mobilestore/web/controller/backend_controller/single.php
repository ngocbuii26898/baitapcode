<?php
    class single{
        function giohang() {
            $image = $_GET['image'];
            $code = $_GET['code'];
            $price = $_GET['price'];
            $id = $_GET['id'];
            $name = $_GET['name'];
            include "view/backend_view/single.php";
        }
    }
?>