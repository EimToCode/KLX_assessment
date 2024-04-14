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
    testing()

    implementation(project(":domain"))
    implementation(project(":feature"))
    implementation(project(":network"))
}