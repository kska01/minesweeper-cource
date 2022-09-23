class OperatingSystem {
    var name = ""
}

class DualBoot {
    var primaryOs: OperatingSystem = OperatingSystem().apply {
        name = "Linux"
    }
    var secondaryOs = OperatingSystem().apply {
        name = "Windows"
    }
}