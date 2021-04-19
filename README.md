# Introduction to Cloudinary Using Java

This repo is used in the Cloudinary training course **Introduction to Cloudinary Using Java** 

The Cloudinary Java SDK will run on Java 6 and any higher version. For purposes of training, we are using **Java Version 8** and Eclipse.  



The Cloudinary libraries are made available with Maven.  This repo includes a full Eclipse project configured with Cloudinary libraries.

You may import the Java code used into your favorite IDE, such as [Intellij](https://www.jetbrains.com/idea/) or [VS Code](https://code.visualstudio.com/docs/languages/java).  You'll find the code in repo in the folder `src/main/java/cld_intro_java/`.


## Install Java

You can find instructions for downloading and installing Java 8 for many environments [here](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html).  You'll find the Java 8 downloads [here](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html).  

## Verify your version of Java is 6+

```
java -version

```

Sample output for Version 8

```bash
$ java -version
java version "1.8.0_281"
Java(TM) SE Runtime Environment (build 1.8.0_281-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.281-b09, mixed mode)
```


## Install Eclipse

You can find the download for the Eclipse installer [here](https://www.eclipse.org/downloads/packages/installer).

In this course we will be coding in the format of a Java Application and not a Web Application.  When prompted to choose, you can choose **Eclipse IDE for Java Developers** for purposes of this training.

![Eclipse for Java Devs](./images/eclipse-installer.jpg)

## Download cld-intro-java GitHub Repo

Download [this project](https://github.com/cloudinary-training/cld-intro-java).  

## Open Project in Eclipse

If you are following along and using Eclipse, you should be able to import this project directly into Eclipse.  In this example, I have downloaded this repo in `~/cld-coursework`.  When I unzip the download, I have a directory named `cld-intro-java-master`.  The next step is to open this project in Eclipse.

I'll use the default Eclipse workspace  `~/eclipse-workspace` and I'll open the project directly from the filesystem.

### Open From Filesystem

![Open from file system](./images/eclipse-open-from-file-system.jpg)

### Select Directory

![Select directory](./images/eclipse-select-directory.jpg)

### View Project in Eclipse

 Your project should look something like the picture below.

 ![Eclipse Project](./images/course-code-in-eclipse.jpg)


## Run Main.java

The course is broken into modules that focus on Upload, Manage and Transform.  You'll find most of the code commented out. The instructor will explain the concept, uncomment the code, run it and then describe the result.  

The Cloudinary library is instantiated with credentials in `src/main/java/cld_intro_java/Main.java`.  Code in the other module files is called with a static `runner` function.  Map results are formatted in the console using a static function in `src/main/java/cld_into_java/CourseUtils.java` named `jsonPrint`.  This function takes a `Map` interface parameter and uses the `com.google.gson.GsonBuilder` library to "pretty print" the data as JSON.

You will always be controlling output by uncommenting modules in `Main.java` and lines of code in the other java files.  Again, this is to provide focus on concepts as they are presented. 

All local assets used in training, are located in the `./assets` directory

## Providing Cloudinary Credentials

You will need to set up a Cloudinary account for this training.  It is recommended that you create a training account for this training to keep this work separate from any work you do in a production Cloudinary account.  You only need an email address that can be verified to set up this account.

Cloudinary provides 3 credentials for developers to use in interacting with SDK's and Widgets:
 
 1. CLOUD_NAME
 1. API_KEY
 1. API_SECRET

 CLOUD_NAME and API_KEY can be revealed without creating any security issues, but you must keep API_SECRET private. Don't check it into GitHub and don't include it in blog posts.

### Get CLOUDINARY_URL

Cloudinary provides CLOUDINARY_URL as an environment variable KEY.  You can copy the full value in your console.  Click on the `Copy to Clipboard` link to copy the full URL into your clipboard.  The format of the CLOUDINARY_URL is `cloudinary://API_KEY:API_SECRET@CLOUD_NAME`.  This environment variable, therefore, encapsulates all of the Cloudinary credentials.

![CLOUDINARY_URL](./images/cloudinary-url.jpg)

The full set of credentials are used to instantiate Cloudinary, and this can be done if the Environment variables is in your session, as we'll do by adding the CLOUDINARY_URL to the Eclipse list of env variables for `Main.java`.

Type `CLOUDINARY_URL` as the Key and your credentials starting with `cloudinary://` as the value.

![Add Environment variable and run](./images/add-env-run.gif)

## Maven

You don't need to install Maven if you are using an IDE like Eclipse.  The `pom.xml` file has been set up for the course and all the dependencies will be loaded by Eclipse.

There are 4 dependency artifacts listed in the pom.xml file:


1. `cloudinary-http44` - we will rely on this library for backend Cloudinary functionality in this course
1. `gson` - we will use this for outputting Map results in a JSON format
1. `cloudinary-taglib` - the tag library from Cloudinary can be used if you are writing `jsp` for  J2EE web application
1. `junit` - we will not be writing any test in this course

See [Cloudinary Documentation on Maven](https://cloudinary.com/documentation/java_integration#choosing_the_right_maven_package) for more information about Cloudinary Maven libraries.

