# How to Use


## Gradle ##

 

>  ���ӵ���Ŀ��Ŀ¼��build.gradle�ļ���:

    allprojects {
    	repositories {
    		...
    		maven { url 'https://jitpack.io' }
    	}
    }

>  ��ģ���build.gradle�ļ���������������:

	dependencies {
	        implementation 'com.github.ChadXiao:OKMvp:V1.0.1'
	}


## Maven ##

    <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
	
	

> ��������

    <dependency>
	    <groupId>com.github.ChadXiao</groupId>
	    <artifactId>OKMvp</artifactId>
	    <version>V1.0.1</version>
	</dependency>
	
## Sbt ##

> ��build.sbt��β���ӣ�

    resolvers += "jitpack" at "https://jitpack.io"
     

> ����������

    libraryDependencies += "com.github.ChadXiao" % "OKMvp" % "V1.0.1"
    
## Leiningen ##

> ��project.clj�ļ���β����

    :repositories [["jitpack" "https://jitpack.io"]]
    

> ��������

    :dependencies [[com.github.ChadXiao/OKMvp "V1.0.1"]]