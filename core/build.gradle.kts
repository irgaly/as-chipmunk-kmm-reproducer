plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    sourceSets {
        commonMain {
            dependencies {
            }
        }
        commonTest {
            dependencies {
            }
        }
        val jvmMain by getting {
            dependencies {
            }
        }

        val jvmTest by getting {
            dependencies {
            }
        }

        /*
        val main by creating {
            dependsOn(jvmMain)
        }
         */
    }
}
