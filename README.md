# Complete rest api in SpringBoot

## Table of contents
* [Spring web] (#Rest Api and web interfaces)
* [Spring security] (#jwt authentication)
* [JPA] (#data handling)
* [mysql] (#jdbc mysqldriver)


## Technologies



## Setup


## Available Routes
### Book Routes

#### CREATE
##### Add a collection of books

* &{serverName}/api/v1/addBooks
   * return "Successfully Added a books"

#### READ
* ${serverName}/api/v1/books
    * jsonResponse [{ }]
* ${serverName}/api/v1/book/{bookId}
     * array [ ] 

#### DELETE
* ${serverName}/api/v1/delete/{bookId}
      * return ("Succesfilly deleted book with" + bookId);


#### UPDATE
* ${serverName}/api/v1/books/update/{bookId}
