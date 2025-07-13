package p232n5;

/* renamed from: n5.d */
/* loaded from: classes.dex */
public final class C4690d implements p143i5.InterfaceC3082f {

    /* renamed from: Y */
    public final /* synthetic */ int f18713Y;

    /* renamed from: Z */
    public final java.util.List<java.util.List<p143i5.C3077a>> f18714Z;

    /* renamed from: a0 */
    public final java.util.List<java.lang.Long> f18715a0;

    public C4690d(java.util.List r2, java.util.List r3) {
            r1 = this;
            r0 = 0
            r1.f18713Y = r0
            r1.<init>()
            r1.f18714Z = r2
            r1.f18715a0 = r3
            return
    }

    public C4690d(p143i5.C3077a[] r2, long[] r3) {
            r1 = this;
            r0 = 1
            r1.f18713Y = r0
            r1.<init>()
            r1.f18714Z = r2
            r1.f18715a0 = r3
            return
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: e */
    public int mo7537e(long r5) {
            r4 = this;
            int r0 = r4.f18713Y
            r1 = -1
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto L3b
        L7:
            java.util.List<java.lang.Long> r0 = r4.f18715a0
            java.util.List r0 = (java.util.List) r0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            int r6 = p371v5.C6552b0.f25624a
            int r6 = java.util.Collections.binarySearch(r0, r5)
            if (r6 >= 0) goto L19
            int r5 = ~r6
            goto L2f
        L19:
            int r2 = r0.size()
        L1d:
            int r6 = r6 + 1
            if (r6 >= r2) goto L2e
            java.lang.Object r3 = r0.get(r6)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r3.compareTo(r5)
            if (r3 != 0) goto L2e
            goto L1d
        L2e:
            r5 = r6
        L2f:
            java.util.List<java.lang.Long> r6 = r4.f18715a0
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            if (r5 >= r6) goto L3a
            r1 = r5
        L3a:
            return r1
        L3b:
            java.util.List<java.lang.Long> r0 = r4.f18715a0
            long[] r0 = (long[]) r0
            r2 = 0
            int r5 = p371v5.C6552b0.m13309b(r0, r5, r2, r2)
            java.util.List<java.lang.Long> r6 = r4.f18715a0
            long[] r6 = (long[]) r6
            int r6 = r6.length
            if (r5 >= r6) goto L4c
            r1 = r5
        L4c:
            return r1
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: g */
    public long mo7538g(int r4) {
            r3 = this;
            int r0 = r3.f18713Y
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L2d
        L8:
            if (r4 < 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            p371v5.C6549a.m13288b(r0)
            java.util.List<java.lang.Long> r0 = r3.f18715a0
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r4 >= r0) goto L1b
            r1 = 1
        L1b:
            p371v5.C6549a.m13288b(r1)
            java.util.List<java.lang.Long> r0 = r3.f18715a0
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r4 = r0.get(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            return r0
        L2d:
            if (r4 < 0) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            p371v5.C6549a.m13288b(r0)
            java.util.List<java.lang.Long> r0 = r3.f18715a0
            long[] r0 = (long[]) r0
            int r0 = r0.length
            if (r4 >= r0) goto L3d
            r1 = 1
        L3d:
            p371v5.C6549a.m13288b(r1)
            java.util.List<java.lang.Long> r0 = r3.f18715a0
            long[] r0 = (long[]) r0
            r1 = r0[r4]
            return r1
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: h */
    public java.util.List mo7539h(long r5) {
            r4 = this;
            int r0 = r4.f18713Y
            r1 = 1
            r2 = -1
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L40
        L8:
            java.util.List<java.lang.Long> r0 = r4.f18715a0
            java.util.List r0 = (java.util.List) r0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            int r6 = p371v5.C6552b0.f25624a
            int r6 = java.util.Collections.binarySearch(r0, r5)
            if (r6 >= 0) goto L1c
            int r6 = r6 + 2
            int r5 = -r6
            goto L2e
        L1c:
            int r6 = r6 + r2
            if (r6 < 0) goto L2c
            java.lang.Object r3 = r0.get(r6)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r3.compareTo(r5)
            if (r3 != 0) goto L2c
            goto L1c
        L2c:
            int r5 = r6 + 1
        L2e:
            if (r5 != r2) goto L35
            java.util.List r5 = java.util.Collections.emptyList()
            goto L3f
        L35:
            java.util.List<java.util.List<i5.a>> r6 = r4.f18714Z
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r6.get(r5)
            java.util.List r5 = (java.util.List) r5
        L3f:
            return r5
        L40:
            java.util.List<java.lang.Long> r0 = r4.f18715a0
            long[] r0 = (long[]) r0
            r3 = 0
            int r5 = p371v5.C6552b0.m13312e(r0, r5, r1, r3)
            if (r5 == r2) goto L5d
            java.util.List<java.util.List<i5.a>> r6 = r4.f18714Z
            i5.a[] r6 = (p143i5.C3077a[]) r6
            r0 = r6[r5]
            i5.a r1 = p143i5.C3077a.f12384p0
            if (r0 != r1) goto L56
            goto L5d
        L56:
            r5 = r6[r5]
            java.util.List r5 = java.util.Collections.singletonList(r5)
            goto L61
        L5d:
            java.util.List r5 = java.util.Collections.emptyList()
        L61:
            return r5
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: k */
    public int mo7540k() {
            r1 = this;
            int r0 = r1.f18713Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lf
        L6:
            java.util.List<java.lang.Long> r0 = r1.f18715a0
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            return r0
        Lf:
            java.util.List<java.lang.Long> r0 = r1.f18715a0
            long[] r0 = (long[]) r0
            int r0 = r0.length
            return r0
    }
}
