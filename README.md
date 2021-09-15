# Virtual Satellite 4 - Tasking Modeling Language Edition

Model-Based Tool for Generation of Event-Driven Software based on Virtual Satellite 

![TML](https://user-images.githubusercontent.com/49645871/133288171-81200c7e-c0cf-42d4-901c-731fcf81be69.png)

## Project Status

![Build Status](https://github.com/virtualsatellite/VirtualSatellite4-TML/workflows/Build/badge.svg?branch=development) Development

![Build Status](https://github.com/virtualsatellite/VirtualSatellite4-TML/workflows/Build/badge.svg?branch=integration) Integration

![Build Status](https://github.com/virtualsatellite/VirtualSatellite4-TML/workflows/Build/badge.svg?branch=master) Release

## Purpose

This development environment for the Tasking Modeling Language provides advanced editing capabilities for TML models. It allows specifying components, data flow between components and execution events that trigger components. Based on this description, it generates source code implementing the API of [Tasking](https://github.com/DLR-SC/tasking-framework). Editors and generated code provide extension mechanisms to extend your project to your specific needs.

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
	
A user manual is located in the repository under *de.dlr.sc.virsat.tml.docs.feature/docs/user_manual.pdf* and can be found on the [Releases](https://github.com/virtualsatellite/VirtualSatellite4-TML/releases) site.


## Quickstart for developers

1. Open your Eclipse and switch to the Git Perspective.
2. Clone this repository.
3. Import all projects and working-sets via the ProjectSet file in _de.dlr.sc.virsat/projectSet_
6. Execute the Virtual Satellite build from _de.dlr.sc.virsat/launchers_
7. Inspect the build artifacts for the p2 repository in _de.dlr.sc.virsat.p2updatesite/target_


## Github Actions and Releases

Github Actions is set-up to start a build job for every branch and every new commit to the repository. It executes all relevant tests such as jUnit, Checkstyle, SpotBugs, etc. Making a successful pull-request into development requires all tests to pass.

Starting a Github Actions job on development or integration deploys all relevant artifacts.

## Downloads and Deployment

Deployments are done using GitHub Releases as well as sourceforge: [![Download virtualsatellite](https://sourceforge.net/sflogo.php?type=13&group_id=3065053)](https://sourceforge.net/projects/virtualsatellite/files/VirtualSatellite4-TML/)

## Contribution

We are happy to receive your contributions. Nevertheless in such a big project there is a lot to respect and to obey. 
One thing to respect are legal requirements such as authorship rights and privacy protection. 
Therefore, before we can accept your contributions we need you to sign our *Contributor License Agreement (CLA)*.
The CLA is provided in *English* language only:

[Contributor License Agreement CLA](cla/20190724_DLR_Individual_Contributor_License_Agreement_Virtual_Satellite_en_v1.2.pdf)

Before you sign it and send it to us, you have to read the privacy policy as well.
The privacy policy is available in *English* and *German (Deutsch)* language: 

To contribute to this project follow the given steps:

[Declaration of consent data processing and privacy policy](cla/20190724_Declaration_of_consent_data_processing_and_privacy_policy_Virtual_Satellite_en_v1.2.pdf)

[Einverständniserklärung Datenverarbeitung und Datenschutz](cla/20190724_Einverständniserklärung_Datenverabreitung_und_Datenschutz_VirtualSatellite_de_v1.2.pdf)

If you agree to the CLA and privacy policy, please fill out the CLA and send it back to us. The detailed process of how to submit the documents is described in the documents themself.

Once you are an authorized committer feel free to contribute. We will not activate your account within our organization. Therefore use Pull-Requests to contribute:

1. Create your own fork of the project.
2. Apply your changes.
3. Make sure you own all relevant rights to make this contribution.
4. Make sure you are obeying legal requirements.
5. Create a pull-request of your change to our development branch.

To increase chance that we accept your pull-request, make sure all tests are working. The best indicator is the Travis CI job. Next we will review your pull-request, give comments and maybe accept it.

## License

Copyright 2021 German Aerospace Center (DLR)

The German Aerospace Center (DLR) makes available all content in this plug-in ("Content").  Unless otherwise indicated below, the Content is provided to you under the terms and conditions of the Eclipse Public License Version 2.0 ("EPL").  A copy of the EPL is available at https://www.eclipse.org/legal/epl-2.0. For purposes of the EPL, "Program" will mean the Content.

If you did not receive this Content directly from German Aerospace Center (DLR), the Content is being redistributed by another party ("Redistributor") and different terms and conditions may apply to your use of any object code in the Content.  Check the Redistributor's license that was provided with the Content.  If no such license exists, contact the Redistributor.  Unless otherwise indicated below, the terms and conditions of the EPL still apply to this content.<p>

## Third Party Licenses

Third party licenses are named in the plug-ins where used in the respective _aboutfiles_ folders. At runtime third party licenses can be viewed in the usual Eclipse About dialog. Also check out the [Notice](NOTICE.md) file.
