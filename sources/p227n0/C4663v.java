package p227n0;

/* renamed from: n0.v */
/* loaded from: classes.dex */
public final class C4663v {

    /* renamed from: a */
    public static java.lang.reflect.Method f18589a;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 != r1) goto L1b
            java.lang.Class<android.view.ViewConfiguration> r0 = android.view.ViewConfiguration.class
            java.lang.String r1 = "getScaledScrollFactor"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L14
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L14
            p227n0.C4663v.f18589a = r0     // Catch: java.lang.Exception -> L14
            goto L1b
        L14:
            java.lang.String r0 = "ViewConfigCompat"
            java.lang.String r1 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r0, r1)
        L1b:
            return
    }

    /* renamed from: a */
    public static float m10667a(android.view.ViewConfiguration r3, android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L20
            java.lang.reflect.Method r0 = p227n0.C4663v.f18589a
            if (r0 == 0) goto L20
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L19
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L19
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L19
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L19
            float r3 = (float) r3
            return r3
        L19:
            java.lang.String r3 = "ViewConfigCompat"
            java.lang.String r0 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r3, r0)
        L20:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r1 = 16842829(0x101004d, float:2.3693774E-38)
            r2 = 1
            boolean r0 = r0.resolveAttribute(r1, r3, r2)
            if (r0 == 0) goto L40
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r3 = r3.getDimension(r4)
            return r3
        L40:
            r3 = 0
            return r3
    }
}
