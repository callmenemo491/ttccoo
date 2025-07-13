package p280q0;

/* renamed from: q0.f */
/* loaded from: classes.dex */
public final class C5539f {

    /* renamed from: a */
    public static java.lang.reflect.Method f21572a;

    /* renamed from: b */
    public static boolean f21573b;

    /* renamed from: c */
    public static java.lang.reflect.Field f21574c;

    /* renamed from: d */
    public static boolean f21575d;

    /* renamed from: q0.f$a */
    public static class a {
        /* renamed from: a */
        public static void m11812a(android.widget.PopupWindow r0, android.view.View r1, int r2, int r3, int r4) {
                r0.showAsDropDown(r1, r2, r3, r4)
                return
        }
    }

    /* renamed from: q0.f$b */
    public static class b {
        /* renamed from: a */
        public static boolean m11813a(android.widget.PopupWindow r0) {
                boolean r0 = r0.getOverlapAnchor()
                return r0
        }

        /* renamed from: b */
        public static int m11814b(android.widget.PopupWindow r0) {
                int r0 = r0.getWindowLayoutType()
                return r0
        }

        /* renamed from: c */
        public static void m11815c(android.widget.PopupWindow r0, boolean r1) {
                r0.setOverlapAnchor(r1)
                return
        }

        /* renamed from: d */
        public static void m11816d(android.widget.PopupWindow r0, int r1) {
                r0.setWindowLayoutType(r1)
                return
        }
    }

    /* renamed from: a */
    public static void m11810a(android.widget.PopupWindow r4, boolean r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            p280q0.C5539f.b.m11815c(r4, r5)
            goto L39
        La:
            boolean r0 = p280q0.C5539f.f21575d
            java.lang.String r1 = "PopupWindowCompatApi21"
            if (r0 != 0) goto L27
            r0 = 1
            java.lang.Class<android.widget.PopupWindow> r2 = android.widget.PopupWindow.class
            java.lang.String r3 = "mOverlapAnchor"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L1f
            p280q0.C5539f.f21574c = r2     // Catch: java.lang.NoSuchFieldException -> L1f
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L1f
            goto L25
        L1f:
            r2 = move-exception
            java.lang.String r3 = "Could not fetch mOverlapAnchor field from PopupWindow"
            android.util.Log.i(r1, r3, r2)
        L25:
            p280q0.C5539f.f21575d = r0
        L27:
            java.lang.reflect.Field r0 = p280q0.C5539f.f21574c
            if (r0 == 0) goto L39
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.IllegalAccessException -> L33
            r0.set(r4, r5)     // Catch: java.lang.IllegalAccessException -> L33
            goto L39
        L33:
            r4 = move-exception
            java.lang.String r5 = "Could not set overlap anchor field in PopupWindow"
            android.util.Log.i(r1, r5, r4)
        L39:
            return
    }

    /* renamed from: b */
    public static void m11811b(android.widget.PopupWindow r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            p280q0.C5539f.b.m11816d(r6, r7)
            goto L34
        La:
            boolean r0 = p280q0.C5539f.f21573b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L25
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r3 = "setWindowLayoutType"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L23
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L23
            r4[r1] = r5     // Catch: java.lang.Exception -> L23
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L23
            p280q0.C5539f.f21572a = r0     // Catch: java.lang.Exception -> L23
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> L23
        L23:
            p280q0.C5539f.f21573b = r2
        L25:
            java.lang.reflect.Method r0 = p280q0.C5539f.f21572a
            if (r0 == 0) goto L34
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L34
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L34
            r2[r1] = r7     // Catch: java.lang.Exception -> L34
            r0.invoke(r6, r2)     // Catch: java.lang.Exception -> L34
        L34:
            return
    }
}
