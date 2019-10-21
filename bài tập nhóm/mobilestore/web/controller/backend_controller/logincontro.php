<?php
include "model/loginmodel.php";
class logincontro // controller login
{
    function loginuser($usersname, $password)
    {
        if (isset($_POST['Submit'])) {
            if ($usersname == "" && $password == "") {
                header('Location: login.php');
            } else {
                $Models = new loginmodel();
                $check = $Models->getlogin($usersname, $password);
                if ($check) {
                    $_SESSION['usersname'] = $usersname;
                    while ($row = $check->fetch_assoc())
                    {
                        if($usersname == $row['name']) {
                            $_SESSION['id_usname'] = $row['id'];
                            break;
                        }
                    }
                    //echo "<script> alert('$usersname'); </script>";
                    header('Location: index.php?action=listproducts');
                } else {
                    header('Location: view/frontend_view/404.php');
                }	
            }
        }
    }
}
?>