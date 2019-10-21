<?php
include "model/updateproductmodel.php";
    class updateproductcontro {
        function updatecontro() {           
                $name = $_POST['name'];
                $id = $_POST['getid'];
                //$id = $this->actionselected($name); // đổi item sang id
                $price = $_POST['price'];
                $code = $_POST['code'];
                $description = $_POST['description'];
                $image = $_POST['image'];
                $updatepro = new updateproductmodel;
                $updatepro->getupdate($id, $code, $name, $image, $price, $description);
                header("location: index.php?action=liststore");        
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