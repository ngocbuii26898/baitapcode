<?php
class modelgetlistproducts
{
    function modelgetlistproducts()
    {
        include "database/connect.php";
        $sql = "SELECT products.name, productdetails.id, productdetails.code, productdetails.image, productdetails.price, productdetails.description
                FROM products
                INNER JOIN productdetails
                ON products.id = productdetails.id
                WHERE productdetails.description = 'new';";
        $result = mysqli_query($connect, $sql);
        return $result;
    }

    // function modelgetnumrow() {
    //     include "database/connect.php";
    //     $sql = "SELECT * FROM `productdetails`;";
    //     $num_row = mysqli_num_rows($connect, $sql);
    //     return $num_row;
    // }
}
?>