function registration(event)
{
	var url="http://localhost:8080/sdp/register";
	var data=JSON.stringify({
		"name":t1.value,
		"mob":t2.value,
		"pws":t3.value
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