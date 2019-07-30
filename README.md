# my_spring_heima04

[黑马教程第一天结束](https://www.bilibili.com/video/av47952931/?p=27)

### spring的依赖注入：Dependency Injection
   依赖关系交由spring管理，在当前类需要用到其他类的对象时，由spring提供，只需要在配置文件中说明
        依赖关系的维护，就是依赖注入
        能注入的数据：
            1，基本类型和String
            2，其他的bean类型，在配置文件中或注解配置过的bean
            3，复杂类型/集合类型
        注入方式：
            1，使用构造函数
            2，使用set方法
            3，使用注解

### 构造函数注入：(几乎不用)
        标签：constructor-arg
        位置：bean标签内
        属性：
            type：指定要注入的数据的数据类型，也是构造函数中某个或某些参数的类型，如果有多个相同类型参数，无法指定具体某一个
            index：从0开始，指定索引位置的参数，进行赋值
            name：指定给构造函数中指定名称的参数赋值（最常用）
            =======  =======
            value:用于提供基本类型和string类型数据
            ref:用于指定其他的bean类型数据，spring的Ioc核心容器中出现的bean对象

            优势：
                获取bean对象时，注入数据是必须的操作，否则对象无法创建成功
            弊端：
                改变了bean对象的实例化方式，不提供数据，无法创建对象

### set方法注入：
        标签：property
        位置；bean标签内部
        属性：
            name：指定注入时调用的set方法名称
            value:用于提供基本类型和string类型数据
            ref:用于指定其他的bean类型数据，spring的Ioc核心容器中出现的bean对象

        优势：
            创建对象没有限制，可以直接使用默认构造函数
        弊端：
            如果某个对象属性必须有值，set方法不能保证会一定注入

### 复杂类型/集合类型注入
        给list结构注入：
            list set array
        给map结构注入：
            map，props
        相同结构可以互用标签
