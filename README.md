# Easy-Builder-MC
Easy building of structures

# DEV
## Prerequisites
### Mac
#### JDK 21
```
brew install temurin@21
```
Set as default:
```
export JAVA_HOME="$(/usr/libexec/java_home -v 21)"
export PATH="$JAVA_HOME/bin:$PATH"
```
Set for every terminal:
```
echo 'export JAVA_HOME="$(/usr/libexec/java_home -v 21)"' >> ~/.zshrc
echo 'export PATH="$JAVA_HOME/bin:$PATH"' >> ~/.zshrc
```
### Build
```
./gradlew --refresh-dependencies
```
## Build
```
./gradlew build
```
## Run
### Fabric Client
```
./gradlew :fabric:runClient
```
### Fabric Server
```
./gradlew :fabric:runServer
```
