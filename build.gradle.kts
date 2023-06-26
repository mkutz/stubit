plugins {
  base
  `stubit-style`
  id("org.sonarqube") version "4.2.1.3168"
  id("io.github.gradle-nexus.publish-plugin") version "1.3.0"
  id("info.solidsoft.pitest.aggregator")
}

repositories { mavenCentral() }

sonar {
  properties {
    property("sonar.projectKey", "mkutz_stubit")
    property("sonar.organization", "mkutz")
    property("sonar.host.url", "https://sonarcloud.io")
  }
}

nexusPublishing {
  repositories {
    sonatype {
      nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
      snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
    }
  }
}
