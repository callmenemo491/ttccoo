package p088f4;

/* renamed from: f4.m0 */
/* loaded from: classes.dex */
public final class C2027m0 {

    /* renamed from: a */
    public final p108g5.InterfaceC2283r.a f9204a;

    /* renamed from: b */
    public final long f9205b;

    /* renamed from: c */
    public final long f9206c;

    /* renamed from: d */
    public final long f9207d;

    /* renamed from: e */
    public final long f9208e;

    /* renamed from: f */
    public final boolean f9209f;

    /* renamed from: g */
    public final boolean f9210g;

    /* renamed from: h */
    public final boolean f9211h;

    /* renamed from: i */
    public final boolean f9212i;

    public C2027m0(p108g5.InterfaceC2283r.a r9, long r10, long r12, long r14, long r16, boolean r18, boolean r19, boolean r20, boolean r21) {
            r8 = this;
            r0 = r8
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r8.<init>()
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L15
            if (r2 == 0) goto L13
            goto L15
        L13:
            r7 = 0
            goto L16
        L15:
            r7 = 1
        L16:
            p371v5.C6549a.m13288b(r7)
            if (r3 == 0) goto L20
            if (r2 == 0) goto L1e
            goto L20
        L1e:
            r7 = 0
            goto L21
        L20:
            r7 = 1
        L21:
            p371v5.C6549a.m13288b(r7)
            if (r1 == 0) goto L2c
            if (r2 != 0) goto L2d
            if (r3 != 0) goto L2d
            if (r4 != 0) goto L2d
        L2c:
            r5 = 1
        L2d:
            p371v5.C6549a.m13288b(r5)
            r5 = r9
            r0.f9204a = r5
            r5 = r10
            r0.f9205b = r5
            r5 = r12
            r0.f9206c = r5
            r5 = r14
            r0.f9207d = r5
            r5 = r16
            r0.f9208e = r5
            r0.f9209f = r1
            r0.f9210g = r2
            r0.f9211h = r3
            r0.f9212i = r4
            return
    }

    /* renamed from: a */
    public p088f4.C2027m0 m5334a(long r18) {
            r17 = this;
            r0 = r17
            long r1 = r0.f9206c
            int r3 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r3 != 0) goto La
            r1 = r0
            goto L24
        La:
            f4.m0 r1 = new f4.m0
            g5.r$a r4 = r0.f9204a
            long r5 = r0.f9205b
            long r9 = r0.f9207d
            long r11 = r0.f9208e
            boolean r13 = r0.f9209f
            boolean r14 = r0.f9210g
            boolean r15 = r0.f9211h
            boolean r2 = r0.f9212i
            r3 = r1
            r7 = r18
            r16 = r2
            r3.<init>(r4, r5, r7, r9, r11, r13, r14, r15, r16)
        L24:
            return r1
    }

    /* renamed from: b */
    public p088f4.C2027m0 m5335b(long r18) {
            r17 = this;
            r0 = r17
            long r1 = r0.f9205b
            int r3 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r3 != 0) goto La
            r1 = r0
            goto L24
        La:
            f4.m0 r1 = new f4.m0
            g5.r$a r4 = r0.f9204a
            long r7 = r0.f9206c
            long r9 = r0.f9207d
            long r11 = r0.f9208e
            boolean r13 = r0.f9209f
            boolean r14 = r0.f9210g
            boolean r15 = r0.f9211h
            boolean r2 = r0.f9212i
            r3 = r1
            r5 = r18
            r16 = r2
            r3.<init>(r4, r5, r7, r9, r11, r13, r14, r15, r16)
        L24:
            return r1
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L57
            java.lang.Class<f4.m0> r2 = p088f4.C2027m0.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L57
        L10:
            f4.m0 r8 = (p088f4.C2027m0) r8
            long r2 = r7.f9205b
            long r4 = r8.f9205b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L55
            long r2 = r7.f9206c
            long r4 = r8.f9206c
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L55
            long r2 = r7.f9207d
            long r4 = r8.f9207d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L55
            long r2 = r7.f9208e
            long r4 = r8.f9208e
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L55
            boolean r2 = r7.f9209f
            boolean r3 = r8.f9209f
            if (r2 != r3) goto L55
            boolean r2 = r7.f9210g
            boolean r3 = r8.f9210g
            if (r2 != r3) goto L55
            boolean r2 = r7.f9211h
            boolean r3 = r8.f9211h
            if (r2 != r3) goto L55
            boolean r2 = r7.f9212i
            boolean r3 = r8.f9212i
            if (r2 != r3) goto L55
            g5.r$a r2 = r7.f9204a
            g5.r$a r8 = r8.f9204a
            boolean r8 = p371v5.C6552b0.m13308a(r2, r8)
            if (r8 == 0) goto L55
            goto L56
        L55:
            r0 = 0
        L56:
            return r0
        L57:
            return r1
    }

    public int hashCode() {
            r3 = this;
            g5.r$a r0 = r3.f9204a
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            long r1 = r3.f9205b
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r3.f9206c
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r3.f9207d
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r3.f9208e
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r1 = r3.f9209f
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r3.f9210g
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r3.f9211h
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r3.f9212i
            int r0 = r0 + r1
            return r0
    }
}
