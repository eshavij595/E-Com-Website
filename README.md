
# E_Commerce Website 
The steps required to run our project are as followed:<br>
1- Download the zip.file that is provided with the code.<br>
2- Extract the Zip file that you downloaded on your local device. <br>
3- Open Eclipse and import the project as a maven project. <br>
4- To run the project, click on "Eecs4413ProjectApplication" class and run it as a Java Application. <br>
5- Download the .json file which has all the postman collection commands to test them. Run all the collections in this document. <br>

**Order in which to execute the Postman commands:**
1- createUser

2- createItem

3- authenticate_login

4- get_itemByName

5- selectItem

6- getItemDetailsInAuction

7- doDutchAuction 

8- setForwardAuctionBid

9- checkDutchPayement 

10- checkForwardPayement 

11- createItem Copy

12- createUser Copy

Addition commands that can be tested
get_All_items , delete_items ,updateUser

**URL path parameter that can be edited to get the output as followed**

1- /signup/createuser/                        
(Edit JSON body)

2- /seller/createitem/itemcontroller/          
(Edit JSON body)


Add path variable <br>
3- /login/{username}/{password}

Add path variable <br>
4- /item/getitem/{itemName}

Add path variable <br>
5- item/selecitem/{itemName}

6- /auction/itemdetails

Add path variable <br>
7- /auction/dutchauction/{id}/{bidAmount}

Add path variable <br>
8- /auction/forwardauction/{id}/{bidAmount}

9- /payment/dutchauction

10- /payment/forwardauction






**For Frontend:**

To implement the minimal browser-client implementations, on Eclipse simply right-click the page you would like to run and it should run on the server.

Otherwise, in the URL enter the name of the file. 

For example, if I was to run the “Register.jsp” page, my URL would look something like this: http://localhost:8080/EECS4413Project/Register.jsp (http://localhost:8080/EECS4413Project/Register.jsp) 

For each of the .jsp pages, you would do the same thing as the Register.jsp shown above.


**For Docker**
To access the project using docker, the link provided can be used. Search the project up from this link and then pull all the commits. simransaini1999 / docker-springboot-app

<img width="754" alt="Screenshot 2025-01-06 at 3 50 17 PM" src="https://github.com/user-attachments/assets/1f2ce8c2-24be-4d70-8793-178af2be315f" />



