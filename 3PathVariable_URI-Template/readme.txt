1. We can pass value in url path and we can access path variable from URI using @PathVariable
 	we can specify uri variable using {} in @RequestMapping
 	eg. http://localhost/1First/hello/Vijay
 	@RequestMapping("/hello/{user}") //url pattern with pathVariable
	public ModelAndView hello(@PathVariable("user") String pUser){}
2. We can pass as many values we need by using multiple @PathVariable.
	http://localhost/1First/hello/Vijay/India
	
3.* In Short form by using Map,
	http://localhost/1First/welcome/Vijay/India

	for this we need add <mvc:annotation-driven/> in bean config xml, if we missed map won't be initialized, we will get below error.

	SEVERE: Servlet.service() for servlet [spring-dispatcher] in context with path [/1First] threw exception [Request processing failed; nested exception is org.springframework.web.bind.annotation.support.HandlerMethodInvocationException: Failed to invoke handler method [public org.springframework.web.servlet.ModelAndView com.sample.HelloController.hello(java.util.Map)]; nested exception is java.lang.IllegalStateException: Could not find @PathVariable [pVars] in @RequestMapping] with root cause
	java.lang.IllegalStateException: Could not find @PathVariable [pVars] in @RequestMapping
		at org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter$ServletHandlerMethodInvoker.resolvePathVariable(AnnotationMethodHandlerAdapter.java:856)
		at org.springframework.web.bind.annotation.support.HandlerMethodInvoker.resolvePathVariable(HandlerMethodInvoker.java:718)
		at org.springframework.web.bind.annotation.support.HandlerMethodInvoker.resolveHandlerArguments(HandlerMethodInvoker.java:367)
		at org.springframework.web.bind.annotation.support.HandlerMethodInvoker.invokeHandlerMethod(HandlerMethodInvoker.java:175)
		at org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter.invokeHandlerMethod(AnnotationMethodHandlerAdapter.java:440)
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
