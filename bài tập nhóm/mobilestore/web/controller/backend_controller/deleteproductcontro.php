<?php
    include "model/deleteproductmodel.php";
    class deleteproductcontro {
        function deletepro($code, $image)
        {
            unlink($image);
            $deleteproduct = new deleteproductmodel;
            $deleteproduct->getdelete($code);
            header("location: index.php?action=liststore");
        }
    }
?>