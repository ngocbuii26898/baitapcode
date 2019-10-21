<?php
include "model/addpromodel.php";
    class addproductcontro{
        function addpro()
        {    
            if (isset($_POST['submit'])) {
                $item = $_POST['item'];
                $id = $this->actionselected($item);
                $name = $_POST['name'];
                $price = $_POST['price'];
                $code = $_POST['code'];
                $description = $_POST['description'];
                $image = $this->loadimage();
                $addpro = new addpromodel;
                $addpro->addmodel($id, $code, $name, $price, $image, $description);
            }
        }

    function actionselected($item) // hàm sử lý selected
    {
        if ($item == "sony" || $item == "Sony") {
            return "phone5";
        }
        if ($item == "Samsung")
        {
            return "phone1";
        } 
        if($item == "Htc")
        {
            return "phone2";
        } 
        if($item == "Oppo")
        {
            return "phone3";
        } 
        if ($item == "Apple")
        {
            return "phone4";
        } 
        
    }

    function loadimage() // hàm sử lý ảnh
    {
        if ($_SERVER['REQUEST_METHOD'] == "POST") {
            $error = array();
            $target_dir = "images/";
            $target_file = $target_dir . basename($_FILES['fileUpload']['name']);
            $type_file = pathinfo($_FILES['fileUpload']['name'], PATHINFO_EXTENSION);
            $type_fileAllow = array('png', 'jpg', 'jpeg', 'gif');
            if (!in_array(strtolower($type_file), $type_fileAllow)) {
                $error['fileUpload'] = "File bạn vừa chọn hệ thống không hỗ trợ";
            }
            $size_file = $_FILES['fileUpload']['size'];
            if ($size_file > 5242880) {
                $error['fileUpload'] = "File bạn chọn không được quá 5MB";
            }
            if (empty($error)) {
                if (move_uploaded_file($_FILES["fileUpload"]["tmp_name"], $target_file)) {
                    return $target_file;
                }
            }
        }
    }
}
?>