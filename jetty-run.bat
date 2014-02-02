@echo off
echo jetty-run.bat
pushd %~dp0
call C:\tool\Maven\maven-set.bat
call mvn -X jetty:run
pause
