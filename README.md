### Contratto API

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