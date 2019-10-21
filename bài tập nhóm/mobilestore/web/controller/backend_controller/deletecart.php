<?php
include "model/deletecartmodel.php";

    class deletecart {
        function getdelete()
        {
            if (isset($_GET['idus']))
            {
                $isitem = $_GET['isitem'];
                $idus = $_GET['idus'];
                $Deletecartmodel = new deletecartmodel;
                $Deletecartmodel->getdeletemodel($isitem, $idus);
            }
            
            $Addcartmodel = new addcartmodel;
            $result = $Addcartmodel->selecttable($idus); 
            include "view/backend_view/addcart.php";
        }
    }
?>