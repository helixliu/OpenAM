/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2015-2016 ForgeRock AS.
 */

package org.forgerock.openam.upgrade;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenDJVersionTest {
    private static final OpenDJUpgrader.OpenDJVersion ONE = OpenDJUpgrader.OpenDJVersion.valueOf("1.0.0.x");
    private static final OpenDJUpgrader.OpenDJVersion ONE_DOT_ONE = OpenDJUpgrader.OpenDJVersion.valueOf("1.1.0.x");
    private static final OpenDJUpgrader.OpenDJVersion ONE_DOT_ONE_DOT_ONE = OpenDJUpgrader.OpenDJVersion.valueOf(
            "1.1.1.x");

    private static final OpenDJUpgrader.OpenDJVersion BUILD_A = OpenDJUpgrader.OpenDJVersion.valueOf("3.0.0.a");
    private static final OpenDJUpgrader.OpenDJVersion BUILD_A_UPPER = OpenDJUpgrader.OpenDJVersion.valueOf("3.0.0.A");
    private static final OpenDJUpgrader.OpenDJVersion BUILD_B = OpenDJUpgrader.OpenDJVersion.valueOf("3.0.0.b");

    @Test(dataProvider = "versionComparisons")
    public void testCompare(OpenDJUpgrader.OpenDJVersion a, OpenDJUpgrader.OpenDJVersion b, int expected) {
        assertEquals(a.compareTo(b), expected);
    }

    @Test
    public void testDifferentBuilds() {
        assertTrue(BUILD_A.isDifferentBuildTo(BUILD_B));
        assertFalse(BUILD_A.isDifferentBuildTo(BUILD_A_UPPER));
    }

    @DataProvider
    public Object[][] versionComparisons() {
        return new Object[][]{
                {OpenDJUpgrader.OpenDJVersion.UNKNOWN, ONE, -1},
                {ONE, OpenDJUpgrader.OpenDJVersion.UNKNOWN, 1},
                {ONE, ONE, 0},
                {ONE_DOT_ONE, ONE, 1},
                {ONE, ONE_DOT_ONE, -1},
                {ONE_DOT_ONE, ONE_DOT_ONE, 0},
                {ONE, ONE_DOT_ONE_DOT_ONE, -1},
                {ONE_DOT_ONE_DOT_ONE, ONE, 1},
                {ONE_DOT_ONE, ONE_DOT_ONE_DOT_ONE, -1},
                {ONE_DOT_ONE_DOT_ONE, ONE_DOT_ONE, 1},
                {ONE_DOT_ONE_DOT_ONE, ONE_DOT_ONE_DOT_ONE, 0},
                {BUILD_A, BUILD_B, 0} // Build is irrelevant to comparison
        };
    }

}