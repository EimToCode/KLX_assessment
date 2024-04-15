import com.eimycb.buildsrc.ProjectConfig

plugins {
    id(AppPlugin.PLUGIN_APP)
}

android {
    namespace = ProjectConfig.appId
}

dependencies {
    di()
    general()
    compose()
    testing()

    implementation(project(":domain"))
    implementation(project(":ui"))
    implementation(project(":network"))
    implementation(project(":library"))
}