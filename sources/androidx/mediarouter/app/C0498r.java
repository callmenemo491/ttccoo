package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.r */
/* loaded from: classes.dex */
public final class C0498r {
    /* renamed from: a */
    public static android.content.Context m1549a(android.content.Context r0, int r1, boolean r2) {
            if (r1 != 0) goto Lf
            if (r2 != 0) goto L8
            r1 = 2130968919(0x7f040157, float:1.7546505E38)
            goto Lb
        L8:
            r1 = 2130968620(0x7f04002c, float:1.7545899E38)
        Lb:
            int r1 = m1557i(r0, r1)
        Lf:
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            r2.<init>(r0, r1)
            r0 = 2130969267(0x7f0402b3, float:1.7547211E38)
            int r0 = m1557i(r2, r0)
            if (r0 == 0) goto L27
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = m1555g(r2)
            r0.<init>(r2, r1)
            r2 = r0
        L27:
            return r2
    }

    /* renamed from: b */
    public static int m1550b(android.content.Context r1) {
            r0 = 2130969267(0x7f0402b3, float:1.7547211E38)
            int r0 = m1557i(r1, r0)
            if (r0 != 0) goto Ld
            int r0 = m1555g(r1)
        Ld:
            return r0
    }

    /* renamed from: c */
    public static int m1551c(android.content.Context r4, int r5) {
            r0 = 2130968831(0x7f0400ff, float:1.7546327E38)
            int r4 = m1556h(r4, r5, r0)
            r5 = -1
            double r0 = p084f0.C1938a.m4818c(r5, r4)
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L13
            return r5
        L13:
            r4 = -570425344(0xffffffffde000000, float:-2.305843E18)
            return r4
    }

    /* renamed from: d */
    public static float m1552d(android.content.Context r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r1 = 16842803(0x1010033, float:2.36937E-38)
            r2 = 1
            boolean r3 = r3.resolveAttribute(r1, r0, r2)
            if (r3 == 0) goto L18
            float r3 = r0.getFloat()
            goto L1a
        L18:
            r3 = 1056964608(0x3f000000, float:0.5)
        L1a:
            return r3
    }

    /* renamed from: e */
    public static android.graphics.drawable.Drawable m1553e(android.content.Context r2, int r3) {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r0[r1] = r3
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r0)
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r1)
            android.graphics.drawable.Drawable r0 = p103g0.C2200a.m5792h(r0)
            boolean r1 = m1558j(r2)
            if (r1 == 0) goto L22
            r1 = 2131099866(0x7f0600da, float:1.7812097E38)
            int r2 = p046d0.C1259a.m3706b(r2, r1)
            r0.setTint(r2)
        L22:
            r3.recycle()
            return r0
    }

    /* renamed from: f */
    public static android.graphics.drawable.Drawable m1554f(android.content.Context r1, int r2) {
            java.lang.Object r0 = p046d0.C1259a.f6733a
            android.graphics.drawable.Drawable r2 = p046d0.C1259a.b.m3710b(r1, r2)
            android.graphics.drawable.Drawable r2 = p103g0.C2200a.m5792h(r2)
            boolean r0 = m1558j(r1)
            if (r0 == 0) goto L1a
            r0 = 2131099866(0x7f0600da, float:1.7812097E38)
            int r1 = p046d0.C1259a.m3706b(r1, r0)
            r2.setTint(r1)
        L1a:
            return r2
    }

    /* renamed from: g */
    public static int m1555g(android.content.Context r3) {
            boolean r0 = m1558j(r3)
            r1 = -570425344(0xffffffffde000000, float:-2.305843E18)
            r2 = 0
            int r3 = m1551c(r3, r2)
            if (r0 == 0) goto L17
            if (r3 != r1) goto L13
            r3 = 2132017753(0x7f140259, float:1.9673793E38)
            goto L20
        L13:
            r3 = 2132017754(0x7f14025a, float:1.9673795E38)
            goto L20
        L17:
            if (r3 != r1) goto L1d
            r3 = 2132017755(0x7f14025b, float:1.9673797E38)
            goto L20
        L1d:
            r3 = 2132017752(0x7f140258, float:1.9673791E38)
        L20:
            return r3
    }

    /* renamed from: h */
    public static int m1556h(android.content.Context r3, int r4, int r5) {
            r0 = 1
            if (r4 == 0) goto L16
            int[] r1 = new int[r0]
            r2 = 0
            r1[r2] = r5
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r1)
            int r1 = r4.getColor(r2, r2)
            r4.recycle()
            if (r1 == 0) goto L16
            return r1
        L16:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r1 = r3.getTheme()
            r1.resolveAttribute(r5, r4, r0)
            int r5 = r4.resourceId
            if (r5 == 0) goto L31
            android.content.res.Resources r3 = r3.getResources()
            int r4 = r4.resourceId
            int r3 = r3.getColor(r4)
            return r3
        L31:
            int r3 = r4.data
            return r3
    }

    /* renamed from: i */
    public static int m1557i(android.content.Context r2, int r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r1)
            if (r2 == 0) goto L13
            int r2 = r0.resourceId
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
    }

    /* renamed from: j */
    public static boolean m1558j(android.content.Context r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r1 = 2130969089(0x7f040201, float:1.754685E38)
            r2 = 1
            boolean r3 = r3.resolveAttribute(r1, r0, r2)
            if (r3 == 0) goto L18
            int r3 = r0.data
            if (r3 == 0) goto L18
            goto L19
        L18:
            r2 = 0
        L19:
            return r2
    }

    /* renamed from: k */
    public static void m1559k(android.content.Context r1, android.app.Dialog r2) {
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            boolean r0 = m1558j(r1)
            if (r0 == 0) goto L12
            r0 = 2131099862(0x7f0600d6, float:1.781209E38)
            goto L15
        L12:
            r0 = 2131099861(0x7f0600d5, float:1.7812087E38)
        L15:
            int r1 = p046d0.C1259a.m3706b(r1, r0)
            r2.setBackgroundColor(r1)
            return
    }

    /* renamed from: l */
    public static void m1560l(android.content.Context r1, android.widget.ProgressBar r2) {
            boolean r0 = r2.isIndeterminate()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = m1558j(r1)
            if (r0 == 0) goto L11
            r0 = 2131099858(0x7f0600d2, float:1.7812081E38)
            goto L14
        L11:
            r0 = 2131099857(0x7f0600d1, float:1.781208E38)
        L14:
            int r1 = p046d0.C1259a.m3706b(r1, r0)
            android.graphics.drawable.Drawable r2 = r2.getIndeterminateDrawable()
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            return
    }

    /* renamed from: m */
    public static void m1561m(android.content.Context r2, androidx.mediarouter.app.MediaRouteVolumeSlider r3, android.view.View r4) {
            r0 = 0
            int r2 = m1551c(r2, r0)
            int r0 = android.graphics.Color.alpha(r2)
            r1 = 255(0xff, float:3.57E-43)
            if (r0 == r1) goto L1b
            java.lang.Object r4 = r4.getTag()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r2 = p084f0.C1938a.m4821f(r2, r4)
        L1b:
            r3.m1476a(r2, r2)
            return
    }
}
