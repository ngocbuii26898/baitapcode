<?php
include "logincontro.php";
include "listproductcontro.php";
include "addproductscontro.php";
include "liststorecontro.php";
include "deleteproductcontro.php";
include "updateproductcontro.php";
include "listkindofitem.php";
include "single.php";
include "addcartproducts.php";
include "deletecart.php";
class maincontro
{
    function handleRequest()
    {
        $action = isset($_GET['action']) ? $_GET['action'] : '';
        switch ($action) {
            case "login":
                //echo "phần login  ";
                $usersname = $_POST['name'];
                $password = $_POST['password'];
                $logincontro = new logincontro;
                $logincontro->loginuser($usersname, $password);
                break;

            case "listproducts":
                //echo "listproducts";
                $listproducts = new listproductscontro;
                $listproducts->getlistproducts();
                break;

            case "addproducts":
                $add = new addproductcontro;
                $add->addpro();               
                include "view/backend_view/addproducts.php";
            break;

            case "liststore":
                $liststore = new liststorecontro;
                $liststore->listallstore();
            break;

            case "deleteproduct":
                $code = $_GET['code'];
                $image = $_GET['image'];
                $deleteproduct = new deleteproductcontro;
                $deleteproduct->deletepro($code, $image);
            break;

            case "updateproduct":
            if(isset($_POST['submit']))
            {               
                $updateproduct = new updateproductcontro;
                $updateproduct->updatecontro();
            }else
            {
                include "view/backend_view/updateproducts.php";
            }                          
            break;

            case "samsung":
                $where = 'samsung';
                $liststore = new listkindofitem;
                $liststore->listkindof($where);
            break;

            case "oppo":
                $where = 'oppo';
                $liststore = new listkindofitem;
                $liststore->listkindof($where);
            break;

            case "htc":
                $where = 'htc';
                $liststore = new listkindofitem;
                $liststore->listkindof($where);
            break;

            case "sony":
                $where = 'sony';
                $liststore = new listkindofitem;
                $liststore->listkindof($where);
            break;

            case "apple":
                $where = 'apple';
                $liststore = new listkindofitem;
                $liststore->listkindof($where);
            break;
            
            case "single": // chọn sản phẩm để nỏ vào giỏ hàng               
                $single = new single;
                $single->giohang();
            break;

            case "cart": // bỏ vào giỏi hàng
                $code = $_GET['code'];
                $image = $_GET['image'];
                $price = $_GET['price'];
                $id = $_GET['id'];
                $name = $_GET['name'];
                $addcart = new addcartproducts;
                $addcart->getaddcart($id, $code, $name, $image, $price);
            break;

            case "deletecart":
                $Deletecart = new deletecart;
                $Deletecart->getdelete();
            break;

            case "logout":
                session_destroy();
                header('Location: login.php'); 
            break;

            default:
                header('Location: login.php'); 
        }
    }
}
?>