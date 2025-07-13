package p353u6;

/* renamed from: u6.l */
/* loaded from: classes.dex */
public class C6349l {

    /* renamed from: a */
    public static final java.lang.reflect.Method f24799a = null;

    /* renamed from: b */
    public static final java.lang.reflect.Method f24800b = null;

    /* renamed from: c */
    public static final java.lang.reflect.Method f24801c = null;

    /* renamed from: d */
    public static final java.lang.reflect.Method f24802d = null;

    static {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            android.os.Process.myUid()
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L17
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L17
            r6[r4] = r7     // Catch: java.lang.Exception -> L17
            java.lang.reflect.Method r5 = r5.getMethod(r1, r6)     // Catch: java.lang.Exception -> L17
            goto L18
        L17:
            r5 = r2
        L18:
            p353u6.C6349l.f24799a = r5
            r5 = 2
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L2a
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L2a
            r7[r4] = r8     // Catch: java.lang.Exception -> L2a
            r7[r3] = r0     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Method r1 = r6.getMethod(r1, r7)     // Catch: java.lang.Exception -> L2a
            goto L2b
        L2a:
            r1 = r2
        L2b:
            p353u6.C6349l.f24800b = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r6 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L38
            java.lang.reflect.Method r1 = r1.getMethod(r6, r7)     // Catch: java.lang.Exception -> L38
            goto L39
        L38:
            r1 = r2
        L39:
            p353u6.C6349l.f24801c = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r6 = "get"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L48
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L48
            r7[r4] = r8     // Catch: java.lang.Exception -> L48
            r1.getMethod(r6, r7)     // Catch: java.lang.Exception -> L48
        L48:
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r6 = "getName"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L56
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L56
            r7[r4] = r8     // Catch: java.lang.Exception -> L56
            java.lang.reflect.Method r2 = r1.getMethod(r6, r7)     // Catch: java.lang.Exception -> L56
        L56:
            p353u6.C6349l.f24802d = r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L60
            r1 = 1
            goto L61
        L60:
            r1 = 0
        L61:
            java.lang.String r6 = "WorkSourceUtil"
            if (r1 == 0) goto L75
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r7 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L6f
            r1.getMethod(r7, r8)     // Catch: java.lang.Exception -> L6f
            goto L75
        L6f:
            r1 = move-exception
            java.lang.String r7 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r6, r7, r1)
        L75:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r2) goto L7b
            r1 = 1
            goto L7c
        L7b:
            r1 = 0
        L7c:
            if (r1 == 0) goto L98
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L92
            java.lang.String r2 = "addNode"
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L92
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L92
            r5[r4] = r7     // Catch: java.lang.Exception -> L92
            r5[r3] = r0     // Catch: java.lang.Exception -> L92
            r1.getMethod(r2, r5)     // Catch: java.lang.Exception -> L92
            goto L98
        L92:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r6, r1, r0)
        L98:
            return
    }

    /* renamed from: a */
    public static boolean m13002a(@androidx.annotation.RecentlyNonNull android.content.Context r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            w6.b r1 = p388w6.C6816c.m13887a(r3)
            java.lang.String r3 = r3.getPackageName()
            android.content.Context r1 = r1.f26525a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "android.permission.UPDATE_DEVICE_STATS"
            int r3 = r1.checkPermission(r2, r3)
            if (r3 != 0) goto L23
            r3 = 1
            return r3
        L23:
            return r0
    }
}
