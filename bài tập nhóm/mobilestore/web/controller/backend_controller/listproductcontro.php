<?php
class listproductscontro
{
    function getlistproducts()
    {
        include "model/listproductsmodel.php";
        $listproducts = new modelgetlistproducts;
        $result = $listproducts->modelgetlistproducts();// trả về dữ liệu đổ ra view

        //$num_row = $listproducts->modelgetnumrow(); // trả về số cột int
        include "view/frontend_view/listproducts.php";
    }
}
?>