package p453zb;

/* renamed from: zb.a */
/* loaded from: classes.dex */
public final class C7269a implements java.lang.Cloneable {

    /* renamed from: Y */
    public int[] f27900Y;

    /* renamed from: Z */
    public int f27901Z;

    public C7269a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f27901Z = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1.f27900Y = r0
            return
    }

    public C7269a(int r1) {
            r0 = this;
            r0.<init>()
            r0.f27901Z = r1
            int r1 = r1 + 31
            int r1 = r1 / 32
            int[] r1 = new int[r1]
            r0.f27900Y = r1
            return
    }

    public C7269a(int[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f27900Y = r1
            r0.f27901Z = r2
            return
    }

    /* renamed from: a */
    public void m14360a(boolean r5) {
            r4 = this;
            int r0 = r4.f27901Z
            r1 = 1
            int r0 = r0 + r1
            r4.m14363d(r0)
            if (r5 == 0) goto L18
            int[] r5 = r4.f27900Y
            int r0 = r4.f27901Z
            int r2 = r0 / 32
            r3 = r5[r2]
            r0 = r0 & 31
            int r0 = r1 << r0
            r0 = r0 | r3
            r5[r2] = r0
        L18:
            int r5 = r4.f27901Z
            int r5 = r5 + r1
            r4.f27901Z = r5
            return
    }

    /* renamed from: b */
    public void m14361b(p453zb.C7269a r4) {
            r3 = this;
            int r0 = r4.f27901Z
            int r1 = r3.f27901Z
            int r1 = r1 + r0
            r3.m14363d(r1)
            r1 = 0
        L9:
            if (r1 >= r0) goto L15
            boolean r2 = r4.m14364e(r1)
            r3.m14360a(r2)
            int r1 = r1 + 1
            goto L9
        L15:
            return
    }

    /* renamed from: c */
    public void m14362c(int r3, int r4) {
            r2 = this;
            if (r4 < 0) goto L1f
            r0 = 32
            if (r4 > r0) goto L1f
            int r0 = r2.f27901Z
            int r0 = r0 + r4
            r2.m14363d(r0)
        Lc:
            if (r4 <= 0) goto L1e
            int r0 = r4 + (-1)
            int r0 = r3 >> r0
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L17
            goto L18
        L17:
            r1 = 0
        L18:
            r2.m14360a(r1)
            int r4 = r4 + (-1)
            goto Lc
        L1e:
            return
        L1f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Num bits must be between 0 and 32"
            r3.<init>(r4)
            throw r3
    }

    public java.lang.Object clone() {
            r3 = this;
            zb.a r0 = new zb.a
            int[] r1 = r3.f27900Y
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            int r2 = r3.f27901Z
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: d */
    public final void m14363d(int r4) {
            r3 = this;
            int[] r0 = r3.f27900Y
            int r1 = r0.length
            int r1 = r1 << 5
            if (r4 <= r1) goto L14
            int r4 = r4 + 31
            int r4 = r4 / 32
            int[] r4 = new int[r4]
            int r1 = r0.length
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r3.f27900Y = r4
        L14:
            return
    }

    /* renamed from: e */
    public boolean m14364e(int r3) {
            r2 = this;
            int[] r0 = r2.f27900Y
            int r1 = r3 / 32
            r0 = r0[r1]
            r3 = r3 & 31
            r1 = 1
            int r3 = r1 << r3
            r3 = r3 & r0
            if (r3 == 0) goto Lf
            return r1
        Lf:
            r3 = 0
            return r3
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p453zb.C7269a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            zb.a r4 = (p453zb.C7269a) r4
            int r0 = r3.f27901Z
            int r2 = r4.f27901Z
            if (r0 != r2) goto L1a
            int[] r0 = r3.f27900Y
            int[] r4 = r4.f27900Y
            boolean r4 = java.util.Arrays.equals(r0, r4)
            if (r4 == 0) goto L1a
            r4 = 1
            return r4
        L1a:
            return r1
    }

    /* renamed from: f */
    public int m14365f(int r4) {
            r3 = this;
            int r0 = r3.f27901Z
            if (r4 < r0) goto L5
            return r0
        L5:
            int r0 = r4 / 32
            int[] r1 = r3.f27900Y
            r1 = r1[r0]
            r4 = r4 & 31
            r2 = 1
            int r4 = r2 << r4
            int r4 = r4 - r2
            int r4 = ~r4
            r4 = r4 & r1
        L13:
            if (r4 != 0) goto L22
            int r0 = r0 + 1
            int[] r4 = r3.f27900Y
            int r1 = r4.length
            if (r0 != r1) goto L1f
            int r4 = r3.f27901Z
            return r4
        L1f:
            r4 = r4[r0]
            goto L13
        L22:
            int r0 = r0 << 5
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            int r4 = r4 + r0
            int r0 = r3.f27901Z
            if (r4 <= r0) goto L2e
            return r0
        L2e:
            return r4
    }

    /* renamed from: g */
    public int m14366g(int r4) {
            r3 = this;
            int r0 = r3.f27901Z
            if (r4 < r0) goto L5
            return r0
        L5:
            int r0 = r4 / 32
            int[] r1 = r3.f27900Y
            r1 = r1[r0]
            int r1 = ~r1
            r4 = r4 & 31
            r2 = 1
            int r4 = r2 << r4
            int r4 = r4 - r2
            int r4 = ~r4
            r4 = r4 & r1
        L14:
            if (r4 != 0) goto L24
            int r0 = r0 + 1
            int[] r4 = r3.f27900Y
            int r1 = r4.length
            if (r0 != r1) goto L20
            int r4 = r3.f27901Z
            return r4
        L20:
            r4 = r4[r0]
            int r4 = ~r4
            goto L14
        L24:
            int r0 = r0 << 5
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            int r4 = r4 + r0
            int r0 = r3.f27901Z
            if (r4 <= r0) goto L30
            return r0
        L30:
            return r4
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f27901Z
            int r0 = r0 * 31
            int[] r1 = r2.f27900Y
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: j */
    public int m14367j() {
            r1 = this;
            int r0 = r1.f27901Z
            int r0 = r0 + 7
            int r0 = r0 / 8
            return r0
    }

    /* renamed from: k */
    public boolean m14368k(int r9, int r10, boolean r11) {
            r8 = this;
            if (r10 < r9) goto L38
            if (r9 < 0) goto L38
            int r0 = r8.f27901Z
            if (r10 > r0) goto L38
            r0 = 1
            if (r10 != r9) goto Lc
            return r0
        Lc:
            int r10 = r10 + (-1)
            int r1 = r9 / 32
            int r2 = r10 / 32
            r3 = r1
        L13:
            if (r3 > r2) goto L37
            r4 = 0
            r5 = 31
            if (r3 <= r1) goto L1c
            r6 = 0
            goto L1e
        L1c:
            r6 = r9 & 31
        L1e:
            if (r3 >= r2) goto L21
            goto L22
        L21:
            r5 = r5 & r10
        L22:
            r7 = 2
            int r5 = r7 << r5
            int r6 = r0 << r6
            int r5 = r5 - r6
            int[] r6 = r8.f27900Y
            r6 = r6[r3]
            r6 = r6 & r5
            if (r11 == 0) goto L30
            goto L31
        L30:
            r5 = 0
        L31:
            if (r6 == r5) goto L34
            return r4
        L34:
            int r3 = r3 + 1
            goto L13
        L37:
            return r0
        L38:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
    }

    /* renamed from: m */
    public void m14369m() {
            r13 = this;
            int[] r0 = r13.f27900Y
            int r0 = r0.length
            int[] r0 = new int[r0]
            int r1 = r13.f27901Z
            r2 = 1
            int r1 = r1 - r2
            int r1 = r1 / 32
            int r3 = r1 + 1
            r4 = 0
            r5 = 0
        Lf:
            if (r5 >= r3) goto L51
            int[] r6 = r13.f27900Y
            r6 = r6[r5]
            long r6 = (long) r6
            long r8 = r6 >> r2
            r10 = 1431655765(0x55555555, double:7.0733193E-315)
            long r8 = r8 & r10
            long r6 = r6 & r10
            long r6 = r6 << r2
            long r6 = r6 | r8
            r8 = 2
            long r9 = r6 >> r8
            r11 = 858993459(0x33333333, double:4.24399158E-315)
            long r9 = r9 & r11
            long r6 = r6 & r11
            long r6 = r6 << r8
            long r6 = r6 | r9
            r8 = 4
            long r9 = r6 >> r8
            r11 = 252645135(0xf0f0f0f, double:1.24823282E-315)
            long r9 = r9 & r11
            long r6 = r6 & r11
            long r6 = r6 << r8
            long r6 = r6 | r9
            r8 = 8
            long r9 = r6 >> r8
            r11 = 16711935(0xff00ff, double:8.256793E-317)
            long r9 = r9 & r11
            long r6 = r6 & r11
            long r6 = r6 << r8
            long r6 = r6 | r9
            r8 = 16
            long r9 = r6 >> r8
            r11 = 65535(0xffff, double:3.23786E-319)
            long r9 = r9 & r11
            long r6 = r6 & r11
            long r6 = r6 << r8
            long r6 = r6 | r9
            int r8 = r1 - r5
            int r7 = (int) r6
            r0[r8] = r7
            int r5 = r5 + 1
            goto Lf
        L51:
            int r1 = r13.f27901Z
            int r5 = r3 << 5
            if (r1 == r5) goto L71
            int r5 = r5 - r1
            r1 = r0[r4]
            int r1 = r1 >>> r5
            r4 = 1
        L5c:
            if (r4 >= r3) goto L6e
            r6 = r0[r4]
            int r7 = 32 - r5
            int r7 = r6 << r7
            r1 = r1 | r7
            int r7 = r4 + (-1)
            r0[r7] = r1
            int r1 = r6 >>> r5
            int r4 = r4 + 1
            goto L5c
        L6e:
            int r3 = r3 - r2
            r0[r3] = r1
        L71:
            r13.f27900Y = r0
            return
    }

    /* renamed from: o */
    public void m14370o(int r5) {
            r4 = this;
            int[] r0 = r4.f27900Y
            int r1 = r5 / 32
            r2 = r0[r1]
            r5 = r5 & 31
            r3 = 1
            int r5 = r3 << r5
            r5 = r5 | r2
            r0[r1] = r5
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.f27901Z
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r3.f27901Z
            if (r1 >= r2) goto L26
            r2 = r1 & 7
            if (r2 != 0) goto L15
            r2 = 32
            r0.append(r2)
        L15:
            boolean r2 = r3.m14364e(r1)
            if (r2 == 0) goto L1e
            r2 = 88
            goto L20
        L1e:
            r2 = 46
        L20:
            r0.append(r2)
            int r1 = r1 + 1
            goto L8
        L26:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
