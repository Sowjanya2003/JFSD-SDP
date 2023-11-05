function register()
{
	 var url="http://localhost:8080/sdp/register";
	 var data=JSON.stringify({
		  "name":t1.value,
		  "mob":t2.value,
		  "pws":t3.value
	 });
	 
	 callApi("POST",url,data,getResponse);
}
function update()
{
	var url="http://localhost:8080/sdp/update/"+t1.value+"/"+t2.value;
	callApi("PUT",url,"",getResponse);
}
function deleteData()
{
	var url="http://localhost:8080/sdp/delete/"+t1.value;
	callApi("DELETE",url,"",getResponse);
}
function view()
{
	var url="http://localhost:8080/sdp/read";
	callApi("GET",url,"",getResponseTable);
}
function getResponseTable(res)
{
	var data=JSON.parse(res);
	var table=`<table border="1">
				<tr>
					<th>NAME</th>
					<th>MOBILE</th>
					<th>PASSWORD</th>
				</tr>`;
			for(var x in data)
			{
				table+=`<tr>
							<td>` + data[x].name + `</td>
							<td>` + data[x].mob + `</td>
							<td>` + data[x].pws + `</td>
						</tr>`;
			}
			table+=`</table>`
	viewData.innerHTML=table;
}
function getResponse(res)
{
 	l1.innerText=res;
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