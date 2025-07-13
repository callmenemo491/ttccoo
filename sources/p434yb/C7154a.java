package p434yb;

/* renamed from: yb.a */
/* loaded from: classes.dex */
public final class C7154a {
    /* renamed from: a */
    public static int m14267a(int r5) {
            int r0 = android.hardware.Camera.getNumberOfCameras()
            r1 = -1
            if (r0 != 0) goto Lf
            java.lang.String r5 = "yb.a"
            java.lang.String r0 = "No cameras!"
            android.util.Log.w(r5, r0)
            return r1
        Lf:
            r2 = 0
            if (r5 < 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            if (r3 != 0) goto L2a
            r5 = 0
        L18:
            if (r5 >= r0) goto L2a
            android.hardware.Camera$CameraInfo r4 = new android.hardware.Camera$CameraInfo
            r4.<init>()
            android.hardware.Camera.getCameraInfo(r5, r4)
            int r4 = r4.facing
            if (r4 != 0) goto L27
            goto L2a
        L27:
            int r5 = r5 + 1
            goto L18
        L2a:
            if (r5 >= r0) goto L2d
            return r5
        L2d:
            if (r3 == 0) goto L30
            return r1
        L30:
            return r2
    }
}
