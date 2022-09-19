plugins {
  id("java-library")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
  mavenCentral()
}

tasks.withType<Jar> {
  manifest {
    attributes["Main-Class"] = "de.gesellix.fontconfig.App"
  }
}
