function registration(event) {
	event.preventDefault(); // Prevents the form from submitting

	const username = document.getElementById('username').value;
	const password = document.getElementById('password').value;
	const email = document.getElementById('email').value;

	// Make a POST request to the backend
	fetch('/api/users/register', {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify({ username: username, password: password, email: email })
	})
		.then(response => response.text())
		.then(data => {
			alert(data); // Display the response message
		})
		.catch(error => {
			console.error('Error:', error);
		});
}