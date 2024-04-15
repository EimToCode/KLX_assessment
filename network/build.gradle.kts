plugins {
    id(AppPlugin.PLUGIN_APP)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation(project(":network"))
    implementation(project(":domain"))
    di()
    general()
    network()
    testing()

    implementation(project(":library"))
}