# SALib
Libary for Selenium and Appium

#### 1.Use Maven or Gradle

  
Maven
```xml

	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://www.jitpack.io</url>
		</repository>
	</repositories>
```
  
Gradle
```
	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
```

#### 2. Add the Dependency

  
Maven  
```xml
	<dependency>
	    <groupId>com.github.dongxiaowang</groupId>
	    <artifactId>SALib</artifactId>
	    <version>1.1.7</version>
	</dependency>
```
  
Gradle
```gradle
dependencies {
	        implementation 'com.github.dongxiaowang:SALib:1.1.7'
	}
```


### 注意 Junit 和 testNG共存的情况

maven 默认使用surefire插件版本为2.12.4
```xml
<plugin>
<artifactId>maven-surefire-plugin</artifactId>
<version>2.12.4</version>
</plugin>
```
使用Salib库是默认绑定testNG  
应该更新为2.22.1或以上，会自动选择Junit或testNG
```xml
<plugin>
<artifactId>maven-surefire-plugin</artifactId>
<version>2.22.1</version>
</plugin>
```

