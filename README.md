# DynamicDemo
demo 源于阅读 http://blog.csdn.net/jiangwei0910410003/article/details/17679823
######1.打包class文件为jar
/Dynamic/app/build/intermediates/classes/release/com/test/dynamic/dyclass $ jar -cvf dynamic.jar *
######2.将1中jar转dex，再打包为jar，注意"--no-strict"
/home/buxiaohui/Tools/sdk/build-tools/19.1.0/dx --dex --no-strict --output=dynamic_dex.jar dynamic.jar
######1.打包接口类为jar，注意执行命令的路径
/Dynamic/app/build/intermediates/classes/release $ jar -cvf dynamic_interface.jar com/test/dynamic/dyinterface/