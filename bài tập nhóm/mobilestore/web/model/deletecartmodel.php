<?php
    class deletecartmodel {
        function getdeletemodel($iditem, $idus)
        {
            include "database/connect.php";
            $sql = "DELETE FROM addcart WHERE id = '$iditem' and idLogin = '$idus'";
            mysqli_query($connect, $sql);
        }
    }
?>