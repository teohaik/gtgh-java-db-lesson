# gtgh-java-db-lesson

## Source code from the Get Trained - Get Hired classs about Java database programming with JDBC

to use this code, first create a database ```javauser```

```CREATE DATABASE `javauser` /*!40100 DEFAULT CHARACTER SET utf8mb4 */```

 and a user ```javauser```

```
GRANT USAGE ON *.* TO `javauser`@`%` IDENTIFIED BY PASSWORD 'javauser123';

GRANT ALL PRIVILEGES ON `javauser`.* TO `javauser`@`%`;` ```
```

then, run the import file from the resources folder [here](https://github.com/teohaik/gtgh-java-db-lesson/blob/master/src/main/resources/javauser.sql)
