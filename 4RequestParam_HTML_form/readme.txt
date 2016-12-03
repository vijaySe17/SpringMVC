1. @RequestParam used access request params
2. We can have method type @RequestMapping(value="/submitForm.html", method=RequestMethod.POST) 
3. url pattern same and method differs also np. Below path with different request method will work
		@RequestMapping(value="/submitForm.html", method=RequestMethod.POST)
		@RequestMapping(value="/submitForm.html", method=RequestMethod.GET)
		
How to test: 
http://localhost/1First/userForm.html
