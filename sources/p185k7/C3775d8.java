package p185k7;

/* renamed from: k7.d8 */
/* loaded from: classes.dex */
public final class C3775d8 {

    /* renamed from: f */
    public static final p185k7.C3775d8 f16560f = null;

    /* renamed from: a */
    public int f16561a;

    /* renamed from: b */
    public int[] f16562b;

    /* renamed from: c */
    public java.lang.Object[] f16563c;

    /* renamed from: d */
    public int f16564d;

    /* renamed from: e */
    public boolean f16565e;

    static {
            k7.d8 r0 = new k7.d8
            r1 = 0
            int[] r2 = new int[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.<init>(r1, r2, r3, r1)
            p185k7.C3775d8.f16560f = r0
            return
    }

    public C3775d8() {
            r4 = this;
            r0 = 8
            int[] r1 = new int[r0]
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r3 = 1
            r4.<init>(r2, r1, r0, r3)
            return
    }

    public C3775d8(int r2, int[] r3, java.lang.Object[] r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f16564d = r0
            r1.f16561a = r2
            r1.f16562b = r3
            r1.f16563c = r4
            r1.f16565e = r5
            return
    }

    /* renamed from: b */
    public static p185k7.C3775d8 m8502b() {
            k7.d8 r0 = new k7.d8
            r1 = 8
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r4 = 1
            r0.<init>(r3, r2, r1, r4)
            return r0
    }

    /* renamed from: a */
    public final int m8503a() {
            r6 = this;
            int r0 = r6.f16564d
            r1 = -1
            if (r0 != r1) goto L9b
            r0 = 0
            r1 = 0
        L7:
            int r2 = r6.f16561a
            if (r0 >= r2) goto L98
            int[] r2 = r6.f16562b
            r2 = r2[r0]
            int r3 = r2 >>> 3
            r2 = r2 & 7
            if (r2 == 0) goto L7d
            r4 = 1
            if (r2 == r4) goto L69
            r4 = 2
            if (r2 == r4) goto L50
            r4 = 3
            if (r2 == r4) goto L40
            r4 = 5
            if (r2 != r4) goto L33
            java.lang.Object[] r2 = r6.f16563c
            r2 = r2[r0]
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.intValue()
            int r2 = r3 << 3
            int r2 = p185k7.AbstractC3896m5.m8824m(r2)
            int r2 = r2 + 4
            goto L7a
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r1 = p185k7.C3897m6.f16748Y
            k7.l6 r1 = new k7.l6
            r1.<init>()
            r0.<init>(r1)
            throw r0
        L40:
            int r2 = p185k7.AbstractC3896m5.m8823J(r3)
            int r2 = r2 + r2
            java.lang.Object[] r3 = r6.f16563c
            r3 = r3[r0]
            k7.d8 r3 = (p185k7.C3775d8) r3
            int r3 = r3.m8503a()
            goto L91
        L50:
            java.lang.Object[] r2 = r6.f16563c
            r2 = r2[r0]
            k7.i5 r2 = (p185k7.AbstractC3842i5) r2
            int r3 = r3 << 3
            int r3 = p185k7.AbstractC3896m5.m8824m(r3)
            int r2 = r2.mo8520h()
            int r4 = p185k7.AbstractC3896m5.m8824m(r2)
            int r4 = r4 + r2
            int r4 = r4 + r3
            int r4 = r4 + r1
            r1 = r4
            goto L94
        L69:
            java.lang.Object[] r2 = r6.f16563c
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            r2.longValue()
            int r2 = r3 << 3
            int r2 = p185k7.AbstractC3896m5.m8824m(r2)
            int r2 = r2 + 8
        L7a:
            int r2 = r2 + r1
            r1 = r2
            goto L94
        L7d:
            java.lang.Object[] r2 = r6.f16563c
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            int r2 = r3 << 3
            int r2 = p185k7.AbstractC3896m5.m8824m(r2)
            int r3 = p185k7.AbstractC3896m5.m8825n(r4)
        L91:
            int r3 = r3 + r2
            int r3 = r3 + r1
            r1 = r3
        L94:
            int r0 = r0 + 1
            goto L7
        L98:
            r6.f16564d = r1
            return r1
        L9b:
            return r0
    }

    /* renamed from: c */
    public final void m8504c(int r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r3.f16565e
            if (r0 == 0) goto L31
            int r0 = r3.f16561a
            int[] r1 = r3.f16562b
            int r2 = r1.length
            if (r0 != r2) goto L22
            r2 = 4
            if (r0 >= r2) goto L11
            r2 = 8
            goto L13
        L11:
            int r2 = r0 >> 1
        L13:
            int r0 = r0 + r2
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.f16562b = r1
            java.lang.Object[] r1 = r3.f16563c
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f16563c = r0
        L22:
            int[] r0 = r3.f16562b
            int r1 = r3.f16561a
            r0[r1] = r4
            java.lang.Object[] r4 = r3.f16563c
            r4[r1] = r5
            int r1 = r1 + 1
            r3.f16561a = r1
            return
        L31:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
    }

    /* renamed from: d */
    public final void m8505d(p185k7.C3909n5 r6) {
            r5 = this;
            int r0 = r5.f16561a
            if (r0 == 0) goto L6f
            r0 = 0
        L5:
            int r1 = r5.f16561a
            if (r0 >= r1) goto L6f
            int[] r1 = r5.f16562b
            r1 = r1[r0]
            java.lang.Object[] r2 = r5.f16563c
            r2 = r2[r0]
            int r3 = r1 >>> 3
            r1 = r1 & 7
            if (r1 == 0) goto L61
            r4 = 1
            if (r1 == r4) goto L55
            r4 = 2
            if (r1 == r4) goto L4d
            r4 = 3
            if (r1 == r4) goto L3c
            r4 = 5
            if (r1 != r4) goto L2f
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            k7.m5 r2 = r6.f16756a
            r2.mo8773r(r3, r1)
            goto L6c
        L2f:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            int r0 = p185k7.C3897m6.f16748Y
            k7.l6 r0 = new k7.l6
            r0.<init>()
            r6.<init>(r0)
            throw r6
        L3c:
            k7.m5 r1 = r6.f16756a
            r1.mo8780z(r3, r4)
            k7.d8 r2 = (p185k7.C3775d8) r2
            r2.m8505d(r6)
            k7.m5 r1 = r6.f16756a
            r2 = 4
            r1.mo8780z(r3, r2)
            goto L6c
        L4d:
            k7.i5 r2 = (p185k7.AbstractC3842i5) r2
            k7.m5 r1 = r6.f16756a
            r1.mo8772q(r3, r2)
            goto L6c
        L55:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            k7.m5 r4 = r6.f16756a
            r4.mo8775u(r3, r1)
            goto L6c
        L61:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            k7.m5 r4 = r6.f16756a
            r4.mo8765C(r3, r1)
        L6c:
            int r0 = r0 + 1
            goto L5
        L6f:
            return
    }

    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 != 0) goto L8
            return r1
        L8:
            boolean r2 = r9 instanceof p185k7.C3775d8
            if (r2 != 0) goto Ld
            return r1
        Ld:
            k7.d8 r9 = (p185k7.C3775d8) r9
            int r2 = r8.f16561a
            int r3 = r9.f16561a
            if (r2 != r3) goto L3d
            int[] r3 = r8.f16562b
            int[] r4 = r9.f16562b
            r5 = 0
        L1a:
            if (r5 >= r2) goto L26
            r6 = r3[r5]
            r7 = r4[r5]
            if (r6 == r7) goto L23
            goto L3d
        L23:
            int r5 = r5 + 1
            goto L1a
        L26:
            java.lang.Object[] r2 = r8.f16563c
            java.lang.Object[] r9 = r9.f16563c
            int r3 = r8.f16561a
            r4 = 0
        L2d:
            if (r4 >= r3) goto L3c
            r5 = r2[r4]
            r6 = r9[r4]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L3d
            int r4 = r4 + 1
            goto L2d
        L3c:
            return r0
        L3d:
            return r1
    }

    public final int hashCode() {
            r8 = this;
            int r0 = r8.f16561a
            int r1 = r0 + 527
            int r1 = r1 * 31
            int[] r2 = r8.f16562b
            r3 = 0
            r4 = 17
            r5 = 0
            r6 = 17
        Le:
            if (r5 >= r0) goto L18
            int r6 = r6 * 31
            r7 = r2[r5]
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto Le
        L18:
            int r1 = r1 + r6
            int r1 = r1 * 31
            java.lang.Object[] r0 = r8.f16563c
            int r2 = r8.f16561a
        L1f:
            if (r3 >= r2) goto L2d
            int r4 = r4 * 31
            r5 = r0[r3]
            int r5 = r5.hashCode()
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L1f
        L2d:
            int r1 = r1 + r4
            return r1
    }
}
