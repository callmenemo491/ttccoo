package p220m8;

/* renamed from: m8.m */
/* loaded from: classes.dex */
public final class C4429m {

    /* renamed from: a */
    public static final int[] f18083a = null;

    /* renamed from: b */
    public static final int[] f18084b = null;

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 2130968831(0x7f0400ff, float:1.7546327E38)
            r3 = 0
            r1[r3] = r2
            p220m8.C4429m.f18083a = r1
            int[] r0 = new int[r0]
            r1 = 2130968834(0x7f040102, float:1.7546333E38)
            r0[r3] = r1
            p220m8.C4429m.f18084b = r0
            return
    }

    /* renamed from: a */
    public static void m9878a(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            int[] r0 = p339t7.C6183a.f24003P
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r0, r3, r4)
            r3 = 1
            r4 = 0
            boolean r4 = r2.getBoolean(r3, r4)
            r2.recycle()
            if (r4 == 0) goto L34
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r4 = r1.getTheme()
            r0 = 2130969090(0x7f040202, float:1.7546852E38)
            boolean r3 = r4.resolveAttribute(r0, r2, r3)
            if (r3 == 0) goto L2d
            int r3 = r2.type
            r4 = 18
            if (r3 != r4) goto L34
            int r2 = r2.data
            if (r2 != 0) goto L34
        L2d:
            int[] r2 = p220m8.C4429m.f18084b
            java.lang.String r3 = "Theme.MaterialComponents"
            m9880c(r1, r2, r3)
        L34:
            int[] r2 = p220m8.C4429m.f18083a
            java.lang.String r3 = "Theme.AppCompat"
            m9880c(r1, r2, r3)
            return
    }

    /* renamed from: b */
    public static void m9879b(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
            int[] r0 = p339t7.C6183a.f24003P
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            r1 = -1
            if (r9 == 0) goto L34
            int r3 = r9.length
            if (r3 != 0) goto L19
            goto L34
        L19:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = 0
        L1f:
            if (r6 >= r5) goto L30
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r1)
            if (r7 != r1) goto L2d
            r4.recycle()
            goto L3b
        L2d:
            int r6 = r6 + 1
            goto L1f
        L30:
            r4.recycle()
            goto L3a
        L34:
            int r4 = r0.getResourceId(r2, r1)
            if (r4 == r1) goto L3b
        L3a:
            r2 = 1
        L3b:
            r0.recycle()
            if (r2 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: c */
    public static void m9880c(android.content.Context r3, int[] r4, java.lang.String r5) {
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4)
            r0 = 0
            r1 = 0
        L6:
            int r2 = r4.length
            if (r1 >= r2) goto L16
            boolean r2 = r3.hasValue(r1)
            if (r2 != 0) goto L13
            r3.recycle()
            goto L1a
        L13:
            int r1 = r1 + 1
            goto L6
        L16:
            r3.recycle()
            r0 = 1
        L1a:
            if (r0 == 0) goto L1d
            return
        L1d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The style on this component requires your app theme to be "
            java.lang.String r0 = " (or a descendant)."
            java.lang.String r4 = android.support.v4.media.C0145d.m257a(r4, r5, r0)
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: d */
    public static android.content.res.TypedArray m9881d(android.content.Context r0, android.util.AttributeSet r1, int[] r2, int r3, int r4, int... r5) {
            m9878a(r0, r1, r3, r4)
            m9879b(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            return r0
    }

    /* renamed from: e */
    public static androidx.appcompat.widget.C0314y0 m9882e(android.content.Context r0, android.util.AttributeSet r1, int[] r2, int r3, int r4, int... r5) {
            m9878a(r0, r1, r3, r4)
            m9879b(r0, r1, r2, r3, r4, r5)
            androidx.appcompat.widget.y0 r5 = new androidx.appcompat.widget.y0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r5.<init>(r0, r1)
            return r5
    }
}
