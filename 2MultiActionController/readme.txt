1. We can add multiple actions in a controller
	http://localhost/1First/welcome
	Welcome from MVC with Annotation
	
	http://localhost/1First/hello
	Hello from MVC with Annotation

2. If we access url which is not mapped to any method, 
	http://localhost/1First/xyz 
	then we will get 404 error in front end and in backend log
	WARNING: No mapping found for HTTP request with URI [/1First/xyz] in DispatcherServlet with name 'spring-dispatcher'