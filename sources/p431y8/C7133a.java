package p431y8;

/* renamed from: y8.a */
/* loaded from: classes.dex */
public class C7133a {

    /* renamed from: a */
    public static final int[] f27555a = null;

    /* renamed from: b */
    public static final int[] f27556b = null;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [16842752, 2130969574} // fill-array
            p431y8.C7133a.f27555a = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 2130969240(0x7f040298, float:1.7547156E38)
            r0[r1] = r2
            p431y8.C7133a.f27556b = r0
            return
    }

    /* renamed from: a */
    public static android.content.Context m14245a(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            int[] r0 = p431y8.C7133a.f27556b
            android.content.res.TypedArray r4 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            r5 = 0
            int r0 = r4.getResourceId(r5, r5)
            r4.recycle()
            boolean r4 = r2 instanceof p177k.C3619c
            r1 = 1
            if (r4 == 0) goto L1c
            r4 = r2
            k.c r4 = (p177k.C3619c) r4
            int r4 = r4.f15937a
            if (r4 != r0) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            if (r0 == 0) goto L46
            if (r4 == 0) goto L22
            goto L46
        L22:
            k.c r4 = new k.c
            r4.<init>(r2, r0)
            int[] r0 = p431y8.C7133a.f27555a
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = r2.getResourceId(r5, r5)
            int r5 = r2.getResourceId(r1, r5)
            r2.recycle()
            if (r3 == 0) goto L3b
            goto L3c
        L3b:
            r3 = r5
        L3c:
            if (r3 == 0) goto L45
            android.content.res.Resources$Theme r2 = r4.getTheme()
            r2.applyStyle(r3, r1)
        L45:
            return r4
        L46:
            return r2
    }
}
