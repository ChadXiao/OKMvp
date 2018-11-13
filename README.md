# How to Use


## Gradle ##

 

>  添加到项目根目录的build.gradle文件中:

    allprojects {
    	repositories {
    		...
    		maven { url 'https://jitpack.io' }
    	}
    }

>  在模块的build.gradle文件中添加如下依赖:

	dependencies {
	        implementation 'com.github.ChadXiao:OkMvp:V1.0.0'
	}


## Maven ##

    <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
	
	

> 添加依赖

    <dependency>
	    <groupId>com.github.ChadXiao</groupId>
	    <artifactId>OkMvp</artifactId>
	    <version>V1.0.0</version>
	</dependency>
	
## Sbt ##

> 在build.sbt结尾添加：

    resolvers += "jitpack" at "https://jitpack.io"
     

> 添加依赖：

    libraryDependencies += "com.github.ChadXiao" % "OkMvp" % "V1.0.0"
    
## Leiningen ##

> 在project.clj文件结尾添加

    :repositories [["jitpack" "https://jitpack.io"]]
    

> 添加依赖

    :dependencies [[com.github.ChadXiao/OkMvp "V1.0.0"]]