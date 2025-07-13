package p216m4;

/* renamed from: m4.e */
/* loaded from: classes.dex */
public class C4360e implements p216m4.InterfaceC4378w {

    /* renamed from: a */
    public final long f17889a;

    /* renamed from: b */
    public final long f17890b;

    /* renamed from: c */
    public final int f17891c;

    /* renamed from: d */
    public final long f17892d;

    /* renamed from: e */
    public final int f17893e;

    /* renamed from: f */
    public final long f17894f;

    /* renamed from: g */
    public final boolean f17895g;

    public C4360e(long r2, long r4, int r6, int r7, boolean r8) {
            r1 = this;
            r1.<init>()
            r1.f17889a = r2
            r1.f17890b = r4
            r0 = -1
            if (r7 != r0) goto Lb
            r7 = 1
        Lb:
            r1.f17891c = r7
            r1.f17893e = r6
            r1.f17895g = r8
            r7 = -1
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L1f
            r1.f17892d = r7
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L27
        L1f:
            long r7 = r2 - r4
            r1.f17892d = r7
            long r2 = m9784c(r2, r4, r6)
        L27:
            r1.f17894f = r2
            return
    }

    /* renamed from: c */
    public static long m9784c(long r0, long r2, int r4) {
            long r0 = r0 - r2
            r2 = 0
            long r0 = java.lang.Math.max(r2, r0)
            r2 = 8
            long r0 = r0 * r2
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            long r2 = (long) r4
            long r0 = r0 / r2
            return r0
    }

    /* renamed from: b */
    public long m9785b(long r4) {
            r3 = this;
            long r0 = r3.f17890b
            int r2 = r3.f17893e
            long r4 = m9784c(r4, r0, r2)
            return r4
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: d */
    public boolean mo9742d() {
            r5 = this;
            long r0 = r5.f17892d
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            boolean r0 = r5.f17895g
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: g */
    public p216m4.InterfaceC4378w.a mo9743g(long r12) {
            r11 = this;
            long r0 = r11.f17892d
            r2 = 0
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L1b
            boolean r6 = r11.f17895g
            if (r6 != 0) goto L1b
            m4.w$a r12 = new m4.w$a
            m4.x r13 = new m4.x
            long r0 = r11.f17890b
            r13.<init>(r2, r0)
            r12.<init>(r13)
            return r12
        L1b:
            int r6 = r11.f17893e
            long r6 = (long) r6
            long r6 = r6 * r12
            r8 = 8000000(0x7a1200, double:3.952525E-317)
            long r6 = r6 / r8
            int r8 = r11.f17891c
            long r8 = (long) r8
            long r6 = r6 / r8
            long r6 = r6 * r8
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 == 0) goto L33
            long r0 = r0 - r8
            long r6 = java.lang.Math.min(r6, r0)
        L33:
            long r0 = java.lang.Math.max(r6, r2)
            long r2 = r11.f17890b
            long r2 = r2 + r0
            long r0 = r11.m9785b(r2)
            m4.x r6 = new m4.x
            r6.<init>(r0, r2)
            long r7 = r11.f17892d
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 == 0) goto L69
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 >= 0) goto L69
            int r12 = r11.f17891c
            long r0 = (long) r12
            long r0 = r0 + r2
            long r4 = r11.f17889a
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 < 0) goto L58
            goto L69
        L58:
            long r12 = (long) r12
            long r2 = r2 + r12
            long r12 = r11.m9785b(r2)
            m4.x r0 = new m4.x
            r0.<init>(r12, r2)
            m4.w$a r12 = new m4.w$a
            r12.<init>(r6, r0)
            return r12
        L69:
            m4.w$a r12 = new m4.w$a
            r12.<init>(r6)
            return r12
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: h */
    public long mo9744h() {
            r2 = this;
            long r0 = r2.f17894f
            return r0
    }
}
