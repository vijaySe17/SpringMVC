1. We can add multiple actions in a controller
	http://localhost/1First/welcome
	Welcome from MVC with Annotation
	
	http://localhost/1First/hello
	Hello from MVC with Annotation

2. If we access url which is not mapped to any method, 
	http://localhost/1First/xyz 
	then we will get 404 error in front end and in backend log
	WARNING: No mapping found for HTTP request with URI [/1First/xyz] in DispatcherServlet with name 'spring-dispatcher'
	
3. We can add @RequestMapping in controller level (class)
	This will be prefix path for resources in controller
	eg. http://localhost/1First/greet/hello
		http://localhost/1First/greet/welcome
	If we try to access without prefix (greet), we will get 404 error.