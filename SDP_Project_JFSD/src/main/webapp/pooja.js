function addPooja()
{
	 var url="http://localhost:8080/sdp1/pooja";
	 var data=JSON.stringify({
		  "name":s1.value,
		  "email":s2.value,
		  "phone":s3.value,
		  "poojaname":s4.value,
		  "date":s5.value,
		  "time":s6.value,
	 });
	 
	 callApi("POST",url,data,getResponse);
}
function getResponse(res)
{
	alert(res);
}
function callApi(METHOD,URL,DATA,SUCCESS)
{
	 var xhttp=new XMLHttpRequest();
	 xhttp.open(METHOD,URL,true)
	 xhttp.setRequestHeader('Content-Type','application/json');
	 xhttp.onreadystatechange=function()
	 {
	 	if(this.readyState == 4)
	  	{
		   	if(this.status == 200)
		    	SUCCESS(this.responseText);
		   	else
		    	alert("404: Service unavailable"); 
		   
		}
		  
	 };
	 xhttp.send(DATA);
}