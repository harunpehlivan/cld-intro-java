# Introduction to Cloudinary Using Java

This repository is used in conjunction with the Cloudinary training course **Introduction to Cloudinary Using Java**.


## Setup 

### Java 
The Cloudinary Java SDK will run on Java 6 and any higher version. For purposes of training, we are using **Java Version 8**.


### Maven
The Cloudinary libraries are made available with Maven.  This repo includes a full Eclipse project configured with Cloudinary libraries.

We are supplying a `pom.xml` file.  You'll find these dependencies have been added to support this training.

- com.cloudinary.cloudinary-taglib  produce custom tags
- com.cloudinary-http44             Apache 4.4 integration
- com.google.code.gson              format JSON output
- junit                             testing

See [Cloudinary Documentation on Maven](https://cloudinary.com/documentation/java_integration#choosing_the_right_maven_package) for more information about Cloudinary Maven libraries.

For many IDE's like Visual Studio Code (and Intellij?), you won't need to install Maven.  They will take care of importing the library and plugin dependencies.

### IDE

We present this content using [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Java in Visual Studio Code](https://code.visualstudio.com/docs/languages/java). 

You may import the Java code used into your favorite IDE. You'll find the `Main.java` in repo in the folder `src/main/java/cld_intro_java/`.  This is the entry point to static "runners" that contain code to help you upload, manage and transform your media.


### Install Java

You can find [instructions for downloading and installing Java ](https://www.java.com/en/download/help/index_installing.html) for many environments. 

### Verify your version of Java is 6+

```
java -version

```

Sample output for Version 8

```bash
$ java -version
java version "1.8.0_311"
Java(TM) SE Runtime Environment (build 1.8.0_311-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.311-b11, mixed mode)
```

## Executing Code

### Providing Cloudinary Credentials

You will need to [register for a free Cloudinary account](https://cloudinary.com/users/register/free) in order to work along with this training. It is recommended that you create a training account for this training to keep this work separate from any work you do in a production Cloudinary account.  You only need an email address that can be verified to set up this account.

Cloudinary provides 3 credentials for developers to use in interacting with SDK's and Widgets:
 
 1. CLOUD_NAME
 1. API_KEY
 1. API_SECRET

 CLOUD_NAME and API_KEY can be revealed without creating any security issues, but you must keep API_SECRET private. Don't check it into GitHub and don't include it in blog posts.

### CLOUDINARY_URL

Cloudinary provides CLOUDINARY_URL as an environment variable KEY.  You can copy the full value in your console.  Click on the `Copy to Clipboard` link to copy the full URL into your clipboard.  The format of the CLOUDINARY_URL is `cloudinary://API_KEY:API_SECRET@CLOUD_NAME`.  This environment variable, therefore, encapsulates all of the Cloudinary credentials.

<img width="400" src="./images/cloudinary-url.jpg" alt="CLOUDINARY_URL">

#### Using IntelliJ

**get a screenshot of adding CLOUDINARY_URL to Intellij**

#### Using VS Code with Java Extensions

We have git ignored `.vscode`, so your API_SECRET will not get checked in.

<img width="400" src="./images/vscode-launch-credentials.png" alt="Adding Credentials to .vscode/launch.json">

### Code Runners

The Cloudinary library is instantiated with credentials in `src/main/java/cld_intro_java/Main.java`.  Code in the other module files is called with a static `runner` function.  
Map results are formatted in the console using a static function in `src/main/java/cld_into_java/CourseUtils.java` named `jsonPrint`.  This function takes a `Map` interface parameter and uses the `com.google.gson.GsonBuilder` library to "pretty print" the data as JSON.

You will be controlling output by uncommenting modules in `Main.java` and lines of code in the other java files.  This is to provide focus on concepts as they are presented. 


## Assets
All local assets used in training, are located in the `./assets` directory






