package vr;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 * <p>
 * right-handed system
 * +y is up
 * +x is to the right
 * -z is going away from you
 * Distance unit is meters
 */
public class HmdMatrix44_t extends Structure {

    /**
     * float[4][4]<br>
     * C type : float[4][4]
     */
    public float[] m = new float[((4) * (4))];

    public HmdMatrix44_t() {
        super();
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("m");
    }

    /**
     * @param m float[4][4]<br>
     *          C type : float[4][4]
     */
    public HmdMatrix44_t(float m[]) {
        super();
        if ((m.length != this.m.length)) {
            throw new IllegalArgumentException("Wrong array size !");
        }
        this.m = m;
    }

    public HmdMatrix44_t(Pointer peer) {
        super(peer);
        read();
    }

    public static class ByReference extends HmdMatrix44_t implements Structure.ByReference {
    }

    public static class ByValue extends HmdMatrix44_t implements Structure.ByValue {
    }
}
