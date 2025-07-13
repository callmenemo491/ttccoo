package p249o7;

/* renamed from: o7.l6 */
/* loaded from: classes.dex */
public final class C5044l6 {

    /* renamed from: a */
    public p185k7.C3770d3 f19828a;

    /* renamed from: b */
    public java.util.List<java.lang.Long> f19829b;

    /* renamed from: c */
    public java.util.List<p185k7.C3997u2> f19830c;

    /* renamed from: d */
    public long f19831d;

    /* renamed from: e */
    public final /* synthetic */ p249o7.C5052m6 f19832e;

    public /* synthetic */ C5044l6(p249o7.C5052m6 r1) {
            r0 = this;
            r0.f19832e = r1
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final boolean m11312a(long r11, p185k7.C3997u2 r13) {
            r10 = this;
            java.util.List<k7.u2> r0 = r10.f19830c
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f19830c = r0
        Lb:
            java.util.List<java.lang.Long> r0 = r10.f19829b
            if (r0 != 0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f19829b = r0
        L16:
            java.util.List<k7.u2> r0 = r10.f19830c
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto L3f
            java.util.List<k7.u2> r0 = r10.f19830c
            java.lang.Object r0 = r0.get(r1)
            k7.u2 r0 = (p185k7.C3997u2) r0
            long r2 = r0.m9050v()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6 = 60
            long r2 = r2 / r6
            long r2 = r2 / r6
            long r8 = r13.m9050v()
            long r8 = r8 / r4
            long r8 = r8 / r6
            long r8 = r8 / r6
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r1
        L3f:
            long r2 = r10.f19831d
            int r0 = r13.mo8495c()
            long r4 = (long) r0
            long r2 = r2 + r4
            o7.m6 r0 = r10.f19832e
            r0.m11340K()
            o7.u2<java.lang.Integer> r0 = p249o7.C5120v2.f20098i
            r4 = 0
            java.lang.Object r0 = r0.m11421a(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = java.lang.Math.max(r1, r0)
            long r5 = (long) r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L63
            return r1
        L63:
            r10.f19831d = r2
            java.util.List<k7.u2> r0 = r10.f19830c
            r0.add(r13)
            java.util.List<java.lang.Long> r13 = r10.f19829b
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.add(r11)
            java.util.List<k7.u2> r11 = r10.f19830c
            int r11 = r11.size()
            o7.m6 r12 = r10.f19832e
            r12.m11340K()
            o7.u2<java.lang.Integer> r12 = p249o7.C5120v2.f20100j
            java.lang.Object r12 = r12.m11421a(r4)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r13 = 1
            int r12 = java.lang.Math.max(r13, r12)
            if (r11 < r12) goto L92
            return r1
        L92:
            return r13
    }
}
