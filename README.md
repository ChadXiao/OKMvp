# How to Use


## Gradle ##

 

>  ��ӵ���Ŀ��Ŀ¼��build.gradle�ļ���:

    allprojects {
    	repositories {
    		...
    		maven { url 'https://jitpack.io' }
    	}
    }

>  ��ģ���build.gradle�ļ��������������:

	dependencies {
	        implementation 'com.github.ChadXiao:OkMvp:TAG'
	}


## Maven ##

    <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
	
	

> �������

    <dependency>
	    <groupId>com.github.ChadXiao</groupId>
	    <artifactId>OkMvp</artifactId>
	    <version>TAG</version>
	</dependency>
	
## Sbt ##

> ��build.sbt��β��ӣ�

    resolvers += "jitpack" at "https://jitpack.io"
     

> ���������

    libraryDependencies += "com.github.ChadXiao" % "OkMvp" % "TAG"
    
## Leiningen ##

> ��project.clj�ļ���β���

    :repositories [["jitpack" "https://jitpack.io"]]
    

> �������

    :dependencies [[com.github.ChadXiao/OkMvp "TAG"]]