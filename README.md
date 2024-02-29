# Java课设/Java Web  基于JSP+Servlet的校园论坛系统

2024.02.28 update by Jin Li

## Usage Guide

### Prerequisites

- IntelliJ IDEA Community Edition
- JDK 11.0.8
- Tomcat 9.0.39
- Docker Desktop

### Prerequisites Installation

1. Install IntelliJ IDEA Community Edition
   
    Download from [JetBrains](https://www.jetbrains.com/idea/download/?section=windows). The community edition is free and enough for this project.

2. Install JDK 11.0.8
   
    Download from [OpenLogic](https://www.openlogic.com/openjdk-downloads). You need to choose 11.0.8 version and Windows x64 version. This is a free version of OpenJDK.
    You can also download from [Oracle](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html). You need to sign up for an Oracle account and download the installer.

3. Install Tomcat 9.0.39
   
    Download from [Apache Tomcat](https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.39/bin/). You can choose the `exe` version for Windows installation.

    After downloading, you need to install it. The installation is simple. You can choose the default settings.

    If the environment variables are not set. You need to set them up:
    
    - `CATALINA_HOME`: Set to the Tomcat installation directory. You can do this by right-clicking `This PC` -> `Properties` -> `Advanced system settings` -> `Environment Variables` -> `New`. Set the `Variable name` to `CATALINA_HOME` and the `Variable value` to the Tomcat installation directory.
    - `JAVA_HOME`: Set to the JDK installation directory.

    ![environment variables](https://img.jinli.io/images/2024/02/28/tomcat_env.md.png)

    Then you can start the Tomcat server by running the `startup` command in PowerShell.

    Then you can open your browser and go to `localhost:8080`. If you see the Tomcat homepage, the installation is successful.

4. Install Docker Desktop
   
    Download from [Docker](https://www.docker.com/products/docker-desktop/). 

### Run the Project

1. Open the project in IntelliJ IDEA. Wait for the IDE to install the dependencies.
   
2. Open `File` -> `Project Structure` -> `Project` -> `Project SDK`. Choose the installed JDK 11.0.8. Click `OK` to save the settings.

3. Double click the `docker-compose.yml` file in the project root directory. The IDE will suggest you to install the Docker plugin. Install it and restart the IDE.
   
   ![docker-compose plugin](https://img.jinli.io/images/2024/02/28/idea_docker_plugin.md.png)

4. After installing the Docker plugin, you will see a green play button on the top. You can use it to run the `docker-compose.yml` file. This will start a MySQL container.

5. Open `File` -> `Settings` -> `Plugin` -> `Marketplace` and search for `Tomcat`. Install the `Smart Tomcat` plugin. We will use this plugin to run the project.

6. Open `Run` -> `Edit Configurations` -> `+` -> `Smart Tomcat`. Set the `Tomcat server` to the Tomcat installation directory. Set the `Context path` to the `/` . Other settings can be left as default. Click `OK` to save the configuration.
   
   ![smart tomcat](https://img.jinli.io/images/2024/02/28/idea_tomcat_config.md.png)

7. Click the Green `Run` button to start the Tomcat server. The server will start and the project will be deployed.

8. Open your browser and go to `localhost:8080`. You will see the project homepage.


[2021.10.11日更新]

突然被点了一颗小星星有点激动，又到了做课设的时间了吗哈哈哈

这里说一下运行方法：

1. 下载项目，用IDEA打开

2. 导入sql文件,在/src/main/java/com.db.DbConn.java中修改数据库连接信息

3. 等待IDEA自动安装依赖（或者在pom.xml中刷新）

4. 运行Main方法

5. 浏览器打开localhost:8080

运行系统：Win10 2004 + Tomcat 9.0.39

集成环境：IDEA 2020.3

Java版本：jdk-11.0.8

数据库：MySQL 8.0.22

依赖管理：Maven

MVC设计模式：

1.Model-com.bean、com.dao、com.db

2.View-jsp、html

3.Service-com.controller
