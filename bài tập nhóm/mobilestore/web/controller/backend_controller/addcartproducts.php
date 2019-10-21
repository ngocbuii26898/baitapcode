<?php
    include "model/adddcartmodel.php";
    class addcartproducts {
        function getaddcart($id, $code, $name, $image, $price)
        {
            $id_username = $_SESSION['id_usname'];
            $username = $_SESSION['usersname'];
            $cars = array($_SESSION['id_usname'],"$username","$id", "$code", "$name","$image", "$price");
            foreach ($cars as $car) {
                echo "$car -- ";
            }

            // gọi model
            $Addcartmodel = new addcartmodel;
            $Addcartmodel->getadd($id_username, $username, $id, $code, $name, $image, $price);
            $result = $Addcartmodel->selecttable($id_username); 
            include "view/backend_view/addcart.php";
        }
    }
?>