plugins {
    id(AppPlugin.PLUGIN_APP)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    di()
    general()
    network()
    testing()

}