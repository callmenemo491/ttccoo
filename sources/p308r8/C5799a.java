package p308r8;

/* renamed from: r8.a */
/* loaded from: classes.dex */
public class C5799a {

    /* renamed from: a */
    public static final int[] f22492a = null;

    /* renamed from: b */
    public static final int[] f22493b = null;

    /* renamed from: c */
    public static final int[] f22494c = null;

    /* renamed from: d */
    public static final int[] f22495d = null;

    /* renamed from: e */
    public static final java.lang.String f22496e = null;

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16842919(0x10100a7, float:2.3694026E-38)
            r1[r2] = r3
            p308r8.C5799a.f22492a = r1
            r1 = 2
            int[] r3 = new int[r1]
            r3 = {x002c: FILL_ARRAY_DATA , data: [16842913, 16842919} // fill-array
            p308r8.C5799a.f22493b = r3
            int[] r0 = new int[r0]
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            r0[r2] = r3
            p308r8.C5799a.f22494c = r0
            int[] r0 = new int[r1]
            r0 = {x0034: FILL_ARRAY_DATA , data: [16842910, 16842919} // fill-array
            p308r8.C5799a.f22495d = r0
            java.lang.Class<r8.a> r0 = p308r8.C5799a.class
            java.lang.String r0 = r0.getSimpleName()
            p308r8.C5799a.f22496e = r0
            return
    }

    public C5799a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static android.content.res.ColorStateList m12169a(android.content.res.ColorStateList r4) {
            r0 = 2
            int[][] r1 = new int[r0][]
            int[] r0 = new int[r0]
            r2 = 0
            int[] r3 = p308r8.C5799a.f22494c
            r1[r2] = r3
            int[] r3 = p308r8.C5799a.f22493b
            int r3 = m12170b(r4, r3)
            r0[r2] = r3
            r2 = 1
            int[] r3 = android.util.StateSet.NOTHING
            r1[r2] = r3
            int[] r3 = p308r8.C5799a.f22492a
            int r4 = m12170b(r4, r3)
            r0[r2] = r4
            android.content.res.ColorStateList r4 = new android.content.res.ColorStateList
            r4.<init>(r1, r0)
            return r4
    }

    /* renamed from: b */
    public static int m12170b(android.content.res.ColorStateList r1, int[] r2) {
            if (r1 == 0) goto Lb
            int r0 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r2, r0)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            int r2 = android.graphics.Color.alpha(r1)
            int r2 = r2 * 2
            r0 = 255(0xff, float:3.57E-43)
            int r2 = java.lang.Math.min(r2, r0)
            int r1 = p084f0.C1938a.m4825j(r1, r2)
            return r1
    }

    /* renamed from: c */
    public static android.content.res.ColorStateList m12171c(android.content.res.ColorStateList r3) {
            r0 = 0
            if (r3 == 0) goto L2b
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 22
            if (r1 < r2) goto L2a
            r2 = 27
            if (r1 > r2) goto L2a
            int r1 = r3.getDefaultColor()
            int r1 = android.graphics.Color.alpha(r1)
            if (r1 != 0) goto L2a
            int[] r1 = p308r8.C5799a.f22495d
            int r0 = r3.getColorForState(r1, r0)
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L2a
            java.lang.String r0 = p308r8.C5799a.f22496e
            java.lang.String r1 = "Use a non-transparent color for the default color as it will be used to finish ripple animations."
            android.util.Log.w(r0, r1)
        L2a:
            return r3
        L2b:
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r0)
            return r3
    }

    /* renamed from: d */
    public static boolean m12172d(int[] r8) {
            int r0 = r8.length
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L5:
            r5 = 1
            if (r2 >= r0) goto L27
            r6 = r8[r2]
            r7 = 16842910(0x101009e, float:2.3694E-38)
            if (r6 != r7) goto L11
            r3 = 1
            goto L24
        L11:
            r7 = 16842908(0x101009c, float:2.3693995E-38)
            if (r6 != r7) goto L18
        L16:
            r4 = 1
            goto L24
        L18:
            r7 = 16842919(0x10100a7, float:2.3694026E-38)
            if (r6 != r7) goto L1e
            goto L16
        L1e:
            r7 = 16843623(0x1010367, float:2.3696E-38)
            if (r6 != r7) goto L24
            goto L16
        L24:
            int r2 = r2 + 1
            goto L5
        L27:
            if (r3 == 0) goto L2c
            if (r4 == 0) goto L2c
            r1 = 1
        L2c:
            return r1
    }
}
