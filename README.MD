# UiAutomator  demo



# 使用说明
1 配置adb 环境
2 继承继承UiAutomatorTestCase
3 android create uitest-project -n uiautomator  -t 13 -p /Users/yongche/Desktop/uiautomator
注：-t 为Android sdk版本    -p 为生成build.xml的路径
4 ant build  命令 生成jar包
5 adb push bin/uiautomator-example.jar /data/local/tmp/
6 adb shell uiautomator runtest uiautomator.jar -c cases.LoginCase
    


  

