<#macro mainLayout title="WebAppGettingStarted">
<!DOCTYPE html>
<html>
<head>

<title>${title}</title>
</head>
<body>
	<div>
		<#include "header.ftl" />
	</div>


	<div>
		<#nested />
	</div>


	<div>
		<#include "footer.ftl" />
	</div>


</body>
</html>
</#macro>