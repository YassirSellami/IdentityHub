/*
 *  Copyright (c) 2023 Amadeus
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Amadeus - initial API and implementation
 *
 */

plugins {
    `java-library`
}

dependencies {
    api(project(":spi:identity-hub-store-spi"))
    api(edc.ext.azure.cosmos.core)

    implementation(libs.failsafe.core)
    implementation(libs.azure.cosmos)

    testImplementation(testFixtures(project(":spi:identity-hub-store-spi")))
    testImplementation(testFixtures(edc.ext.azure.test))

}

publishing {
    publications {
        create<MavenPublication>(project.name) {
            from(components["java"])
        }
    }
}

