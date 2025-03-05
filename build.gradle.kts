import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.plugin.compose")
}

group = "learnsync"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

dependencies {
    // Note, if you develop a library, you should use compose.desktop.common.
    // compose.desktop.currentOs should be used in launcher-sourceSet
    // (in a separate module for demo project and in testMain).
    // With compose.desktop.common you will also lose @Preview functionality
    implementation(compose.desktop.currentOs)
    implementation("net.sourceforge.tess4j:tess4j:5.4.0")

    // If you plan to integrate with ChatGPT via HTTP calls,
    // add a HTTP client, e.g. Ktor or OkHttp, plus JSON libraries:
    implementation("io.ktor:ktor-client-core:2.2.4")
    implementation("io.ktor:ktor-client-okhttp:2.2.4")
    implementation("com.google.code.gson:gson:2.9.1")
    implementation(kotlin("test"))
    implementation(kotlin("test-junit"))

    testImplementation("android.arch.core:core-testing:1.1.0")
}

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "VocabularyProcessor"
            packageVersion = "1.0.0"
        }
    }
}
