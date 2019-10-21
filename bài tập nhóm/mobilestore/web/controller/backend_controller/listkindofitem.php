<?php
include "model/listkindofmodel.php";
    class listkindofitem {
        function listkindof($where) {
            $where = $this->actionselected($where);
            $listkindofmodel = new listkindofmodel;
            $result = $listkindofmodel->getlist("$where");
            include "view/backend_view/store.php";
        }
    function actionselected($item) // hàm sử lý selected
    {
        if ($item == "samsung") {
            return "phone1";
        }
        if ($item == "htc") {
            return "phone2";
        }
        if ($item == "oppo") {
            return "phone3";
        }
        if ($item == "apple") {
            return "phone4";
        }
        if ($item == "sony") {
            return "phone5";
        }
    }
    }
?>