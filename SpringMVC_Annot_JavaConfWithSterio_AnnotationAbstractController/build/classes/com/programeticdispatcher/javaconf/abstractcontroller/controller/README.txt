This Document Is used to understand the MetaData Driven Devlopment Approach
The Parameters for the methods you can take any thing. spring has provided
some set of parameter types so that you can able to use those. this will reduce the
lot of boiler plate code and you code will contain only mimulistic content only and 
you can return the any value outof spring provided return types spring has provided 
lot of return values and parameters types as well
Parameter Types
---------------

1)HttpRequest
2)HttpResonse
3)WebRequest
4)WebResponse
5)NativeWebRequest
6)NativeWebResponse
7)Map
8)Model
9)ModeMap
10)@RequestParam("x") -->To read request paramters
11)@PathParam("{x}") -->To Read Path Param
12)@MatrixParam("") -->To Read Matrix Param
13)HttpSession
14)@ModelAttribute
15)BindingResults
16)ServletRequest
17)ServletResponse

Return Type :-
--------------

1)ModelAndView
2)Model
3)Map
4)ModelMap
5)void
6)String

## This MetaData Driven Devlopment Programing Model has changed the complete 
   archetecture of spring bcz, Dispatcher Servlet has to call the controller
   bcz handler RequestMapping HandlerMApping will send the bean name and the
   method name to it. but dispatcher servlet know only request and response
   as paramters but our controller may take may not take bcz we are devloping
   on MetaData Based Application Devlopment so after reciving of the Details
   of Controller it will pass these details to RequestMappingHandlerAdopter
   This is one more component comming from Spring Mvc Incase of Annotation
   Driven Devlopment. so it will take the help from this component in calling
   with our required set of paramters and converting out return types into
   spring dispatcher servlet understandingreturn value i.e ModelAndView 
   componennt to it. This is Adopter class follows Adopter design pattern 
   this classes will convert one class or interface compatibility into 
   another class compatability. we may required to write more controllers
   but one handlerAdopter is enough to call our controllers
  
 ## Aspart of return types you can send any valid spring provided response types
    void and Map and ModelMap is also we can send response back to RequestMapping
    HandlerAdopter class but this class will use another component called
    RequestToViewName this is another component comming from SpringMvc which will helps
    you in identifying the logical view name. this is interface and have some implementation
    classes also one of the implementation class is DefaultRequestToView or else
    you can have your own classes also by implementing this interface.
    it will identify based on the request with which the url pattern is comming
    if the url pattern is comming like /home.htm it will remove the forword
    slash and .htm and places home as logical view name and sends back to the 
    RequestMappingHandlerMapping class. but this will not be usefull incase if you want to
    forwird the request to some other page bu you are not returing any name
    it will construct the name from requested name only ther incorrect results will come
     