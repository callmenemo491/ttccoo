package ad;

/* renamed from: ad.b */
/* loaded from: classes.dex */
public final class C0059b {

    /* renamed from: a */
    public static final /* synthetic */ int f157a = 0;

    static {
            java.lang.String r0 = ";"
            java.util.regex.Pattern.compile(r0)
            return
    }

    /* renamed from: a */
    public static java.lang.String m92a(java.lang.String r5, java.util.Collection<java.lang.String> r6, java.lang.String... r7) {
            java.lang.String r0 = "Requesting "
            java.lang.String r1 = " value from among: "
            java.lang.StringBuilder r0 = androidx.activity.result.C0196d.m449a(r0, r5, r1)
            java.lang.String r1 = java.util.Arrays.toString(r7)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CameraConfiguration"
            android.util.Log.i(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Supported "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = " values: "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r1, r0)
            if (r6 == 0) goto L62
            int r0 = r7.length
            r2 = 0
        L38:
            if (r2 >= r0) goto L62
            r3 = r7[r2]
            boolean r4 = r6.contains(r3)
            if (r4 == 0) goto L5f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Can set "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = " to: "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r5 = r6.toString()
            android.util.Log.i(r1, r5)
            return r3
        L5f:
            int r2 = r2 + 1
            goto L38
        L62:
            java.lang.String r5 = "No supported values match"
            android.util.Log.i(r1, r5)
            r5 = 0
            return r5
    }

    /* renamed from: b */
    public static void m93b(android.hardware.Camera.Parameters r3, boolean r4) {
            java.util.List r0 = r3.getSupportedFlashModes()
            java.lang.String r1 = "flash mode"
            if (r4 == 0) goto L15
            java.lang.String r4 = "torch"
            java.lang.String r2 = "on"
            java.lang.String[] r4 = new java.lang.String[]{r4, r2}
            java.lang.String r4 = m92a(r1, r0, r4)
            goto L1f
        L15:
            java.lang.String r4 = "off"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r4 = m92a(r1, r0, r4)
        L1f:
            if (r4 == 0) goto L59
            java.lang.String r0 = r3.getFlashMode()
            boolean r0 = r4.equals(r0)
            java.lang.String r1 = "CameraConfiguration"
            if (r0 == 0) goto L42
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Flash mode already set to "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.i(r1, r3)
            goto L59
        L42:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Setting flash mode to "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r1, r0)
            r3.setFlashMode(r4)
        L59:
            return
    }
}
