# Virtual Satellite 4 - Tasking Modeling Language IDE

Model-Based Tool for Generation of Event-Driven Software based on Virtual Satellite 


## Purpose

This development environment for the Tasking Modeling Language provides advanced editing capabilities for TML models. It allows specifying components, data flow between components and execution events that trigger components. Based on this description, it generates source code implementing the API of [Tasking](https://gitlab-ee.sc.dlr.de/oss/Tasking). Editors and generated code provide extension mechanisms to extend your project to your specific needs.

## Requirements 

Virtual Satellite is based on Java / Eclipse and provides an installable feature with plug-ins for your personal eclipse IDE. The following infrastructure is required:
 - Java Development Kit (JDK) 8 - 64 bit
 - Windows 7 or Linux Computer - 64 bit

## Quickstart for users

If you just want to use Virtual Satellite feel free to grap it from the [Releases](https://github.com/virtualsatellite/VirtualSatellite4-TML/releases).

If you want to install TML into an existing eclipse you can use its *updatesite*.
Remember that you have to install Virtual Satellite Core as prerequisite ( as [package](https://github.com/virtualsatellite/VirtualSatellite4-Core/releases) or from its [updatesite](https://sourceforge.net/projects/virtualsatellite/files/VirtualSatellite4-Core/release/4.13.0/08b129cb4888ebf263db82a60f3f06a7bab970b9/) )

Update Sites

	https://sourceforge.net/projects/virtualsatellite/files/VirtualSatellite4-TML/



## User Manual
	
A user manual is located in the repository under *manual/user_manual.pdf* and can be found on the [Releases](https://github.com/virtualsatellite/VirtualSatellite4-TML/releases) site.


## Quickstart for developers

1. Open your Eclipse and switch to the Git Perspective.
2. Clone this repository.
3. Import all projects and working-sets via the ProjectSet file in _de.dlr.sc.virsat/projectSet_
6. Execute the Virtual Satellite build from _de.dlr.sc.virsat/launchers_
7. Inspect the build artifacts for the p2 repository in _de.dlr.sc.virsat.p2updatesite/target_


## Jenkins CI and Releases

Jenkins CI is set-up to start a build job for every branch and every new commit to the repository. It executes all relevant tests such as jUnit, Checkstyle, SpotBugs, etc. Making a successful pull-request into development requires all tests to pass.

Starting a Jenkins CI job on development or integration deploys all relevant artifacts.


## License

Copyright 2019 German Aerospace Center (DLR)

The German Aerospace Center (DLR) makes available all content in this plug-in ("Content").  Unless otherwise indicated below, the Content is provided to you under the terms and conditions of the Eclipse Public License Version 2.0 ("EPL").  A copy of the EPL is available at https://www.eclipse.org/legal/epl-2.0. For purposes of the EPL, "Program" will mean the Content.

If you did not receive this Content directly from German Aerospace Center (DLR), the Content is being redistributed by another party ("Redistributor") and different terms and conditions may apply to your use of any object code in the Content.  Check the Redistributor's license that was provided with the Content.  If no such license exists, contact the Redistributor.  Unless otherwise indicated below, the terms and conditions of the EPL still apply to this content.<p>

## Third Party Licenses

Third party licenses are named in the plug-ins where used in the respective _aboutfiles_ folders. At runtime third party licenses can be viewed in the usual Eclipse About dialog. Also check out the [Notice](NOTICE.md) file.
