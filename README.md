# RxBus
RxBus事件总线传值  并且用Rxlifecycle解决了内存泄漏的问题


* 步骤
* 1.依赖 在modele中的build.gradle 中添加如下代码


```java
    compile 'io.reactivex:rxandroid:1.1.0'
    compile 'io.reactivex:rxjava:1.1.0'
    //rxlifecycle
    compile 'com.trello:rxlifecycle:0.4.0'
    compile 'com.trello:rxlifecycle-components:0.4.0'
  }
}
```

* 2.需要传到到那个activity 需要extends RxAppCompatActivity
* 具体的 Rxlifecycle的使用详解 可以看下面的网页
 http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/1122/3711.html
 
 
 
