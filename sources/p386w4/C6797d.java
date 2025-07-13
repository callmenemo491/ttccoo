package p386w4;

/* renamed from: w4.d */
/* loaded from: classes.dex */
public final class C6797d implements p216m4.InterfaceC4378w {

    /* renamed from: a */
    public final p386w4.C6795b f26391a;

    /* renamed from: b */
    public final int f26392b;

    /* renamed from: c */
    public final long f26393c;

    /* renamed from: d */
    public final long f26394d;

    /* renamed from: e */
    public final long f26395e;

    public C6797d(p386w4.C6795b r1, int r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.f26391a = r1
            r0.f26392b = r2
            r0.f26393c = r3
            long r5 = r5 - r3
            int r1 = r1.f26386e
            long r1 = (long) r1
            long r5 = r5 / r1
            r0.f26394d = r5
            long r1 = r0.m13825b(r5)
            r0.f26395e = r1
            return
    }

    /* renamed from: b */
    public final long m13825b(long r9) {
            r8 = this;
            int r0 = r8.f26392b
            long r0 = (long) r0
            long r2 = r9 * r0
            w4.b r9 = r8.f26391a
            int r9 = r9.f26384c
            long r6 = (long) r9
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = p371v5.C6552b0.m13301E(r2, r4, r6)
            return r9
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: d */
    public boolean mo9742d() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: g */
    public p216m4.InterfaceC4378w.a mo9743g(long r11) {
            r10 = this;
            w4.b r0 = r10.f26391a
            int r0 = r0.f26384c
            long r0 = (long) r0
            long r0 = r0 * r11
            int r2 = r10.f26392b
            long r2 = (long) r2
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r4
            long r4 = r0 / r2
            long r0 = r10.f26394d
            r2 = 1
            long r8 = r0 - r2
            r6 = 0
            long r0 = p371v5.C6552b0.m13316i(r4, r6, r8)
            long r4 = r10.f26393c
            w4.b r6 = r10.f26391a
            int r6 = r6.f26386e
            long r6 = (long) r6
            long r6 = r6 * r0
            long r6 = r6 + r4
            long r4 = r10.m13825b(r0)
            m4.x r8 = new m4.x
            r8.<init>(r4, r6)
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 >= 0) goto L56
            long r11 = r10.f26394d
            long r11 = r11 - r2
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 != 0) goto L3c
            goto L56
        L3c:
            long r0 = r0 + r2
            long r11 = r10.f26393c
            w4.b r2 = r10.f26391a
            int r2 = r2.f26386e
            long r2 = (long) r2
            long r2 = r2 * r0
            long r2 = r2 + r11
            long r11 = r10.m13825b(r0)
            m4.x r0 = new m4.x
            r0.<init>(r11, r2)
            m4.w$a r11 = new m4.w$a
            r11.<init>(r8, r0)
            return r11
        L56:
            m4.w$a r11 = new m4.w$a
            r11.<init>(r8)
            return r11
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: h */
    public long mo9744h() {
            r2 = this;
            long r0 = r2.f26395e
            return r0
    }
}
