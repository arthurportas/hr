<#import "spring.ftl" as spring />
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">New User</h1>
    </div><!-- /.col-lg-12 -->
</div><!-- /.row -->
<div class="row">
	<div class="container">
    	<div class="row well">
    		<form id="admin-form-new-user" class="form-horizontal" role="form">
    			<div class="form-group">
    				<label for="inputFirstName" class="col-sm-2 control-label">FirstName</label>
    				<div class="col-sm-4">
     						<input type="text" class="form-control" id="inputFirstName" placeholder="FirstName" required>
    				</div>
  				</div>
  				<div class="form-group">
    				<label for="inputLastName" class="col-sm-2 control-label">LastName</label>
    				<div class="col-sm-4">
    					<input type="text" class="form-control" id="inputLastName" placeholder="LastName" required>
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="inputEmail" class="col-sm-2 control-label">Email</label>
    				<div class="col-sm-4">
    					<input type="email" class="form-control" id="inputEmail" placeholder="Email" required>
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="inputAddress" class="col-sm-2 control-label">Address</label>
    				<div class="col-sm-4">
    					<input type="text" class="form-control" id="inputAddress" placeholder="Address" required>
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="inputZipCode" class="col-sm-2 control-label">Zipcode</label>
    				<div class="col-sm-4">
    					<input type="text" class="form-control" id="inputZipCode" placeholder="ZipCode" required>
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="inputCity" class="col-sm-2 control-label">City</label>
    				<div class="col-sm-4">
    					<input type="text" class="form-control" id="inputCity" placeholder="City" required>
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="inputCountry" class="col-sm-2 control-label">Country</label>
    				<div class="col-sm-4">
    					<input type="text" class="form-control" id="inputCountry" placeholder="Country" required>
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="inputUserKind" class="col-sm-2 control-label">UserKind</label>
    				<div class="col-sm-4">
    					<input type="text" class="form-control" id="inputUserKind" placeholder="UserKind" required>
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="inputCompany" class="col-sm-2 control-label">Company</label>
    				<div class="col-sm-4">
    					<input type="text" class="form-control" id="inputCompany" placeholder="Company">
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="inputNif" class="col-sm-2 control-label">Nif</label>
    				<div class="col-sm-4">
    					<input type="text" class="form-control" id="inputNif" placeholder="Nif" required>
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="inputPhoneNumber" class="col-sm-2 control-label">PhoneNumber</label>
    				<div class="col-sm-4">
    					<input type="text" class="form-control" id="inputPhoneNumber" placeholder="PhoneNumber">
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="inputCellPhone" class="col-sm-2 control-label">CellPhone</label>
    				<div class="col-sm-4">
    					<input type="text" class="form-control" id="inputCellPhone" placeholder="CellPhone" required>
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="inputFax" class="col-sm-2 control-label">Fax</label>
    				<div class="col-sm-4">
    					<input type="text" class="form-control" id="inputfax" placeholder="Fax">
    				</div>
    			</div>
    			<div class="form-group">
    				<label for="inputPassword" class="col-sm-2 control-label">Password</label>
    				<div class="col-sm-4">
    					<input type="password" class="form-control" id="inputPassword" placeholder="Password" required>
    				</div>
  				</div>
  				<div class="form-group">
    				<div class="col-sm-offset-2 col-sm-10">
    					<button id="submit-admin-form-new-user" type="button" class="btn btn-primary">Save</button>
    				</div>
  				</div>
			</form>
    	</div><!-- /.row well -->
	</div><!-- /.container-->
</div><!-- /.row -->