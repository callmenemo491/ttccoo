package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.t0 */
/* loaded from: classes.dex */
public class C0304t0 {

    /* renamed from: a */
    public static final java.lang.ThreadLocal<android.util.TypedValue> f1433a = null;

    /* renamed from: b */
    public static final int[] f1434b = null;

    /* renamed from: c */
    public static final int[] f1435c = null;

    /* renamed from: d */
    public static final int[] f1436d = null;

    /* renamed from: e */
    public static final int[] f1437e = null;

    /* renamed from: f */
    public static final int[] f1438f = null;

    /* renamed from: g */
    public static final int[] f1439g = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.appcompat.widget.C0304t0.f1433a = r0
            r0 = 1
            int[] r1 = new int[r0]
            r2 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r3 = 0
            r1[r3] = r2
            androidx.appcompat.widget.C0304t0.f1434b = r1
            int[] r1 = new int[r0]
            r2 = 16842908(0x101009c, float:2.3693995E-38)
            r1[r3] = r2
            androidx.appcompat.widget.C0304t0.f1435c = r1
            int[] r1 = new int[r0]
            r2 = 16842919(0x10100a7, float:2.3694026E-38)
            r1[r3] = r2
            androidx.appcompat.widget.C0304t0.f1436d = r1
            int[] r1 = new int[r0]
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r1[r3] = r2
            androidx.appcompat.widget.C0304t0.f1437e = r1
            int[] r1 = new int[r3]
            androidx.appcompat.widget.C0304t0.f1438f = r1
            int[] r0 = new int[r0]
            androidx.appcompat.widget.C0304t0.f1439g = r0
            return
    }

    /* renamed from: a */
    public static void m787a(android.view.View r3, android.content.Context r4) {
            int[] r0 = p064e.C1495i.f7267j
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r0)
            r0 = 117(0x75, float:1.64E-43)
            boolean r0 = r4.hasValue(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L2d
            java.lang.String r0 = "ThemeUtils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "View "
            r1.append(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L31
            r1.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant)."
            r1.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L31
            android.util.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L31
        L2d:
            r4.recycle()
            return
        L31:
            r3 = move-exception
            r4.recycle()
            throw r3
    }

    /* renamed from: b */
    public static int m788b(android.content.Context r4, int r5) {
            android.content.res.ColorStateList r0 = m790d(r4, r5)
            if (r0 == 0) goto L17
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L17
            int[] r4 = androidx.appcompat.widget.C0304t0.f1434b
            int r5 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r5)
            return r4
        L17:
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.appcompat.widget.C0304t0.f1433a
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L29
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L29:
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r2 = 16842803(0x1010033, float:2.36937E-38)
            r3 = 1
            r0.resolveAttribute(r2, r1, r3)
            float r0 = r1.getFloat()
            int r4 = m789c(r4, r5)
            int r5 = android.graphics.Color.alpha(r4)
            float r5 = (float) r5
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            int r4 = p084f0.C1938a.m4825j(r4, r5)
            return r4
    }

    /* renamed from: c */
    public static int m789c(android.content.Context r2, int r3) {
            int[] r0 = androidx.appcompat.widget.C0304t0.f1439g
            r1 = 0
            r0[r1] = r3
            r3 = 0
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = r2.getColor(r1, r1)     // Catch: java.lang.Throwable -> L12
            r2.recycle()
            return r3
        L12:
            r3 = move-exception
            r2.recycle()
            throw r3
    }

    /* renamed from: d */
    public static android.content.res.ColorStateList m790d(android.content.Context r2, int r3) {
            int[] r0 = androidx.appcompat.widget.C0304t0.f1439g
            r1 = 0
            r0[r1] = r3
            r3 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0)
            boolean r0 = r3.hasValue(r1)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            int r0 = r3.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            android.content.res.ColorStateList r2 = p102g.C2199a.m5783a(r2, r0)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            goto L23
        L1d:
            r2 = move-exception
            goto L27
        L1f:
            android.content.res.ColorStateList r2 = r3.getColorStateList(r1)     // Catch: java.lang.Throwable -> L1d
        L23:
            r3.recycle()
            return r2
        L27:
            r3.recycle()
            throw r2
    }
}
