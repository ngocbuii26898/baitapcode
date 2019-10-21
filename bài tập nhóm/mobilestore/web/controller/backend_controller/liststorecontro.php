<?php
    class liststorecontro {
        function listallstore()
        {
            include "model/liststoremodel.php";
            $listproducts = new liststoremodel;
            $result = $listproducts->getliststoremodel();
            include "view/backend_view/store.php";
        }
    }
?>