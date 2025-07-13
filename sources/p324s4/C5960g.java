package p324s4;

/* renamed from: s4.g */
/* loaded from: classes.dex */
public final class C5960g implements p324s4.InterfaceC5958e {

    /* renamed from: a */
    public final long f22912a;

    /* renamed from: b */
    public final int f22913b;

    /* renamed from: c */
    public final long f22914c;

    /* renamed from: d */
    public final long f22915d;

    /* renamed from: e */
    public final long f22916e;

    /* renamed from: f */
    public final long[] f22917f;

    public C5960g(long r1, int r3, long r4, long r6, long[] r8) {
            r0 = this;
            r0.<init>()
            r0.f22912a = r1
            r0.f22913b = r3
            r0.f22914c = r4
            r0.f22917f = r8
            r0.f22915d = r6
            r3 = -1
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 != 0) goto L14
            goto L16
        L14:
            long r3 = r1 + r6
        L16:
            r0.f22916e = r3
            return
    }

    @Override // p324s4.InterfaceC5958e
    /* renamed from: a */
    public long mo12394a() {
            r2 = this;
            long r0 = r2.f22916e
            return r0
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: d */
    public boolean mo9742d() {
            r1 = this;
            long[] r0 = r1.f22917f
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // p324s4.InterfaceC5958e
    /* renamed from: e */
    public long mo12395e(long r14) {
            r13 = this;
            long r0 = r13.f22912a
            long r14 = r14 - r0
            boolean r0 = r13.mo9742d()
            if (r0 == 0) goto L55
            int r0 = r13.f22913b
            long r0 = (long) r0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L11
            goto L55
        L11:
            long[] r0 = r13.f22917f
            p371v5.C6549a.m13292f(r0)
            double r14 = (double) r14
            r1 = 4643211215818981376(0x4070000000000000, double:256.0)
            double r14 = r14 * r1
            long r1 = r13.f22915d
            double r1 = (double) r1
            double r14 = r14 / r1
            long r1 = (long) r14
            r3 = 1
            int r1 = p371v5.C6552b0.m13312e(r0, r1, r3, r3)
            long r2 = r13.f22914c
            long r4 = (long) r1
            long r4 = r4 * r2
            r6 = 100
            long r4 = r4 / r6
            r8 = r0[r1]
            int r10 = r1 + 1
            long r11 = (long) r10
            long r2 = r2 * r11
            long r2 = r2 / r6
            r6 = 99
            if (r1 != r6) goto L3c
            r0 = 256(0x100, double:1.265E-321)
            goto L3f
        L3c:
            r6 = r0[r10]
            r0 = r6
        L3f:
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L46
            r14 = 0
            goto L4b
        L46:
            double r6 = (double) r8
            double r14 = r14 - r6
            long r0 = r0 - r8
            double r0 = (double) r0
            double r14 = r14 / r0
        L4b:
            long r2 = r2 - r4
            double r0 = (double) r2
            double r14 = r14 * r0
            long r14 = java.lang.Math.round(r14)
            long r14 = r14 + r4
            return r14
        L55:
            r14 = 0
            return r14
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: g */
    public p216m4.InterfaceC4378w.a mo9743g(long r13) {
            r12 = this;
            boolean r0 = r12.mo9742d()
            if (r0 != 0) goto L19
            m4.w$a r13 = new m4.w$a
            m4.x r14 = new m4.x
            r0 = 0
            long r2 = r12.f22912a
            int r4 = r12.f22913b
            long r4 = (long) r4
            long r2 = r2 + r4
            r14.<init>(r0, r2)
            r13.<init>(r14)
            return r13
        L19:
            r6 = 0
            long r8 = r12.f22914c
            r4 = r13
            long r13 = p371v5.C6552b0.m13316i(r4, r6, r8)
            double r0 = (double) r13
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            long r4 = r12.f22914c
            double r4 = (double) r4
            double r0 = r0 / r4
            r4 = 0
            r6 = 4643211215818981376(0x4070000000000000, double:256.0)
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 > 0) goto L34
            goto L56
        L34:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L3a
            r4 = r6
            goto L56
        L3a:
            int r2 = (int) r0
            long[] r3 = r12.f22917f
            p371v5.C6549a.m13292f(r3)
            long[] r3 = (long[]) r3
            r4 = r3[r2]
            double r4 = (double) r4
            r8 = 99
            if (r2 != r8) goto L4b
            r8 = r6
            goto L50
        L4b:
            int r8 = r2 + 1
            r8 = r3[r8]
            double r8 = (double) r8
        L50:
            double r2 = (double) r2
            double r0 = r0 - r2
            double r8 = r8 - r4
            double r8 = r8 * r0
            double r4 = r4 + r8
        L56:
            double r4 = r4 / r6
            long r0 = r12.f22915d
            double r0 = (double) r0
            double r4 = r4 * r0
            long r6 = java.lang.Math.round(r4)
            int r0 = r12.f22913b
            long r8 = (long) r0
            long r0 = r12.f22915d
            r2 = 1
            long r10 = r0 - r2
            long r0 = p371v5.C6552b0.m13316i(r6, r8, r10)
            m4.w$a r2 = new m4.w$a
            m4.x r3 = new m4.x
            long r4 = r12.f22912a
            long r4 = r4 + r0
            r3.<init>(r13, r4)
            r2.<init>(r3)
            return r2
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: h */
    public long mo9744h() {
            r2 = this;
            long r0 = r2.f22914c
            return r0
    }
}
