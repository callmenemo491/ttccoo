package p216m4;

/* renamed from: m4.u */
/* loaded from: classes.dex */
public final class C4376u implements p216m4.InterfaceC4378w {

    /* renamed from: a */
    public final long[] f17930a;

    /* renamed from: b */
    public final long[] f17931b;

    /* renamed from: c */
    public final long f17932c;

    /* renamed from: d */
    public final boolean f17933d;

    public C4376u(long[] r9, long[] r10, long r11) {
            r8 = this;
            r8.<init>()
            int r0 = r9.length
            int r1 = r10.length
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            p371v5.C6549a.m13288b(r0)
            int r0 = r10.length
            if (r0 <= 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            r8.f17933d = r1
            if (r1 == 0) goto L32
            r4 = r10[r3]
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L32
            int r1 = r0 + 1
            long[] r4 = new long[r1]
            r8.f17930a = r4
            long[] r1 = new long[r1]
            r8.f17931b = r1
            java.lang.System.arraycopy(r9, r3, r4, r2, r0)
            java.lang.System.arraycopy(r10, r3, r1, r2, r0)
            goto L36
        L32:
            r8.f17930a = r9
            r8.f17931b = r10
        L36:
            r8.f17932c = r11
            return
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: d */
    public boolean mo9742d() {
            r1 = this;
            boolean r0 = r1.f17933d
            return r0
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: g */
    public p216m4.InterfaceC4378w.a mo9743g(long r10) {
            r9 = this;
            boolean r0 = r9.f17933d
            if (r0 != 0) goto Lc
            m4.w$a r10 = new m4.w$a
            m4.x r11 = p216m4.C4379x.f17939c
            r10.<init>(r11)
            return r10
        Lc:
            long[] r0 = r9.f17931b
            r1 = 1
            int r0 = p371v5.C6552b0.m13312e(r0, r10, r1, r1)
            m4.x r2 = new m4.x
            long[] r3 = r9.f17931b
            r4 = r3[r0]
            long[] r6 = r9.f17930a
            r7 = r6[r0]
            r2.<init>(r4, r7)
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r7 == 0) goto L39
            int r10 = r3.length
            int r10 = r10 - r1
            if (r0 != r10) goto L29
            goto L39
        L29:
            m4.x r10 = new m4.x
            int r0 = r0 + r1
            r4 = r3[r0]
            r0 = r6[r0]
            r10.<init>(r4, r0)
            m4.w$a r11 = new m4.w$a
            r11.<init>(r2, r10)
            return r11
        L39:
            m4.w$a r10 = new m4.w$a
            r10.<init>(r2)
            return r10
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: h */
    public long mo9744h() {
            r2 = this;
            long r0 = r2.f17932c
            return r0
    }
}
