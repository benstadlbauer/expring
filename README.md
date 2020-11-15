# Expring
This is the beginning of a web-application based on [Spring](https://spring.io/). The first feature will be to save expenses to a database. One expense has the fields
* Amount
* Description
* Date
* Category

where the category should be chosen from a given list. 

# TODO
* Implement categories (possibly as `enum`)
  * and make them useable from the UI
* Write tests for already existing code based on version 0.1 (commit `68ca286`)
* Make a better-looking user-interface than the standard HTML look
  * Also make sure to be phone-friendly
* Make the SSL not self-signed
* Get a proper domain name
* Back-up the database
* Implement spring security with username, password, etc.
* Make the application start automatically whenever the VM gets started
