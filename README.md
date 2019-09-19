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
	    <version>1.1.6</version>
	</dependency>
```
  
Gradle
```gradle
dependencies {
	        implementation 'com.github.dongxiaowang:SALib:1.1.6'
	}
```
