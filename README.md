# Contratto API
## Book
### Richiesta
* URI: /book/getBookById/{id}
* verbo HTTP:GET
* Corpo: (empty)

### Risposta
```http
{
    "id": "B004",
    "title": "Il Gattopardo",
    "author": "Giuseppe Tomasi di Lampedusa"
}
```
### Richiesta
* URI: /book/findAll
* verbo HTTP:GET
* Corpo: (empty)

### Risposta
```http
[
    {
        "id": "B001",
        "author": "Umberto Eco",
        "title": "Il Nome della Rosa"
    },
    {
        "id": "B002",
        "author": "Dante Alighieri",
        "title": "La Divina Commedia"
    },
    {
        "id": "B003",
        "author": "Alessandro Manzoni",
        "title": "I Promessi Sposi"
    },
    {
        "id": "B004",
        "author": "Giuseppe Tomasi di Lampedusa",
        "title": "Il Gattopardo"
    },
    {
        "id": "B005",
        "author": "Primo Levi",
        "title": "Se questo è un uomo"
    }
]
```
### Richiesta
* URI: /book/updateBook/{id}
* verbo HTTP:PUT
* Corpo:
```http
{
    "title": "Decameron",
    "author": "Giovanni Boccaccio"
}
```
### Risposta
```http
{
    "id": "B004",
    "author": "Giovanni Boccaccio",
    "title": "Decameron"
}
```
### Richiesta
* URI: /book/deleteBook/{id}
* verbo HTTP:DELETE
* Corpo: (empty)
### Risposta
```http
book deleted
```
### Richiesta
* URI: /book/createBook
* verbo HTTP:POST
* Corpo:
```http
{
"title": "Il Gattopardo",
"author": "Giuseppe Tomasi di Lampedusa"
}
```
### Risposta
```http
{
    "id": "08af9df8-b156-44b1-b8d3-12e3da464350",
    "author": "Giuseppe Tomasi di Lampedusa",
    "title": "Il Gattopardo"
}
```
## Consumer
### Richiesta
* URI: /consumer/getConsumerById/{id}
* verbo HTTP:GET
* Corpo: (empty)

### Risposta
```http
{
     "id": 3,
    "name": "Federica",
    "lastName": "Gallo",
    "lendings": [
        {
            "bookAuthor": "Primo Levi",
            "bookTitle": "Se questo è un uomo"
        }
    ]
}
```
### Richiesta
* URI: /consumer/updateConsumer/{id}
* verbo HTTP:PUT
* Corpo:
```http
{
    "name": "Federica",
    "lastName": "Gallo"
}
```
### Risposta
```http
{
     "id": 3,
    "name": "Federica",
    "lastName": "Gallo",
    
}
```
### Richiesta
* URI: /consumer/findAll
* verbo HTTP:GET
* Corpo: (empty)

### Risposta
```http
{
        "id": 4,
        "name": "Federica",
        "lastName": "Gallo",
        "lendings": [
            {
                "bookAuthor": "Primo Levi",
                "bookTitle": "Se questo è un uomo"
            }
        ]
    },
    {
        "id": 6,
        "name": "Mario",
        "lastName": "Rossi",
        "lendings": []
    }
]
```
## Lending
### Richiesta
* URI: /lending/findAll
* verbo HTTP:GET
* Corpo: (empty)

### Risposta
```http
[
    {
        "bookAuthor": "Primo Levi",
        "bookTitle": "Se questo è un uomo",
        "bookId": "B005",
        "consumerName": "Federica",
        "consumerLastName": "Gallo",
        "consumerId": 4,
        "startLoan": "2021-04-15",
        "endLoan": "2021-05-15"
    },
    {
        "bookAuthor": "Dante Alighieri",
        "bookTitle": "La Divina Commedia",
        "bookId": "B002",
        "consumerName": "Mario",
        "consumerLastName": "Rossi",
        "consumerId": 6,
        "startLoan": "2021-04-30",
        "endLoan": "2021-05-30"
    }
]
```
### Richiesta
* URI: /lending/getLendingById/{id}
* verbo HTTP:GET
* Corpo: (empty)

### Risposta
```http

    {
        "bookAuthor": "Primo Levi",
        "bookTitle": "Se questo è un uomo",
        "bookId": "B005",
        "consumerName": "Federica",
        "consumerLastName": "Gallo",
        "consumerId": 4,
        "startLoan": "2021-04-15",
        "endLoan": "2021-05-15"
    }

```
### Richiesta
* URI: /lending/addLending
* verbo HTTP:POST
* Corpo: 
```http
{
"bookId": "BOO5",
"consumerId": 6,
"startLoan": "2024/08/20",
"endLoan": "2024/08/30"
}
```
### Risposta
```http

    {
        "bookAuthor": "Primo Levi",
        "bookTitle": "Se questo è un uomo",
        "bookId": "B005",
        "consumerName": "Federica",
        "consumerLastName": "Gallo",
        "consumerId": 4,
        "startLoan": "2021-04-15",
        "endLoan": "2021-05-15"
    }

```