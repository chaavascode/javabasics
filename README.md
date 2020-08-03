cd /c/srivani/javabasics

<different for you> /c/srivani/javabasics/src (master)
$ mkdir class

<different for you> /c/srivani/javabasics (master)
$ ll
total 1
drwxr-xr-x 1 vasanta 1049089  0 Aug  2 17:18 class/
-rw-r--r-- 1 vasanta 1049089 12 Aug  2 17:11 README.md
drwxr-xr-x 1 vasanta 1049089  0 Aug  2 17:14 src/

<different for you> /c/srivani/javabasics (master)
$ javac  src/com/avis/base/*.java -d class/

<different for you> /c/srivani/javabasics (master)
$ ll class/
total 0
drwxr-xr-x 1 vasanta 1049089 0 Aug  2 17:20 com/


<different for you> /c/srivani/javabasics (master)
$ javac  src/com/avis/base/*.java -d class/

<different for you> /c/srivani/javabasics (master)
$ java -cp class/ com.avis.base.Base
in base main method

------------------------------------------------------
