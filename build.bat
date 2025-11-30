@echo off
cd /d %~dp0
if not exist out mkdir out
javac -d out *.java
if errorlevel 1 (
  echo Compilation failed. > artifact.txt
  exit /b 1
)
java -cp out student > artifact.txt 2>&1
