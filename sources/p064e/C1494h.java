package p064e;

/* renamed from: e.h */
/* loaded from: classes.dex */
public class C1494h {

    /* renamed from: a */
    public static java.lang.reflect.Method f7256a;

    /* renamed from: a */
    public static void m4050a(boolean r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: b */
    public static int m4051b(android.content.Context r6, java.lang.String r7) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r6.getPackageName()
            int r0 = r6.checkPermission(r7, r0, r1)
            r3 = 0
            r4 = -1
            if (r0 != r4) goto L15
            goto L37
        L15:
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r0 < r5) goto L20
            java.lang.String r7 = android.app.AppOpsManager.permissionToOp(r7)
            goto L21
        L20:
            r7 = 0
        L21:
            if (r7 != 0) goto L24
            goto L77
        L24:
            if (r2 != 0) goto L39
            android.content.pm.PackageManager r2 = r6.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L37
            int r5 = r2.length
            if (r5 > 0) goto L34
            goto L37
        L34:
            r2 = r2[r3]
            goto L39
        L37:
            r3 = -1
            goto L77
        L39:
            int r4 = android.os.Process.myUid()
            java.lang.String r5 = r6.getPackageName()
            if (r4 != r1) goto L4b
            boolean r4 = java.util.Objects.equals(r5, r2)
            if (r4 == 0) goto L4b
            r4 = 1
            goto L4c
        L4b:
            r4 = 0
        L4c:
            if (r4 == 0) goto L6f
            r4 = 29
            if (r0 < r4) goto L6a
            android.app.AppOpsManager r0 = p030c0.C0819f.a.m2469c(r6)
            int r4 = android.os.Binder.getCallingUid()
            int r2 = p030c0.C0819f.a.m2467a(r0, r7, r4, r2)
            if (r2 == 0) goto L61
            goto L73
        L61:
            java.lang.String r6 = p030c0.C0819f.a.m2468b(r6)
            int r2 = p030c0.C0819f.a.m2467a(r0, r7, r1, r6)
            goto L73
        L6a:
            int r2 = p030c0.C0819f.m2466a(r6, r7, r2)
            goto L73
        L6f:
            int r2 = p030c0.C0819f.m2466a(r6, r7, r2)
        L73:
            if (r2 != 0) goto L76
            goto L77
        L76:
            r3 = -2
        L77:
            return r3
    }

    /* renamed from: c */
    public static void m4052c(java.lang.String r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.String r2 = m4058i(r2)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r3 = java.lang.String.format(r3, r0)
            android.util.Log.d(r2, r3)
            return
    }

    /* renamed from: d */
    public static void m4053d(java.lang.String r0, java.lang.String r1, java.lang.Object... r2) {
            java.lang.String r0 = m4058i(r0)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            android.util.Log.d(r0, r1)
            return
    }

    /* renamed from: e */
    public static void m4054e(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = m4058i(r0)
            android.util.Log.e(r0, r1, r2)
            return
    }

    /* renamed from: f */
    public static <T extends android.view.View> T m4055f(android.view.View r4, int r5) {
            boolean r0 = r4 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L1d
            android.view.View r3 = r4.getChildAt(r2)
            android.view.View r3 = r3.findViewById(r5)
            if (r3 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Ld
        L1d:
            return r1
    }

    /* renamed from: g */
    public static java.lang.String m4056g(org.xmlpull.v1.XmlPullParser r3, java.lang.String r4) {
            int r0 = r3.getAttributeCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            java.lang.String r2 = r3.getAttributeName(r1)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L16
            java.lang.String r3 = r3.getAttributeValue(r1)
            return r3
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r3 = 0
            return r3
    }

    /* renamed from: h */
    public static android.os.IBinder m4057h(android.os.Bundle r8, java.lang.String r9) {
            int r0 = p371v5.C6552b0.f25624a
            r1 = 18
            if (r0 < r1) goto Lb
            android.os.IBinder r8 = r8.getBinder(r9)
            return r8
        Lb:
            java.lang.reflect.Method r0 = p064e.C1494h.f7256a
            r1 = 0
            java.lang.String r2 = "BundleUtil"
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L35
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.String r5 = "getIBinder"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L2a
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7     // Catch: java.lang.NoSuchMethodException -> L2a
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L2a
            p064e.C1494h.f7256a = r0     // Catch: java.lang.NoSuchMethodException -> L2a
            r0.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L2a
            java.lang.reflect.Method r0 = p064e.C1494h.f7256a
            goto L35
        L2a:
            r8 = move-exception
            java.lang.String r9 = "Failed to retrieve getIBinder method"
        L2d:
            java.lang.String r8 = p371v5.C6565o.m13368a(r9, r8)
            android.util.Log.i(r2, r8)
            goto L49
        L35:
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.IllegalArgumentException -> L41 java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L45
            r4[r3] = r9     // Catch: java.lang.IllegalArgumentException -> L41 java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L45
            java.lang.Object r8 = r0.invoke(r8, r4)     // Catch: java.lang.IllegalArgumentException -> L41 java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L45
            android.os.IBinder r8 = (android.os.IBinder) r8     // Catch: java.lang.IllegalArgumentException -> L41 java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L45
            r1 = r8
            goto L49
        L41:
            r8 = move-exception
            goto L46
        L43:
            r8 = move-exception
            goto L46
        L45:
            r8 = move-exception
        L46:
            java.lang.String r9 = "Failed to invoke getIBinder via reflection"
            goto L2d
        L49:
            return r1
    }

    /* renamed from: i */
    public static java.lang.String m4058i(java.lang.String r1) {
            java.lang.String r0 = "TransportRuntime."
            java.lang.String r1 = p064e.C1493g.m4049a(r0, r1)
            return r1
    }

    /* renamed from: j */
    public static void m4059j(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = m4058i(r0)
            android.util.Log.i(r0, r1)
            return
    }

    /* renamed from: k */
    public static boolean m4060k(org.xmlpull.v1.XmlPullParser r4, java.lang.String r5) {
            int r0 = r4.getEventType()
            r1 = 0
            r2 = 1
            r3 = 3
            if (r0 != r3) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L19
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L19
            r1 = 1
        L19:
            return r1
    }

    /* renamed from: l */
    public static boolean m4061l(org.xmlpull.v1.XmlPullParser r4, java.lang.String r5) {
            int r0 = r4.getEventType()
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 != r3) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L19
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L19
            r1 = 1
        L19:
            return r1
    }

    /* renamed from: m */
    public static java.lang.String m4062m(java.lang.String r3, java.lang.String r4) {
            int r0 = r3.length()
            int r1 = r4.length()
            int r0 = r0 - r1
            if (r0 < 0) goto L3f
            r1 = 1
            if (r0 > r1) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            int r2 = r4.length()
            int r2 = r2 + r1
            r0.<init>(r2)
            r1 = 0
        L1d:
            int r2 = r3.length()
            if (r1 >= r2) goto L3a
            char r2 = r3.charAt(r1)
            r0.append(r2)
            int r2 = r4.length()
            if (r2 <= r1) goto L37
            char r2 = r4.charAt(r1)
            r0.append(r2)
        L37:
            int r1 = r1 + 1
            goto L1d
        L3a:
            java.lang.String r3 = r0.toString()
            return r3
        L3f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Invalid input received"
            r3.<init>(r4)
            throw r3
    }
}
