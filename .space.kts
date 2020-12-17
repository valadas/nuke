// ------------------------------------------------------------------------------
// <auto-generated>
//
//     This code was generated.
//
//     - To turn off auto-generation set:
//
//         [SpaceAutomation (AutoGenerate = false)]
//
//     - To trigger manual generation invoke:
//
//         nuke --generate-configuration SpaceAutomation --host SpaceAutomation
//
// </auto-generated>
// ------------------------------------------------------------------------------

job("continuous") {
    git {
        depth = UNLIMITED_DEPTH
    }

    container("mcr.microsoft.com/dotnet/sdk:5.0") {
        shellScript {
            content = "./build.sh Test --verbosity verbose"
        }
    }

    startOn {
        gitPush {
            enabled = true
        }
    }
}
