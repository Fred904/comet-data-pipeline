call .\env.cmd init

SET HADOOP_HOME=%~dp0..\hadoop
SET PATH=%PATH%;%HADOOP_HOME%\bin

echo %COMET_SCRIPT% import

echo SPARK_DIR_NAME=%SPARK_DIR_NAME%
echo SPARK_TGZ_NAME=%SPARK_TGZ_NAME%
echo SPARK_TGZ_URL=%SPARK_TGZ_URL%
echo SPARK_SUBMIT=%SPARK_SUBMIT%
echo SPARK_DIR=%SPARK_DIR%

echo HADOOP_HOME=%HADOOP_HOME%
echo PATH=%PATH%

echo HADOOP_HOME=%HADOOP_HOME%
echo %PATH%
pause
call %COMET_SCRIPT% import
