package vr;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;

/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IVRChaperone_FnTable extends Structure {

    /**
     * C type : GetCalibrationState_callback*
     */
    public GetCalibrationState_callback GetCalibrationState;
    /**
     * C type : GetPlayAreaSize_callback*
     */
    public GetPlayAreaSize_callback GetPlayAreaSize;
    /**
     * C type : GetPlayAreaRect_callback*
     */
    public GetPlayAreaRect_callback GetPlayAreaRect;
    /**
     * C type : ReloadInfo_callback*
     */
    public ReloadInfo_callback ReloadInfo;
    /**
     * C type : SetSceneColor_callback*
     */
    public SetSceneColor_callback SetSceneColor;
    /**
     * C type : GetBoundsColor_callback*
     */
    public GetBoundsColor_callback GetBoundsColor;
    /**
     * C type : AreBoundsVisible_callback*
     */
    public AreBoundsVisible_callback AreBoundsVisible;
    /**
     * C type : ForceBoundsVisible_callback*
     */
    public ForceBoundsVisible_callback ForceBoundsVisible;

    public interface GetCalibrationState_callback extends Callback {

        int apply();
    };

    public interface GetPlayAreaSize_callback extends Callback {

        byte apply(FloatBuffer pSizeX, FloatBuffer pSizeZ);
    };

    public interface GetPlayAreaRect_callback extends Callback {

        byte apply(HmdQuad_t rect);
    };

    public interface ReloadInfo_callback extends Callback {

        void apply();
    };

    public interface SetSceneColor_callback extends Callback {

        void apply(HmdColor_t.ByValue color);
    };

    public interface GetBoundsColor_callback extends Callback {

        void apply(HmdColor_t pOutputColorArray, int nNumOutputColors, float flCollisionBoundsFadeDistance, HmdColor_t pOutputCameraColor);
    };

    public interface AreBoundsVisible_callback extends Callback {

        byte apply();
    };

    public interface ForceBoundsVisible_callback extends Callback {

        void apply(byte bForce);
    };

    public IVRChaperone_FnTable() {
        super();
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("GetCalibrationState", "GetPlayAreaSize", "GetPlayAreaRect", "ReloadInfo", "SetSceneColor", "GetBoundsColor", "AreBoundsVisible", "ForceBoundsVisible");
    }

    /**
     * @param GetCalibrationState C type : GetCalibrationState_callback*<br>
     * @param GetPlayAreaSize C type : GetPlayAreaSize_callback*<br>
     * @param GetPlayAreaRect C type : GetPlayAreaRect_callback*<br>
     * @param ReloadInfo C type : ReloadInfo_callback*<br>
     * @param SetSceneColor C type : SetSceneColor_callback*<br>
     * @param GetBoundsColor C type : GetBoundsColor_callback*<br>
     * @param AreBoundsVisible C type : AreBoundsVisible_callback*<br>
     * @param ForceBoundsVisible C type : ForceBoundsVisible_callback*
     */
    public IVRChaperone_FnTable(GetCalibrationState_callback GetCalibrationState, GetPlayAreaSize_callback GetPlayAreaSize, GetPlayAreaRect_callback GetPlayAreaRect, ReloadInfo_callback ReloadInfo, SetSceneColor_callback SetSceneColor, GetBoundsColor_callback GetBoundsColor, AreBoundsVisible_callback AreBoundsVisible, ForceBoundsVisible_callback ForceBoundsVisible) {
        super();
        this.GetCalibrationState = GetCalibrationState;
        this.GetPlayAreaSize = GetPlayAreaSize;
        this.GetPlayAreaRect = GetPlayAreaRect;
        this.ReloadInfo = ReloadInfo;
        this.SetSceneColor = SetSceneColor;
        this.GetBoundsColor = GetBoundsColor;
        this.AreBoundsVisible = AreBoundsVisible;
        this.ForceBoundsVisible = ForceBoundsVisible;
    }

    public IVRChaperone_FnTable(Pointer peer) {
        super(peer);
        read();
    }

    public static class ByReference extends IVRChaperone_FnTable implements Structure.ByReference {

    };

    public static class ByValue extends IVRChaperone_FnTable implements Structure.ByValue {

    };
}
