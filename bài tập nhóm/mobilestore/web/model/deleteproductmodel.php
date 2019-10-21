<?php
    class deleteproductmodel {
        function getdelete($code)
        {
            include "database/connect.php";
            $sql = "DELETE FROM productdetails WHERE code = '$code'";
            mysqli_query($connect, $sql);
        }
    }
?>