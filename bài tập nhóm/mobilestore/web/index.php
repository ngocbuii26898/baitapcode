<?php
	session_start();
?>

<?php include "common/header.php" ?>
		<div class="wrap">
		<!----start-Header---->
		<div class="header">
			<div class="search-bar">
				<form>
					<input type="text"><input type="submit" value="Search" />
				</form>
			</div>
			<div class="clear"> </div>
			<div class="header-top-nav">
				<ul>
					<li><a href="index.php?action=listproducts">Home</a></li>
					<li><a href="login.php">Login</a></li>
					<li><a href="index.php?action=logout">Logout</a></li>
					<li><a href="#">New Products</a></li>
					<li><a href="index.php?action=deletecart">My Cart</a></li>
					<li><a href="#"><span>shopping cart&nbsp;&nbsp;: </span></a><label> &nbsp;noitems</label></li>
				</ul>
			</div>
			<div class="clear"> </div>
		</div>
		</div>
		<div class="clear"> </div>
		<div class="top-header">
			<div class="wrap">
		<!----start-logo---->
		<?php include "common/logo.php" ?>
		<!----end-logo---->
		<!----start-top-nav---->
		<?php include "common/top_nav.php" ?>
		<div class="clear"> </div>
		</div>
		</div>
		<!----End-top-nav---->
		<!----End-Header---->
	<!--start-image-slider---->
					<?php include "common/slide.php" ?>
		    <div class="clear"> </div>
		    <div class="wrap">
		    <?php include "common/content.php" ?>
		    	</div>
		<!--nhận sự kiện-->

			<?php
				include "controller/backend_controller/maincontro.php";
				$controller = new maincontro;
				$controller->handleRequest();
			?>
<?php// include "common/sidebar.php" ?>
		    <div class="clear"> </div>
		    </div>
			<?php include "common/footer.php" ?>
		
