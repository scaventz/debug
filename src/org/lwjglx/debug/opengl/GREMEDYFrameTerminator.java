package org.lwjglx.debug.opengl;

import org.lwjglx.debug.Properties;
import org.lwjglx.debug.RT;

public class GREMEDYFrameTerminator {

    public static void glFrameTerminatorGREMEDY() {
        if (!Properties.PROFILE.enabled) {
            org.lwjgl.opengl.GREMEDYFrameTerminator.glFrameTerminatorGREMEDY();
            return;
        }
        RT.frame();
    }

}
