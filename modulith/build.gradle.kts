plugins {
	java
	id("org.springframework.boot") version "3.2.0-RC2"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "tk.hildebrandt.ddd.onion"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.modulith:spring-modulith-starter-core")
	implementation("org.springframework.modulith:spring-modulith-starter-jpa")
	implementation("org.springframework.modulith:spring-modulith-moments")
    implementation("org.jmolecules:jmolecules-ddd:1.9.0")
    implementation("org.jmolecules:jmolecules-hexagonal-architecture:1.9.0")
	implementation("org.jmolecules.integrations:jmolecules-spring:1.6.0")
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.modulith:spring-modulith-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
    testImplementation("com.h2database:h2:2.2.224")
    testImplementation("org.assertj:assertj-core:3.24.2")
	testImplementation("org.jmolecules.integrations:jmolecules-archunit:0.17.0")
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.modulith:spring-modulith-bom:1.1.0-RC2")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
