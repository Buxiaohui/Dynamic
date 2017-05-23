# DynamicDemo
demo 源于阅读 http://blog.csdn.net/jiangwei0910410003/article/details/17679823

/Dynamic/app/build/intermediates/classes/release/com/test/dynamic/dyclass $ jar -cvf dynamic.jar *
/home/buxiaohui/Tools/sdk/build-tools/19.1.0/dx --dex --no-strict --output=dynamic_dex.jar dynamic.jar
/Dynamic/app/build/intermediates/classes/release $ jar -cvf dynamic_interface.jar com/test/dynamic/dyinterface/