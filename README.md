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