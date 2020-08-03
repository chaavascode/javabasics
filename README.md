<h1>Exercises</h1>
<h2>1. Create a Base class and run it from command line</h2>
<b>cd /c/srivani/javabasics </b><br/>

<different for you> /c/srivani/javabasics (master)<br/>
<b>$ mkdir class</b><br/>

<different for you> /c/srivani/javabasics (master)<br/>
<b>$ ll</b><br/>
<pre>
total 1
drwxr-xr-x 1 vasanta 1049089  0 Aug  2 17:18 class/
-rw-r--r-- 1 vasanta 1049089 12 Aug  2 17:11 README.md
drwxr-xr-x 1 vasanta 1049089  0 Aug  2 17:14 src/
</pre>

<different for you> /c/srivani/javabasics (master)<br/>
<b>$ javac  src/com/avis/base/*.java -d class/ </b><br/>

<different for you> /c/srivani/javabasics (master)<br/>
<b>$ ll class/</b>
<pre>
total 0
drwxr-xr-x 1 vasanta 1049089 0 Aug  2 17:20 com/
</pre>

<different for you> /c/srivani/javabasics (master)<br/>
<b>$ java -cp class/ com.avis.base.Base</b>
<pre>in base main method</pre>

------------------------------------------------------
<h2> 2. Extend Base class and run it from command line</h2>

<pre>
Open "Git Bash"

$ cd /c/srivani/javabasics

$ mkdir -p src/com/avis/sub

$ vi src/com/avis/sub/Sub.java

$ javac src/com/avis/base/*.java src/com/avis/sub/*.java  -d class/

$ java -cp class/ com.avis.sub.Sub
In sub main method

$ java -cp class/ com.avis.base.Base
in base main method
</pre>
