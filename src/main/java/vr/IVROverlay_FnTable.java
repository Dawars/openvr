package vr;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.LongByReference;
import com.sun.jna.ptr.PointerByReference;

import java.util.Arrays;
import java.util.List;

/**
 * This file was autogenerated by
 * <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that
 * <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a
 * few opensource projects.</a>.<br>
 * For help, please visit
 * <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> ,
 * <a href="http://rococoa.dev.java.net/">Rococoa</a>, or
 * <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IVROverlay_FnTable extends Structure {

    /**
     * C type : FindOverlay_callback*
     */
    public IVROverlay_FnTable.FindOverlay_callback FindOverlay;
    /**
     * C type : CreateOverlay_callback*
     */
    public IVROverlay_FnTable.CreateOverlay_callback CreateOverlay;
    /**
     * C type : DestroyOverlay_callback*
     */
    public IVROverlay_FnTable.DestroyOverlay_callback DestroyOverlay;
    /**
     * C type : SetHighQualityOverlay_callback*
     */
    public IVROverlay_FnTable.SetHighQualityOverlay_callback SetHighQualityOverlay;
    /**
     * C type : GetHighQualityOverlay_callback*
     */
    public IVROverlay_FnTable.GetHighQualityOverlay_callback GetHighQualityOverlay;
    /**
     * C type : GetOverlayKey_callback*
     */
    public IVROverlay_FnTable.GetOverlayKey_callback GetOverlayKey;
    /**
     * C type : GetOverlayName_callback*
     */
    public IVROverlay_FnTable.GetOverlayName_callback GetOverlayName;
    /**
     * C type : GetOverlayImageData_callback*
     */
    public IVROverlay_FnTable.GetOverlayImageData_callback GetOverlayImageData;
    /**
     * C type : GetOverlayErrorNameFromEnum_callback*
     */
    public IVROverlay_FnTable.GetOverlayErrorNameFromEnum_callback GetOverlayErrorNameFromEnum;
    /*
    EVROverlayError (OPENVR_FNTABLE_CALLTYPE *SetOverlayRenderingPid)(VROverlayHandle_t ulOverlayHandle, uint32_t unPID);
     */
    public IVROverlay_FnTable.SetOverlayRenderingPid_callback SetOverlayRenderingPid;
    /*
    uint32_t (OPENVR_FNTABLE_CALLTYPE *GetOverlayRenderingPid)(VROverlayHandle_t ulOverlayHandle);
     */
    public IVROverlay_FnTable.GetOverlayRenderingPid_callback GetOverlayRenderingPid;
    /**
     * C type : SetOverlayFlag_callback*
     */
    public IVROverlay_FnTable.SetOverlayFlag_callback SetOverlayFlag;
    /**
     * C type : GetOverlayFlag_callback*
     */
    public IVROverlay_FnTable.GetOverlayFlag_callback GetOverlayFlag;
    /**
     * C type : SetOverlayColor_callback*
     */
    public IVROverlay_FnTable.SetOverlayColor_callback SetOverlayColor;
    /**
     * C type : GetOverlayColor_callback*
     */
    public IVROverlay_FnTable.GetOverlayColor_callback GetOverlayColor;
    /**
     * C type : SetOverlayAlpha_callback*
     */
    public IVROverlay_FnTable.SetOverlayAlpha_callback SetOverlayAlpha;
    /**
     * C type : GetOverlayAlpha_callback*
     */
    public IVROverlay_FnTable.GetOverlayAlpha_callback GetOverlayAlpha;
    /*
        EVROverlayError (OPENVR_FNTABLE_CALLTYPE *SetOverlayTexelAspect)(VROverlayHandle_t ulOverlayHandle, float fTexelAspect);

     */
    public IVROverlay_FnTable.SetOverlayTexelAspect_callback SetOverlayTexelAspect;
    /*
    	EVROverlayError (OPENVR_FNTABLE_CALLTYPE *GetOverlayTexelAspect)(VROverlayHandle_t ulOverlayHandle, float * pfTexelAspect);

     */
    public IVROverlay_FnTable.GetOverlayTexelAspect_callback GetOverlayTexelAspect;
    /*
    	EVROverlayError (OPENVR_FNTABLE_CALLTYPE *SetOverlaySortOrder)(VROverlayHandle_t ulOverlayHandle, uint32_t unSortOrder);

     */
    public IVROverlay_FnTable.SetOverlaySortOrder_callback SetOverlaySortOrder;
    /*
    	EVROverlayError (OPENVR_FNTABLE_CALLTYPE *GetOverlaySortOrder)(VROverlayHandle_t ulOverlayHandle, uint32_t * punSortOrder);

     */
    public IVROverlay_FnTable.GetOverlaySortOrder_callback GetOverlaySortOrder;

    /**
     * C type : SetOverlayWidthInMeters_callback*
     */
    public IVROverlay_FnTable.SetOverlayWidthInMeters_callback SetOverlayWidthInMeters;
    /**
     * C type : GetOverlayWidthInMeters_callback*
     */
    public IVROverlay_FnTable.GetOverlayWidthInMeters_callback GetOverlayWidthInMeters;
    /**
     * C type : SetOverlayAutoCurveDistanceRangeInMeters_callback*
     */
    public IVROverlay_FnTable.SetOverlayAutoCurveDistanceRangeInMeters_callback SetOverlayAutoCurveDistanceRangeInMeters;
    /**
     * C type : GetOverlayAutoCurveDistanceRangeInMeters_callback*
     */
    public IVROverlay_FnTable.GetOverlayAutoCurveDistanceRangeInMeters_callback GetOverlayAutoCurveDistanceRangeInMeters;
    /**
     * C type : SetOverlayTextureColorSpace_callback*
     */
    public IVROverlay_FnTable.SetOverlayTextureColorSpace_callback SetOverlayTextureColorSpace;
    /**
     * C type : GetOverlayTextureColorSpace_callback*
     */
    public IVROverlay_FnTable.GetOverlayTextureColorSpace_callback GetOverlayTextureColorSpace;
    /**
     * C type : SetOverlayTextureBounds_callback*
     */
    public IVROverlay_FnTable.SetOverlayTextureBounds_callback SetOverlayTextureBounds;
    /**
     * C type : GetOverlayTextureBounds_callback*
     */
    public IVROverlay_FnTable.GetOverlayTextureBounds_callback GetOverlayTextureBounds;
    /**
     * C type : GetOverlayTransformType_callback*
     */
    public IVROverlay_FnTable.GetOverlayTransformType_callback GetOverlayTransformType;
    /**
     * C type : SetOverlayTransformAbsolute_callback*
     */
    public IVROverlay_FnTable.SetOverlayTransformAbsolute_callback SetOverlayTransformAbsolute;
    /**
     * C type : GetOverlayTransformAbsolute_callback*
     */
    public IVROverlay_FnTable.GetOverlayTransformAbsolute_callback GetOverlayTransformAbsolute;
    /**
     * C type : SetOverlayTransformTrackedDeviceRelative_callback*
     */
    public IVROverlay_FnTable.SetOverlayTransformTrackedDeviceRelative_callback SetOverlayTransformTrackedDeviceRelative;
    /**
     * C type : GetOverlayTransformTrackedDeviceRelative_callback*
     */
    public IVROverlay_FnTable.GetOverlayTransformTrackedDeviceRelative_callback GetOverlayTransformTrackedDeviceRelative;
    /**
     * C type : SetOverlayTransformTrackedDeviceComponent_callback*
     */
    public IVROverlay_FnTable.SetOverlayTransformTrackedDeviceComponent_callback SetOverlayTransformTrackedDeviceComponent;
    /**
     * C type : GetOverlayTransformTrackedDeviceComponent_callback*
     */
    public IVROverlay_FnTable.GetOverlayTransformTrackedDeviceComponent_callback GetOverlayTransformTrackedDeviceComponent;
    /**
     * C type : ShowOverlay_callback*
     */
    public IVROverlay_FnTable.ShowOverlay_callback ShowOverlay;
    /**
     * C type : HideOverlay_callback*
     */
    public IVROverlay_FnTable.HideOverlay_callback HideOverlay;
    /**
     * C type : IsOverlayVisible_callback*
     */
    public IVROverlay_FnTable.IsOverlayVisible_callback IsOverlayVisible;
    /**
     * C type : GetTransformForOverlayCoordinates_callback*
     */
    public IVROverlay_FnTable.GetTransformForOverlayCoordinates_callback GetTransformForOverlayCoordinates;
    /**
     * C type : PollNextOverlayEvent_callback*
     */
    public IVROverlay_FnTable.PollNextOverlayEvent_callback PollNextOverlayEvent;
    /**
     * C type : GetOverlayInputMethod_callback*
     */
    public IVROverlay_FnTable.GetOverlayInputMethod_callback GetOverlayInputMethod;
    /**
     * C type : SetOverlayInputMethod_callback*
     */
    public IVROverlay_FnTable.SetOverlayInputMethod_callback SetOverlayInputMethod;
    /**
     * C type : GetOverlayMouseScale_callback*
     */
    public IVROverlay_FnTable.GetOverlayMouseScale_callback GetOverlayMouseScale;
    /**
     * C type : SetOverlayMouseScale_callback*
     */
    public IVROverlay_FnTable.SetOverlayMouseScale_callback SetOverlayMouseScale;
    /**
     * C type : ComputeOverlayIntersection_callback*
     */
    public IVROverlay_FnTable.ComputeOverlayIntersection_callback ComputeOverlayIntersection;
    /**
     * C type : HandleControllerOverlayInteractionAsMouse_callback*
     */
    public IVROverlay_FnTable.HandleControllerOverlayInteractionAsMouse_callback HandleControllerOverlayInteractionAsMouse;
    /**
     * C type : IsHoverTargetOverlay_callback*
     */
    public IVROverlay_FnTable.IsHoverTargetOverlay_callback IsHoverTargetOverlay;
    /**
     * C type : GetGamepadFocusOverlay_callback*
     */
    public IVROverlay_FnTable.GetGamepadFocusOverlay_callback GetGamepadFocusOverlay;
    /**
     * C type : SetGamepadFocusOverlay_callback*
     */
    public IVROverlay_FnTable.SetGamepadFocusOverlay_callback SetGamepadFocusOverlay;
    /**
     * C type : SetOverlayNeighbor_callback*
     */
    public IVROverlay_FnTable.SetOverlayNeighbor_callback SetOverlayNeighbor;
    /**
     * C type : MoveGamepadFocusToNeighbor_callback*
     */
    public IVROverlay_FnTable.MoveGamepadFocusToNeighbor_callback MoveGamepadFocusToNeighbor;
    /**
     * C type : SetOverlayTexture_callback*
     */
    public IVROverlay_FnTable.SetOverlayTexture_callback SetOverlayTexture;
    /**
     * C type : ClearOverlayTexture_callback*
     */
    public IVROverlay_FnTable.ClearOverlayTexture_callback ClearOverlayTexture;
    /**
     * C type : SetOverlayRaw_callback*
     */
    public IVROverlay_FnTable.SetOverlayRaw_callback SetOverlayRaw;
    /**
     * C type : SetOverlayFromFile_callback*
     */
    public IVROverlay_FnTable.SetOverlayFromFile_callback SetOverlayFromFile;

    /*
        EVROverlayError (OPENVR_FNTABLE_CALLTYPE *GetOverlayTexture)(VROverlayHandle_t ulOverlayHandle, void ** pNativeTextureHandle, void * pNativeTextureRef, uint32_t * pWidth, uint32_t * pHeight, uint32_t * pNativeFormat, EGraphicsAPIConvention * pAPI, EColorSpace * pColorSpace);

     */
    public IVROverlay_FnTable.GetOverlayTexture_callback GetOverlayTexture;
    /*
    	EVROverlayError (OPENVR_FNTABLE_CALLTYPE *ReleaseNativeOverlayHandle)(VROverlayHandle_t ulOverlayHandle, void * pNativeTextureHandle);

     */
    public IVROverlay_FnTable.ReleaseNativeOverlayHandle_callback ReleaseNativeOverlayHandle;
    /*
    	EVROverlayError (OPENVR_FNTABLE_CALLTYPE *GetOverlayTextureSize)(VROverlayHandle_t ulOverlayHandle, uint32_t * pWidth, uint32_t * pHeight);

     */
    public IVROverlay_FnTable.GetOverlayTextureSize_callback GetOverlayTextureSize;

    /**
     * C type : CreateDashboardOverlay_callback*
     */
    public IVROverlay_FnTable.CreateDashboardOverlay_callback CreateDashboardOverlay;
    /**
     * C type : IsDashboardVisible_callback*
     */
    public IVROverlay_FnTable.IsDashboardVisible_callback IsDashboardVisible;
    /**
     * C type : IsActiveDashboardOverlay_callback*
     */
    public IVROverlay_FnTable.IsActiveDashboardOverlay_callback IsActiveDashboardOverlay;
    /**
     * C type : SetDashboardOverlaySceneProcess_callback*
     */
    public IVROverlay_FnTable.SetDashboardOverlaySceneProcess_callback SetDashboardOverlaySceneProcess;
    /**
     * C type : GetDashboardOverlaySceneProcess_callback*
     */
    public IVROverlay_FnTable.GetDashboardOverlaySceneProcess_callback GetDashboardOverlaySceneProcess;
    /**
     * C type : ShowDashboard_callback*
     */
    public IVROverlay_FnTable.ShowDashboard_callback ShowDashboard;
    /**
     * C type : GetPrimaryDashboardDevice_callback*
     */
    public IVROverlay_FnTable.GetPrimaryDashboardDevice_callback GetPrimaryDashboardDevice;
    /**
     * C type : ShowKeyboard_callback*
     */
    public IVROverlay_FnTable.ShowKeyboard_callback ShowKeyboard;
    /**
     * C type : ShowKeyboardForOverlay_callback*
     */
    public IVROverlay_FnTable.ShowKeyboardForOverlay_callback ShowKeyboardForOverlay;
    /**
     * C type : GetKeyboardText_callback*
     */
    public IVROverlay_FnTable.GetKeyboardText_callback GetKeyboardText;
    /**
     * C type : HideKeyboard_callback*
     */
    public IVROverlay_FnTable.HideKeyboard_callback HideKeyboard;
    /**
     * C type : SetKeyboardTransformAbsolute_callback*
     */
    public IVROverlay_FnTable.SetKeyboardTransformAbsolute_callback SetKeyboardTransformAbsolute;
    /**
     * C type : SetKeyboardPositionForOverlay_callback*
     */
    public IVROverlay_FnTable.SetKeyboardPositionForOverlay_callback SetKeyboardPositionForOverlay;
    /**
     * C type : SetOverlayIntersectionMask_callback*
     */
    public IVROverlay_FnTable.SetOverlayIntersectionMask_callback SetOverlayIntersectionMask;

    public IVROverlay_FnTable.GetOverlayFlags_callback GetOverlayFlags;
    public IVROverlay_FnTable.ShowMessageOverlay_callback ShowMessageOverlay;
    public IVROverlay_FnTable.CloseMessageOverlay_callback CloseMessageOverlay;

    public interface FindOverlay_callback extends Callback {

        int apply(Pointer pchOverlayKey, LongByReference pOverlayHandle);
    };

    public interface CreateOverlay_callback extends Callback {

        int apply(Pointer pchOverlayKey, Pointer pchOverlayFriendlyName, LongByReference pOverlayHandle);
    };

    public interface DestroyOverlay_callback extends Callback {

        int apply(long ulOverlayHandle);
    };

    public interface SetHighQualityOverlay_callback extends Callback {

        int apply(long ulOverlayHandle);
    };

    public interface GetHighQualityOverlay_callback extends Callback {

        long apply();
    };

    public interface GetOverlayKey_callback extends Callback {

        int apply(long ulOverlayHandle, Pointer pchValue, int unBufferSize, IntByReference pError);
    };

    public interface GetOverlayName_callback extends Callback {

        int apply(long ulOverlayHandle, Pointer pchValue, int unBufferSize, IntByReference pError);
    };

    public interface GetOverlayImageData_callback extends Callback {

        int apply(long ulOverlayHandle, Pointer pvBuffer, int unBufferSize, IntByReference punWidth, IntByReference punHeight);
    };

    public interface GetOverlayErrorNameFromEnum_callback extends Callback {

        Pointer apply(int error);
    };

    public interface SetOverlayRenderingPid_callback extends Callback {

        int apply(long ulOverlayHandle, int unPID);
    }

    public interface GetOverlayRenderingPid_callback extends Callback {

        int apply(long ulOverlayHandle);
    }

    public interface SetOverlayFlag_callback extends Callback {

        int apply(long ulOverlayHandle, int eOverlayFlag, byte bEnabled);
    };

    public interface GetOverlayFlag_callback extends Callback {

        int apply(long ulOverlayHandle, int eOverlayFlag, Pointer pbEnabled);
    };

    public interface SetOverlayColor_callback extends Callback {

        int apply(long ulOverlayHandle, float fRed, float fGreen, float fBlue);
    };

    public interface GetOverlayColor_callback extends Callback {

        int apply(long ulOverlayHandle, FloatByReference pfRed, FloatByReference pfGreen, FloatByReference pfBlue);
    };

    public interface SetOverlayAlpha_callback extends Callback {

        int apply(long ulOverlayHandle, float fAlpha);
    };

    public interface GetOverlayAlpha_callback extends Callback {

        int apply(long ulOverlayHandle, FloatByReference pfAlpha);
    };

    public interface SetOverlayTexelAspect_callback extends Callback {

        int apply(long ulOverlayHandle, float fTexelAspect);
    };

    public interface GetOverlayTexelAspect_callback extends Callback {

        int apply(long ulOverlayHandle, FloatByReference pfTexelAspect);
    };

    public interface SetOverlaySortOrder_callback extends Callback {

        int apply(long ulOverlayHandle, int unSortOrder);
    };

    public interface GetOverlaySortOrder_callback extends Callback {

        int apply(long ulOverlayHandle, IntByReference punSortOrder);
    };

    public interface SetOverlayWidthInMeters_callback extends Callback {

        int apply(long ulOverlayHandle, float fWidthInMeters);
    };

    public interface GetOverlayWidthInMeters_callback extends Callback {

        int apply(long ulOverlayHandle, FloatByReference pfWidthInMeters);
    };

    public interface SetOverlayAutoCurveDistanceRangeInMeters_callback extends Callback {

        int apply(long ulOverlayHandle, float fMinDistanceInMeters, float fMaxDistanceInMeters);
    };

    public interface GetOverlayAutoCurveDistanceRangeInMeters_callback extends Callback {

        int apply(long ulOverlayHandle, FloatByReference pfMinDistanceInMeters, FloatByReference pfMaxDistanceInMeters);
    };

    public interface SetOverlayTextureColorSpace_callback extends Callback {

        int apply(long ulOverlayHandle, int eTextureColorSpace);
    };

    public interface GetOverlayTextureColorSpace_callback extends Callback {

        int apply(long ulOverlayHandle, IntByReference peTextureColorSpace);
    };

    public interface SetOverlayTextureBounds_callback extends Callback {

        int apply(long ulOverlayHandle, VRTextureBounds_t pOverlayTextureBounds);
    };

    public interface GetOverlayTextureBounds_callback extends Callback {

        int apply(long ulOverlayHandle, VRTextureBounds_t pOverlayTextureBounds);
    };

    public interface GetOverlayTransformType_callback extends Callback {

        int apply(long ulOverlayHandle, IntByReference peTransformType);
    };

    public interface SetOverlayTransformAbsolute_callback extends Callback {

        int apply(long ulOverlayHandle, int eTrackingOrigin, HmdMatrix34_t pmatTrackingOriginToOverlayTransform);
    };

    public interface GetOverlayTransformAbsolute_callback extends Callback {

        int apply(long ulOverlayHandle, IntByReference peTrackingOrigin, HmdMatrix34_t pmatTrackingOriginToOverlayTransform);
    };

    public interface SetOverlayTransformTrackedDeviceRelative_callback extends Callback {

        int apply(long ulOverlayHandle, int unTrackedDevice, HmdMatrix34_t pmatTrackedDeviceToOverlayTransform);
    };

    public interface GetOverlayTransformTrackedDeviceRelative_callback extends Callback {

        int apply(long ulOverlayHandle, IntByReference punTrackedDevice, HmdMatrix34_t pmatTrackedDeviceToOverlayTransform);
    };

    public interface SetOverlayTransformTrackedDeviceComponent_callback extends Callback {

        int apply(long ulOverlayHandle, int unDeviceIndex, Pointer pchComponentName);
    };

    public interface GetOverlayTransformTrackedDeviceComponent_callback extends Callback {

        int apply(long ulOverlayHandle, IntByReference punDeviceIndex, Pointer pchComponentName, int unComponentNameSize);
    };

    public interface ShowOverlay_callback extends Callback {

        int apply(long ulOverlayHandle);
    };

    public interface HideOverlay_callback extends Callback {

        int apply(long ulOverlayHandle);
    };

    public interface IsOverlayVisible_callback extends Callback {

        byte apply(long ulOverlayHandle);
    };

    public interface GetTransformForOverlayCoordinates_callback extends Callback {

        int apply(long ulOverlayHandle, int eTrackingOrigin, HmdVector2_t.ByValue coordinatesInOverlay, HmdMatrix34_t pmatTransform);
    };

    public interface PollNextOverlayEvent_callback extends Callback {

        byte apply(long ulOverlayHandle, VREvent_t pEvent, int uncbVREvent);
    };

    public interface GetOverlayInputMethod_callback extends Callback {

        int apply(long ulOverlayHandle, IntByReference peInputMethod);
    };

    public interface SetOverlayInputMethod_callback extends Callback {

        int apply(long ulOverlayHandle, int eInputMethod);
    };

    public interface GetOverlayMouseScale_callback extends Callback {

        int apply(long ulOverlayHandle, HmdVector2_t pvecMouseScale);
    };

    public interface SetOverlayMouseScale_callback extends Callback {

        int apply(long ulOverlayHandle, HmdVector2_t pvecMouseScale);
    };

    public interface ComputeOverlayIntersection_callback extends Callback {

        byte apply(long ulOverlayHandle, VROverlayIntersectionParams_t pParams, VROverlayIntersectionResults_t pResults);
    };

    public interface HandleControllerOverlayInteractionAsMouse_callback extends Callback {

        byte apply(long ulOverlayHandle, int unControllerDeviceIndex);
    };

    public interface IsHoverTargetOverlay_callback extends Callback {

        byte apply(long ulOverlayHandle);
    };

    public interface GetGamepadFocusOverlay_callback extends Callback {

        long apply();
    };

    public interface SetGamepadFocusOverlay_callback extends Callback {

        int apply(long ulNewFocusOverlay);
    };

    public interface SetOverlayNeighbor_callback extends Callback {

        int apply(int eDirection, long ulFrom, long ulTo);
    };

    public interface MoveGamepadFocusToNeighbor_callback extends Callback {

        int apply(int eDirection, long ulFrom);
    };

    public interface SetOverlayTexture_callback extends Callback {

        int apply(long ulOverlayHandle, Texture_t pTexture);
    };

    public interface ClearOverlayTexture_callback extends Callback {

        int apply(long ulOverlayHandle);
    };

    public interface SetOverlayRaw_callback extends Callback {

        int apply(long ulOverlayHandle, Pointer pvBuffer, int unWidth, int unHeight, int unDepth);
    };

    public interface SetOverlayFromFile_callback extends Callback {

        int apply(long ulOverlayHandle, Pointer pchFilePath);
    };

    public interface GetOverlayTexture_callback extends Callback {

        int apply(long ulOverlayHandle, PointerByReference pNativeTextureHandle,
                  Pointer pNativeTextureRef, IntByReference pWidth, IntByReference pHeight,
                  IntByReference pNativeFormat, VR.ETextureType pAPIType/*pointer?*/, IntByReference pColorSpace,
                  VRTextureBounds_t pTextureBounds);
    };

    public interface ReleaseNativeOverlayHandle_callback extends Callback {

        int apply(long ulOverlayHandle, Pointer pNativeTextureHandle);
    };

    public interface GetOverlayTextureSize_callback extends Callback {

        int apply(long ulOverlayHandle, IntByReference pWidth, IntByReference pHeight);
    };

    public interface CreateDashboardOverlay_callback extends Callback {

        int apply(Pointer pchOverlayKey, Pointer pchOverlayFriendlyName, LongByReference pMainHandle, LongByReference pThumbnailHandle);
    };

    public interface IsDashboardVisible_callback extends Callback {

        byte apply();
    };

    public interface IsActiveDashboardOverlay_callback extends Callback {

        byte apply(long ulOverlayHandle);
    };

    public interface SetDashboardOverlaySceneProcess_callback extends Callback {

        int apply(long ulOverlayHandle, int unProcessId);
    };

    public interface GetDashboardOverlaySceneProcess_callback extends Callback {

        int apply(long ulOverlayHandle, IntByReference punProcessId);
    };

    public interface ShowDashboard_callback extends Callback {

        void apply(Pointer pchOverlayToShow);
    };

    public interface GetPrimaryDashboardDevice_callback extends Callback {

        int apply();
    };

    public interface ShowKeyboard_callback extends Callback {

        int apply(int eInputMode, int eLineInputMode, Pointer pchDescription, int unCharMax, Pointer pchExistingText, byte bUseMinimalMode, long uUserValue);
    };

    public interface ShowKeyboardForOverlay_callback extends Callback {

        int apply(long ulOverlayHandle, int eInputMode, int eLineInputMode, Pointer pchDescription, int unCharMax, Pointer pchExistingText, byte bUseMinimalMode, long uUserValue);
    };

    public interface GetKeyboardText_callback extends Callback {

        int apply(Pointer pchText, int cchText);
    };

    public interface HideKeyboard_callback extends Callback {

        void apply();
    };

    public interface SetKeyboardTransformAbsolute_callback extends Callback {

        void apply(int eTrackingOrigin, HmdMatrix34_t pmatTrackingOriginToKeyboardTransform);
    };

    public interface SetKeyboardPositionForOverlay_callback extends Callback {

        void apply(long ulOverlayHandle, vr.HmdRect2_t.ByValue avoidRect);
    };
    public interface SetOverlayIntersectionMask_callback extends Callback {

        VR.EVROverlayError apply(long ulOverlayHandle, VROverlayIntersectionMaskPrimitive_t pMaskPrimitives, int unNumMaskPrimitives, int unPrimitiveSize);
    };
    public interface GetOverlayFlags_callback extends Callback {

        VR.EVROverlayError apply(long ulOverlayHandle, int pFlags);
    };

    // ---------------------------------------------
    // Message box methods
    // ---------------------------------------------

    public interface ShowMessageOverlay_callback extends Callback {

        int apply(String pchText, String pchCaption, String pchButton0Text,
                                          String pchButton1Text, String pchButton2Text, String pchButton3Text);
    };

    public interface CloseMessageOverlay_callback extends Callback {
        /** If the calling process owns the overlay and it's open, this will close it. **/
        void apply();
    }

    public IVROverlay_FnTable() {
        super();
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("FindOverlay", "CreateOverlay", "DestroyOverlay",
                "SetHighQualityOverlay", "GetHighQualityOverlay", "GetOverlayKey",
                "GetOverlayName", "GetOverlayImageData", "GetOverlayErrorNameFromEnum","SetOverlayRenderingPid",
                "GetOverlayRenderingPid",
                "SetOverlayFlag", "GetOverlayFlag", "SetOverlayColor",
                "GetOverlayColor", "SetOverlayAlpha", "GetOverlayAlpha","SetOverlayTexelAspect","GetOverlayTexelAspect",
                "SetOverlaySortOrder","GetOverlaySortOrder",
                "SetOverlayWidthInMeters", "GetOverlayWidthInMeters",
                "SetOverlayAutoCurveDistanceRangeInMeters", "GetOverlayAutoCurveDistanceRangeInMeters",
                "SetOverlayTextureColorSpace", "GetOverlayTextureColorSpace", "SetOverlayTextureBounds",
                "GetOverlayTextureBounds", "GetOverlayTransformType", "SetOverlayTransformAbsolute",
                "GetOverlayTransformAbsolute", "SetOverlayTransformTrackedDeviceRelative",
                "GetOverlayTransformTrackedDeviceRelative", "SetOverlayTransformTrackedDeviceComponent",
                "GetOverlayTransformTrackedDeviceComponent", "ShowOverlay", "HideOverlay",
                "IsOverlayVisible", "GetTransformForOverlayCoordinates", "PollNextOverlayEvent",
                "GetOverlayInputMethod", "SetOverlayInputMethod", "GetOverlayMouseScale",
                "SetOverlayMouseScale", "ComputeOverlayIntersection", "HandleControllerOverlayInteractionAsMouse",
                "IsHoverTargetOverlay", "GetGamepadFocusOverlay", "SetGamepadFocusOverlay",
                "SetOverlayNeighbor", "MoveGamepadFocusToNeighbor", "SetOverlayTexture",
                "ClearOverlayTexture", "SetOverlayRaw", "SetOverlayFromFile", "GetOverlayTexture",
                "ReleaseNativeOverlayHandle","GetOverlayTextureSize","CreateDashboardOverlay",
                "IsDashboardVisible", "IsActiveDashboardOverlay", "SetDashboardOverlaySceneProcess",
                "GetDashboardOverlaySceneProcess", "ShowDashboard", "GetPrimaryDashboardDevice",
                "ShowKeyboard", "ShowKeyboardForOverlay", "GetKeyboardText", "HideKeyboard",
                "SetKeyboardTransformAbsolute", "SetKeyboardPositionForOverlay", "SetOverlayIntersectionMask",
                "GetOverlayFlags", "ShowMessageOverlay", "CloseMessageOverlay");
    }

    public IVROverlay_FnTable(Pointer peer) {
        super(peer);
        read();
    }

    public static class ByReference extends IVROverlay_FnTable implements Structure.ByReference {

    };

    public static class ByValue extends IVROverlay_FnTable implements Structure.ByValue {

    };
}
