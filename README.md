# Spring Boot - Factory/Adaptor Design Pattern

An example implementation of factory/adaptor design pattern without if else or switch case block.

|      Shapes      |                             Implementation Flow                             |
|:----------------:|:---------------------------------------------------------------------------:|
| Pencil (Default) |                                                                             |
|      Circle      |                                                                             |
|    any shape     | Shapes -> ShapeFactory -> ShapeInterface -> ShapeAdaptor -> Rest Controller |
|    Rectangle     |                                                                             |
|     Diamond      |                                                                             |

 
       
# Test

```bash
mvn clean test
```