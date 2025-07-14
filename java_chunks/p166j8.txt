package p166j8;

/* renamed from: j8.a */
/* loaded from: classes.dex */
public class C3451a {

    /* renamed from: a */
    public final boolean f14920a;

    /* renamed from: b */
    public final int f14921b;

    /* renamed from: c */
    public final int f14922c;

    /* renamed from: d */
    public final float f14923d;

    public C3451a(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 2130968952(0x7f040178, float:1.7546572E38)
            r1 = 0
            boolean r0 = p288q8.C5598b.m11873b(r3, r0, r1)
            r2.f14920a = r0
            r0 = 2130968951(0x7f040177, float:1.754657E38)
            int r0 = p124h7.C2939x3.m7285k(r3, r0, r1)
            r2.f14921b = r0
            r0 = 2130968838(0x7f040106, float:1.754634E38)
            int r0 = p124h7.C2939x3.m7285k(r3, r0, r1)
            r2.f14922c = r0
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r2.f14923d = r3
            return
    }

    /* renamed from: a */
    public int m7912a(int r5, float r6) {
            r4 = this;
            boolean r0 = r4.f14920a
            if (r0 == 0) goto L48
            r0 = 255(0xff, float:3.57E-43)
            int r1 = p084f0.C1938a.m4825j(r5, r0)
            int r2 = r4.f14922c
            if (r1 != r2) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L48
            float r1 = r4.f14923d
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L36
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 > 0) goto L1f
            goto L36
        L1f:
            float r6 = r6 / r1
            r1 = 1083179008(0x40900000, float:4.5)
            double r2 = (double) r6
            double r2 = java.lang.Math.log1p(r2)
            float r6 = (float) r2
            float r6 = r6 * r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 + r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r6, r1)
        L36:
            int r6 = android.graphics.Color.alpha(r5)
            int r5 = p084f0.C1938a.m4825j(r5, r0)
            int r0 = r4.f14921b
            int r5 = p124h7.C2939x3.m7288n(r5, r0, r2)
            int r5 = p084f0.C1938a.m4825j(r5, r6)
        L48:
            return r5
    }
}
