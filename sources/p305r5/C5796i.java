package p305r5;

/* renamed from: r5.i */
/* loaded from: classes.dex */
public final class C5796i implements p143i5.InterfaceC3082f {

    /* renamed from: Y */
    public final java.util.List<p305r5.C5791d> f22476Y;

    /* renamed from: Z */
    public final long[] f22477Z;

    /* renamed from: a0 */
    public final long[] f22478a0;

    public C5796i(java.util.List<p305r5.C5791d> r7) {
            r6 = this;
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r6.f22476Y = r0
            int r0 = r7.size()
            int r0 = r0 * 2
            long[] r0 = new long[r0]
            r6.f22477Z = r0
            r0 = 0
        L19:
            int r1 = r7.size()
            if (r0 >= r1) goto L36
            java.lang.Object r1 = r7.get(r0)
            r5.d r1 = (p305r5.C5791d) r1
            int r2 = r0 * 2
            long[] r3 = r6.f22477Z
            long r4 = r1.f22445b
            r3[r2] = r4
            int r2 = r2 + 1
            long r4 = r1.f22446c
            r3[r2] = r4
            int r0 = r0 + 1
            goto L19
        L36:
            long[] r7 = r6.f22477Z
            int r0 = r7.length
            long[] r7 = java.util.Arrays.copyOf(r7, r0)
            r6.f22478a0 = r7
            java.util.Arrays.sort(r7)
            return
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: e */
    public int mo7537e(long r3) {
            r2 = this;
            long[] r0 = r2.f22478a0
            r1 = 0
            int r3 = p371v5.C6552b0.m13309b(r0, r3, r1, r1)
            long[] r4 = r2.f22478a0
            int r4 = r4.length
            if (r3 >= r4) goto Ld
            goto Le
        Ld:
            r3 = -1
        Le:
            return r3
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: g */
    public long mo7538g(int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 < 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            p371v5.C6549a.m13288b(r2)
            long[] r2 = r3.f22478a0
            int r2 = r2.length
            if (r4 >= r2) goto L10
            goto L11
        L10:
            r0 = 0
        L11:
            p371v5.C6549a.m13288b(r0)
            long[] r0 = r3.f22478a0
            r1 = r0[r4]
            return r1
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: h */
    public java.util.List<p143i5.C3077a> mo7539h(long r10) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        Lc:
            java.util.List<r5.d> r4 = r9.f22476Y
            int r4 = r4.size()
            if (r3 >= r4) goto L43
            long[] r4 = r9.f22477Z
            int r5 = r3 * 2
            r6 = r4[r5]
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 > 0) goto L40
            int r5 = r5 + 1
            r5 = r4[r5]
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 >= 0) goto L40
            java.util.List<r5.d> r4 = r9.f22476Y
            java.lang.Object r4 = r4.get(r3)
            r5.d r4 = (p305r5.C5791d) r4
            i5.a r5 = r4.f22444a
            float r6 = r5.f12390c0
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r1.add(r4)
            goto L40
        L3d:
            r0.add(r5)
        L40:
            int r3 = r3 + 1
            goto Lc
        L43:
            j5.b r10 = p163j5.C3423b.f14810a0
            java.util.Collections.sort(r1, r10)
        L48:
            int r10 = r1.size()
            if (r2 >= r10) goto L6c
            java.lang.Object r10 = r1.get(r2)
            r5.d r10 = (p305r5.C5791d) r10
            i5.a r10 = r10.f22444a
            i5.a$b r10 = r10.m7534a()
            int r11 = (-1) - r2
            float r11 = (float) r11
            r10.f12407e = r11
            r11 = 1
            r10.f12408f = r11
            i5.a r10 = r10.m7535a()
            r0.add(r10)
            int r2 = r2 + 1
            goto L48
        L6c:
            return r0
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: k */
    public int mo7540k() {
            r1 = this;
            long[] r0 = r1.f22478a0
            int r0 = r0.length
            return r0
    }
}
