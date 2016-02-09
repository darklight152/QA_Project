# QA_Project
Matthew Young QA

Hi!  I'd like to take a moment to explain the application and how to get it to work.

Open the main.java application in any Java IDE (I used Eclipse) if you encounter an ANT build error you may need to create a new application and just copy/paste the code in.  I hope that doesn't happen!

Once the application is up and running you have to change the location of the XML file as that is unique to each computer.

File fXmlFile = new File("C:/Users/Matthew/Documents/userInfo.xml");

Has to be changed to where the xml XML file is located on your computer.  If you copy/paste the directory you will have to change back slashes to forward slashes!

Hit run application and everything should work!
______

A few notes on the application

The data is all stored in an XML file of what I assumed a User Profile would look like.  It includes all the text information that the user could fill out on the profile page.  Any incomplete fields would result in an warning that the profile was not complete (with the exception of the Diet section of the Lifestyle and Interests part) which if not checked were simply ignored.  Actual errors would appear if URLs or Email Addresses were placed into the About or Description fields.

When I first started to think about how to go about this project and plan out the steps required to accomplish it, I came to the conclusion that the profiles would be stored in some kind of database.  I figured it would be easy to convert that profile information into an XML file which I would then import into my application to scan for errors.  While I had a basic idea of how this was done, working with XML in Java was pretty new to me and I was picking this up as I went along.  Unfortunately, this means I put function over form and while the application does what it is supposed to do, I am by no means pleased by how it goes about doing this.  It is a very brute force method that does allow for easy modifications and changes.  For example, if any fields in the XML are changed, an error will occur when running the program, if new fields are added the program will not ackowledge them without doing some coding and so on.  I have ideas on how to improve the application and it is something I will like to look back into afterwards.
