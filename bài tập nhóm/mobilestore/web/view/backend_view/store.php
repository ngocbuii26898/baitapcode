<div class="wrap">
		    <!-- <div class="clear"> </div>
		    <div class="wrap">
		    <div class="content">
		    <div class="content-grids"> -->
		    	
<div align="left" style="min-height:800px;">
	
	<div id="cart_wrapper" align="center">
	
		<form action="#" id="cart_form" name="cart_form">
		
			<div class="cart-info"> </div>
			
			<div class="cart-total">
			
				<b>Total Charges:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b> $<span>0</span>
				
				<input type="hidden" name="total-hidden-charges" id="total-hidden-charges" value="0" />
			</div>
			
			<button type="submit" id="Submit">CheckOut</button>
		
		</form>
	</div>
	
	<div id="wrap" align="center">
		
		<a id="show_cart" href="javascript:void(0)">PHONE IN STORE</a>
		
		<ul>
			<?php
				$id = 0;
				while ($row = $result->fetch_assoc()) {
					$id++;
					$name = $row['name'];
					$image = $row['image'];
					$price = $row['price'];
					$description = $row['description'];
					$getid = $row['id'];
					$code = $row['code'];
					echo "<li id='$id' style='height:416px;'>";
					echo "<img src='$image' class='items' alt='' style='height:268px; width:200px;'/>";
					echo "<br clear='all' />";
					echo "<div>$name</div>";
					echo "<div style='margin-top:-10px;'>$price</div>";
					echo "<div class='action' style='width:100%; margin-top: -5px;'>	
					<a href='index.php?action=updateproduct&getid=$getid&name=$name&image=$image&price=$price&description=$description&code=$code' style='border:solid; background: #0061ff; color: #ffffff;'>
					<span class='update'>
						UPDATE
					</span>
					</a>
					<a href='index.php?action=deleteproduct&code=$code&image=$image' style='border:solid; background: red; color: #ffffff;'>
					<span class='delete'>
						DELETE
					</span>
							</a>
						</div>
					</li>";
				}
			?>
			</div>			
			</div>		
			<br clear="all" />
		</ul>
		<br clear="all" />
	</div>
	
		
</div>
	</div>	    </div>
		    	
		    </div>
		    <div class="clear"> </div>
		    </div>
		