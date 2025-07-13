package p088f4;

/* renamed from: f4.k */
/* loaded from: classes.dex */
public final class C2020k implements p088f4.InterfaceC2012h0 {

    /* renamed from: a */
    public final long f9079a;

    /* renamed from: b */
    public final long f9080b;

    /* renamed from: c */
    public final float f9081c;

    /* renamed from: d */
    public long f9082d;

    /* renamed from: e */
    public long f9083e;

    /* renamed from: f */
    public long f9084f;

    /* renamed from: g */
    public long f9085g;

    /* renamed from: h */
    public long f9086h;

    /* renamed from: i */
    public long f9087i;

    /* renamed from: j */
    public float f9088j;

    /* renamed from: k */
    public float f9089k;

    /* renamed from: l */
    public float f9090l;

    /* renamed from: m */
    public long f9091m;

    /* renamed from: n */
    public long f9092n;

    /* renamed from: o */
    public long f9093o;

    /* renamed from: f4.k$a */
    public static /* synthetic */ class a {
    }

    public C2020k(float r1, float r2, long r3, float r5, long r6, long r8, float r10, p088f4.C2020k.a r11) {
            r0 = this;
            r0.<init>()
            r0.f9079a = r6
            r0.f9080b = r8
            r0.f9081c = r10
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f9082d = r3
            r0.f9083e = r3
            r0.f9085g = r3
            r0.f9086h = r3
            r0.f9089k = r1
            r0.f9088j = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f9090l = r1
            r0.f9091m = r3
            r0.f9084f = r3
            r0.f9087i = r3
            r0.f9092n = r3
            r0.f9093o = r3
            return
    }

    /* renamed from: a */
    public final void m5309a() {
            r7 = this;
            long r0 = r7.f9082d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L29
            long r4 = r7.f9083e
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L12
            r0 = r4
        L12:
            long r4 = r7.f9085g
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L1d
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L1d
            r0 = r4
        L1d:
            long r4 = r7.f9086h
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L2a
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2a
            r0 = r4
            goto L2a
        L29:
            r0 = r2
        L2a:
            long r4 = r7.f9084f
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L31
            return
        L31:
            r7.f9084f = r0
            r7.f9087i = r0
            r7.f9092n = r2
            r7.f9093o = r2
            r7.f9091m = r2
            return
    }
}
