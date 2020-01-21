# songr
### lab11 Spring for Full-Stack Web Apps

**DecDescription** 

- Create a hello world route at /hello, and ensure that you can visit that route in your browser and see a rendered template come back.
- Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
- Create a basic splash page for the Songr app, available at the root route, and style it appropriately with CSS.
- Create an Album class to act as a model in our app.
An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
- Create a route at /albums that shows three album instances. (These will be hardcoded for today’s lab; create an array that contains three albums, and then display those three on the page.)

**Challenges**
- make the capitalize feature work, I finally find out there was a space between "th" and "text" caused error
- how to render the albums in an array. I figured that I need to make a toString method 
