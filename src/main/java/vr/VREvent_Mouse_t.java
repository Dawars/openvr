package vr;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 * 
 * used for simulated mouse events in overlay space.
 */
public class VREvent_Mouse_t extends Structure {

    public float x, y;  // co-ords are in GL space, bottom left of the texture is 0,0
    public int button;  // EVRMouseButton enum

    public VREvent_Mouse_t() {
        super();
    }

    @Override
    protected List<?> getFieldOrder() {
        return Arrays.asList("x", "y", "button");
    }

    public VREvent_Mouse_t(float x, float y, int button) {
        super();
        this.x = x;
        this.y = y;
        this.button = button;
    }

    public VREvent_Mouse_t(Pointer peer) {
        super(peer);
        read();
    }

    public static class ByReference extends VREvent_Mouse_t implements Structure.ByReference {

    };

    public static class ByValue extends VREvent_Mouse_t implements Structure.ByValue {

    };
}