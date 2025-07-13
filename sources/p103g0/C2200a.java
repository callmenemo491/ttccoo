package p103g0;

/* renamed from: g0.a */
/* loaded from: classes.dex */
public final class C2200a {

    /* renamed from: a */
    public static java.lang.reflect.Method f10083a;

    /* renamed from: b */
    public static boolean f10084b;

    /* renamed from: c */
    public static java.lang.reflect.Method f10085c;

    /* renamed from: d */
    public static boolean f10086d;

    /* renamed from: a */
    public static void m5785a(android.graphics.drawable.Drawable r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r3.clearColorFilter()
            if (r0 < r1) goto La
            goto L44
        La:
            boolean r0 = r3 instanceof android.graphics.drawable.InsetDrawable
            if (r0 == 0) goto L18
            android.graphics.drawable.InsetDrawable r3 = (android.graphics.drawable.InsetDrawable) r3
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
        L14:
            m5785a(r3)
            goto L44
        L18:
            boolean r0 = r3 instanceof p103g0.InterfaceC2202c
            if (r0 == 0) goto L23
            g0.c r3 = (p103g0.InterfaceC2202c) r3
            android.graphics.drawable.Drawable r3 = r3.mo5794b()
            goto L14
        L23:
            boolean r0 = r3 instanceof android.graphics.drawable.DrawableContainer
            if (r0 == 0) goto L44
            android.graphics.drawable.DrawableContainer r3 = (android.graphics.drawable.DrawableContainer) r3
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            android.graphics.drawable.DrawableContainer$DrawableContainerState r3 = (android.graphics.drawable.DrawableContainer.DrawableContainerState) r3
            if (r3 == 0) goto L44
            r0 = 0
            int r1 = r3.getChildCount()
        L36:
            if (r0 >= r1) goto L44
            android.graphics.drawable.Drawable r2 = r3.getChild(r0)
            if (r2 == 0) goto L41
            m5785a(r2)
        L41:
            int r0 = r0 + 1
            goto L36
        L44:
            return
    }

    /* renamed from: b */
    public static int m5786b(android.graphics.drawable.Drawable r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r6 = r6.getLayoutDirection()
            return r6
        Lb:
            boolean r0 = p103g0.C2200a.f10086d
            java.lang.String r1 = "DrawableCompat"
            r2 = 0
            if (r0 != 0) goto L2b
            r0 = 1
            java.lang.Class<android.graphics.drawable.Drawable> r3 = android.graphics.drawable.Drawable.class
            java.lang.String r4 = "getLayoutDirection"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L23
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L23
            p103g0.C2200a.f10085c = r3     // Catch: java.lang.NoSuchMethodException -> L23
            r3.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L23
            goto L29
        L23:
            r3 = move-exception
            java.lang.String r4 = "Failed to retrieve getLayoutDirection() method"
            android.util.Log.i(r1, r4, r3)
        L29:
            p103g0.C2200a.f10086d = r0
        L2b:
            java.lang.reflect.Method r0 = p103g0.C2200a.f10085c
            if (r0 == 0) goto L45
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3c
            java.lang.Object r6 = r0.invoke(r6, r3)     // Catch: java.lang.Exception -> L3c
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Exception -> L3c
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L3c
            return r6
        L3c:
            r6 = move-exception
            java.lang.String r0 = "Failed to invoke getLayoutDirection() via reflection"
            android.util.Log.i(r1, r0, r6)
            r6 = 0
            p103g0.C2200a.f10085c = r6
        L45:
            return r2
    }

    /* renamed from: c */
    public static boolean m5787c(android.graphics.drawable.Drawable r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r7 = r7.setLayoutDirection(r8)
            return r7
        Lb:
            boolean r0 = p103g0.C2200a.f10084b
            java.lang.String r1 = "DrawableCompat"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L2f
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.String r4 = "setLayoutDirection"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L27
            r5[r2] = r6     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L27
            p103g0.C2200a.f10083a = r0     // Catch: java.lang.NoSuchMethodException -> L27
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L27
            goto L2d
        L27:
            r0 = move-exception
            java.lang.String r4 = "Failed to retrieve setLayoutDirection(int) method"
            android.util.Log.i(r1, r4, r0)
        L2d:
            p103g0.C2200a.f10084b = r3
        L2f:
            java.lang.reflect.Method r0 = p103g0.C2200a.f10083a
            if (r0 == 0) goto L48
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L3f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> L3f
            r4[r2] = r8     // Catch: java.lang.Exception -> L3f
            r0.invoke(r7, r4)     // Catch: java.lang.Exception -> L3f
            return r3
        L3f:
            r7 = move-exception
            java.lang.String r8 = "Failed to invoke setLayoutDirection(int) via reflection"
            android.util.Log.i(r1, r8, r7)
            r7 = 0
            p103g0.C2200a.f10083a = r7
        L48:
            return r2
    }

    /* renamed from: d */
    public static void m5788d(android.graphics.drawable.Drawable r0, int r1) {
            r0.setTint(r1)
            return
    }

    /* renamed from: e */
    public static void m5789e(android.graphics.drawable.Drawable r0, android.content.res.ColorStateList r1) {
            r0.setTintList(r1)
            return
    }

    /* renamed from: f */
    public static void m5790f(android.graphics.drawable.Drawable r0, android.graphics.PorterDuff.Mode r1) {
            r0.setTintMode(r1)
            return
    }

    /* renamed from: g */
    public static <T extends android.graphics.drawable.Drawable> T m5791g(android.graphics.drawable.Drawable r1) {
            boolean r0 = r1 instanceof p103g0.InterfaceC2202c
            if (r0 == 0) goto La
            g0.c r1 = (p103g0.InterfaceC2202c) r1
            android.graphics.drawable.Drawable r1 = r1.mo5794b()
        La:
            return r1
    }

    /* renamed from: h */
    public static android.graphics.drawable.Drawable m5792h(android.graphics.drawable.Drawable r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L7
            return r2
        L7:
            boolean r0 = r2 instanceof p103g0.InterfaceC2201b
            if (r0 != 0) goto L11
            g0.e r0 = new g0.e
            r0.<init>(r2)
            return r0
        L11:
            return r2
    }
}
