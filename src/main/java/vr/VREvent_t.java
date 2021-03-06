package vr;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * An event posted by the server to all running applications.
 */
public class VREvent_t extends Structure {

    /**
     * EVREventType enum.
     */
    public int eventType;
    /**
     * C type : TrackedDeviceIndex_t
     */
    public int trackedDeviceIndex;
    public float eventAgeSeconds;
    /**
     * C type : VREvent_Data_t
     * <p>
     * event data must be the end of the struct as its size is variable.
     */
    public VREvent_Data_t data;

    public VREvent_t() {
        super();
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("eventType", "trackedDeviceIndex", "eventAgeSeconds", "data");
    }

    /**
     * @param eventType          EVREventType enum<br>
     * @param trackedDeviceIndex C type : TrackedDeviceIndex_t<br>
     * @param eventAgeSeconds
     * @param data               C type : VREvent_Data_t
     */
    public VREvent_t(int eventType, int trackedDeviceIndex, float eventAgeSeconds, VREvent_Data_t data) {
        super();
        this.eventType = eventType;
        this.trackedDeviceIndex = trackedDeviceIndex;
        this.eventAgeSeconds = eventAgeSeconds;
        this.data = data;
    }

    public VREvent_t(Pointer peer) {
        super(peer);
        read();
    }

    public static class ByReference extends VREvent_t implements Structure.ByReference {
    }

    public static class ByValue extends VREvent_t implements Structure.ByValue {
    }
}
