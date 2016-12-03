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
	
4. The @RequestMapping should be unique, any 2 handlers shouldn't have same @RequestMapping.
	if we specify same @RequestMapping for more than one method and we try to access that resource, we will get "Ambiguous handler methods mapped" error
	
	eg. http://localhost/1First/greet/welcome

	EVERE: Servlet.service() for servlet [spring-dispatcher] in context with path [/1First] threw exception [Request processing failed; nested exception is java.lang.IllegalStateException: Ambiguous handler methods mapped for HTTP path '/greet/welcome': {public org.springframework.web.servlet.ModelAndView com.sample.HelloController.welco(), public org.springframework.web.servlet.ModelAndView com.sample.HelloController.welco1()}. If you intend to handle the same path in multiple methods, then factor them out into a dedicated handler class with that path mapped at the type level!] with root cause
	java.lang.IllegalStateException: Ambiguous handler methods mapped for HTTP path '/greet/welcome': {public org.springframework.web.servlet.ModelAndView com.sample.HelloController.welco(), public org.springframework.web.servlet.ModelAndView com.sample.HelloController.welco1()}. If you intend to handle the same path in multiple methods, then factor them out into a dedicated handler class with that path mapped at the type level!
		at org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter$ServletHandlerMethodResolver.resolveHandlerMethod(AnnotationMethodHandlerAdapter.java:649)
		at org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter.invokeHandlerMethod(AnnotationMethodHandlerAdapter.java:435)
		at org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter.handle(AnnotationMethodHandlerAdapter.java:428)
		at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:963)
		at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:897)
		at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:970)
		at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:861)
		at javax.servlet.http.HttpServlet.service(HttpServlet.java:620)
		at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:846)
		at javax.servlet.http.HttpServlet.service(HttpServlet.java:727)
		at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:303)
		at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:208)
		at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52)
		at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:241)
		at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:208)
		at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:220)
		at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:122)
		at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:501)
		at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:171)
		at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:103)
		at org.apache.catalina.valves.AccessLogValve.invoke(AccessLogValve.java:950)
		at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:116)
		at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:408)
		at org.apache.coyote.http11.AbstractHttp11Processor.process(AbstractHttp11Processor.java:1070)
		at org.apache.coyote.AbstractProtocol$AbstractConnectionHandler.process(AbstractProtocol.java:611)
		at org.apache.tomcat.util.net.JIoEndpoint$SocketProcessor.run(JIoEndpoint.java:316)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
		at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)
		at java.lang.Thread.run(Thread.java:744)
		--------------------------------------------
5. Update from 4RequestParam_HTML_form- url pattern same and method differs also np. Below path with different request method will work
		@RequestMapping(value="/submitForm.html", method=RequestMethod.POST)
		@RequestMapping(value="/submitForm.html", method=RequestMethod.GET)
