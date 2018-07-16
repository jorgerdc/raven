#This script is used to start H2 for testing.
#To use it:
# 1. open a new terminal
# 2. change to the directory where this script is located.
# 3. Run this script : ./h2-startup.sh
# 4. A browser window will appear with de  H2 console interface
# 5. In the JDBC Url value  type the following:  jdbc:h2:./raven-people
# 6. press Connect.
#
#    ./raven-course is a relative path where the database files should be located. If
#    the files are not found, a new database will be created. 
#    Physically  the database is made up of two files using this name: 
#    raven-course.mv.db and raven-course.trace.db
#
#    To full understand, look at the value of the -baseDir flag below.
#    This is also a relative path where databases should be located. If we join both
#    relative paths we get: src/test/resources/databases/h2/schemas/raven-people 
#    which match the directory where the test database will be located.
#
# To stop the Instance, just close the terminal or type Ctrl - C

echo "Starting H2 Server"

java -cp src/test/resources/databases/h2/h2*.jar \
	org.h2.tools.Server -baseDir src/test/resources/databases/h2/schemas/