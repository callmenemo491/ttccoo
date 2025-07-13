package p216m4;

/* renamed from: m4.d */
/* loaded from: classes.dex */
public final class C4358d implements p216m4.InterfaceC4378w {

    /* renamed from: a */
    public final int f17874a;

    /* renamed from: b */
    public final int[] f17875b;

    /* renamed from: c */
    public final long[] f17876c;

    /* renamed from: d */
    public final long[] f17877d;

    /* renamed from: e */
    public final long[] f17878e;

    /* renamed from: f */
    public final long f17879f;

    public C4358d(int[] r3, long[] r4, long[] r5, long[] r6) {
            r2 = this;
            r2.<init>()
            r2.f17875b = r3
            r2.f17876c = r4
            r2.f17877d = r5
            r2.f17878e = r6
            int r3 = r3.length
            r2.f17874a = r3
            if (r3 <= 0) goto L1c
            int r4 = r3 + (-1)
            r4 = r5[r4]
            int r3 = r3 + (-1)
            r0 = r6[r3]
            long r4 = r4 + r0
            r2.f17879f = r4
            goto L20
        L1c:
            r3 = 0
            r2.f17879f = r3
        L20:
            return
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
    public p216m4.InterfaceC4378w.a mo9743g(long r10) {
            r9 = this;
            long[] r0 = r9.f17878e
            r1 = 1
            int r0 = p371v5.C6552b0.m13312e(r0, r10, r1, r1)
            m4.x r2 = new m4.x
            long[] r3 = r9.f17878e
            r4 = r3[r0]
            long[] r6 = r9.f17876c
            r7 = r6[r0]
            r2.<init>(r4, r7)
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r7 >= 0) goto L2e
            int r10 = r9.f17874a
            int r10 = r10 - r1
            if (r0 != r10) goto L1e
            goto L2e
        L1e:
            m4.x r10 = new m4.x
            int r0 = r0 + r1
            r4 = r3[r0]
            r0 = r6[r0]
            r10.<init>(r4, r0)
            m4.w$a r11 = new m4.w$a
            r11.<init>(r2, r10)
            return r11
        L2e:
            m4.w$a r10 = new m4.w$a
            r10.<init>(r2)
            return r10
    }

    @Override // p216m4.InterfaceC4378w
    /* renamed from: h */
    public long mo9744h() {
            r2 = this;
            long r0 = r2.f17879f
            return r0
    }

    public java.lang.String toString() {
            r7 = this;
            int r0 = r7.f17874a
            int[] r1 = r7.f17875b
            java.lang.String r1 = java.util.Arrays.toString(r1)
            long[] r2 = r7.f17876c
            java.lang.String r2 = java.util.Arrays.toString(r2)
            long[] r3 = r7.f17878e
            java.lang.String r3 = java.util.Arrays.toString(r3)
            long[] r4 = r7.f17877d
            java.lang.String r4 = java.util.Arrays.toString(r4)
            r5 = 71
            int r5 = p064e.C1489c.m4038a(r1, r5)
            int r5 = p064e.C1489c.m4038a(r2, r5)
            int r5 = p064e.C1489c.m4038a(r3, r5)
            int r5 = p064e.C1489c.m4038a(r4, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "ChunkIndex(length="
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = ", sizes="
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = ", offsets="
            java.lang.String r1 = ", timeUs="
            p179k1.C3661s.m8090a(r6, r0, r2, r1, r3)
            java.lang.String r0 = ", durationsUs="
            java.lang.String r1 = ")"
            java.lang.String r0 = p083f.C1932s.m4774a(r6, r0, r4, r1)
            return r0
    }
}
