package p324s4;

/* renamed from: s4.c */
/* loaded from: classes.dex */
public final class C5956c implements p324s4.InterfaceC5958e {

    /* renamed from: a */
    public final long[] f22884a;

    /* renamed from: b */
    public final long[] f22885b;

    /* renamed from: c */
    public final long f22886c;

    public C5956c(long[] r3, long[] r4, long r5) {
            r2 = this;
            r2.<init>()
            r2.f22884a = r3
            r2.f22885b = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 == 0) goto L11
            goto L1a
        L11:
            int r3 = r4.length
            int r3 = r3 + (-1)
            r3 = r4[r3]
            long r5 = p371v5.C6552b0.m13297A(r3)
        L1a:
            r2.f22886c = r5
            return
    }

    /* renamed from: b */
    public static android.util.Pair<java.lang.Long, java.lang.Long> m12397b(long r10, long[] r12, long[] r13) {
            r0 = 1
            int r1 = p371v5.C6552b0.m13312e(r12, r10, r0, r0)
            r2 = r12[r1]
            r4 = r13[r1]
            int r1 = r1 + r0
            int r0 = r12.length
            if (r1 != r0) goto L1a
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
        L15:
            android.util.Pair r10 = android.util.Pair.create(r10, r11)
            return r10
        L1a:
            r6 = r12[r1]
            r12 = r13[r1]
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L25
            r0 = 0
            goto L2b
        L25:
            double r0 = (double) r10
            double r8 = (double) r2
            double r0 = r0 - r8
            long r6 = r6 - r2
            double r2 = (double) r6
            double r0 = r0 / r2
        L2b:
            long r12 = r12 - r4
            double r12 = (double) r12
            double r0 = r0 * r12
            long r12 = (long) r0
            long r12 = r12 + r4
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            goto L15
    }

    @Override // p324s4.InterfaceC5958e
    /* renamed from: a */
    public long mo12394a() {
            r2 = this;
            r0 = -1
            return r0
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: d */
    public boolean mo9742d() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p324s4.InterfaceC5958e
    /* renamed from: e */
    public long mo12395e(long r3) {
            r2 = this;
            long[] r0 = r2.f22884a
            long[] r1 = r2.f22885b
            android.util.Pair r3 = m12397b(r3, r0, r1)
            java.lang.Object r3 = r3.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r3 = p371v5.C6552b0.m13297A(r3)
            return r3
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: g */
    public p216m4.InterfaceC4378w.a mo9743g(long r7) {
            r6 = this;
            long r4 = r6.f22886c
            r2 = 0
            r0 = r7
            long r7 = p371v5.C6552b0.m13316i(r0, r2, r4)
            long r7 = p371v5.C6552b0.m13307K(r7)
            long[] r0 = r6.f22885b
            long[] r1 = r6.f22884a
            android.util.Pair r7 = m12397b(r7, r0, r1)
            java.lang.Object r8 = r7.first
            java.lang.Long r8 = (java.lang.Long) r8
            long r0 = r8.longValue()
            long r0 = p371v5.C6552b0.m13297A(r0)
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            m4.w$a r2 = new m4.w$a
            m4.x r3 = new m4.x
            r3.<init>(r0, r7)
            r2.<init>(r3)
            return r2
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: h */
    public long mo9744h() {
            r2 = this;
            long r0 = r2.f22886c
            return r0
    }
}
