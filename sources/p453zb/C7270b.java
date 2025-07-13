package p453zb;

/* renamed from: zb.b */
/* loaded from: classes.dex */
public final class C7270b implements java.lang.Cloneable {

    /* renamed from: Y */
    public final int f27902Y;

    /* renamed from: Z */
    public final int f27903Z;

    /* renamed from: a0 */
    public final int f27904a0;

    /* renamed from: b0 */
    public final int[] f27905b0;

    public C7270b(int r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r1 <= 0) goto L18
            if (r2 <= 0) goto L18
            r0.f27902Y = r1
            r0.f27903Z = r2
            int r1 = r1 + 31
            int r1 = r1 / 32
            r0.f27904a0 = r1
            int r1 = r1 * r2
            int[] r1 = new int[r1]
            r0.f27905b0 = r1
            return
        L18:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Both dimensions must be greater than 0"
            r1.<init>(r2)
            throw r1
    }

    public C7270b(int r1, int r2, int r3, int[] r4) {
            r0 = this;
            r0.<init>()
            r0.f27902Y = r1
            r0.f27903Z = r2
            r0.f27904a0 = r3
            r0.f27905b0 = r4
            return
    }

    /* renamed from: a */
    public void m14371a(int r4, int r5) {
            r3 = this;
            int r0 = r3.f27904a0
            int r5 = r5 * r0
            int r0 = r4 / 32
            int r0 = r0 + r5
            int[] r5 = r3.f27905b0
            r1 = r5[r0]
            r4 = r4 & 31
            r2 = 1
            int r4 = r2 << r4
            r4 = r4 ^ r1
            r5[r0] = r4
            return
    }

    /* renamed from: b */
    public boolean m14372b(int r2, int r3) {
            r1 = this;
            int r0 = r1.f27904a0
            int r3 = r3 * r0
            int r0 = r2 / 32
            int r0 = r0 + r3
            int[] r3 = r1.f27905b0
            r3 = r3[r0]
            r2 = r2 & 31
            int r2 = r3 >>> r2
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L14
            return r3
        L14:
            r2 = 0
            return r2
    }

    /* renamed from: c */
    public int[] m14373c() {
            r6 = this;
            int[] r0 = r6.f27905b0
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
        L5:
            if (r0 < 0) goto L10
            int[] r2 = r6.f27905b0
            r2 = r2[r0]
            if (r2 != 0) goto L10
            int r0 = r0 + (-1)
            goto L5
        L10:
            if (r0 >= 0) goto L14
            r0 = 0
            return r0
        L14:
            int r2 = r6.f27904a0
            int r3 = r0 / r2
            int r2 = r0 % r2
            int r2 = r2 << 5
            int[] r4 = r6.f27905b0
            r0 = r4[r0]
            r4 = 31
        L22:
            int r5 = r0 >>> r4
            if (r5 != 0) goto L29
            int r4 = r4 + (-1)
            goto L22
        L29:
            int r2 = r2 + r4
            r0 = 2
            int[] r0 = new int[r0]
            r4 = 0
            r0[r4] = r2
            r0[r1] = r3
            return r0
    }

    public java.lang.Object clone() {
            r5 = this;
            zb.b r0 = new zb.b
            int r1 = r5.f27902Y
            int r2 = r5.f27903Z
            int r3 = r5.f27904a0
            int[] r4 = r5.f27905b0
            java.lang.Object r4 = r4.clone()
            int[] r4 = (int[]) r4
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* renamed from: d */
    public p453zb.C7269a m14374d(int r5, p453zb.C7269a r6) {
            r4 = this;
            int r0 = r6.f27901Z
            int r1 = r4.f27902Y
            r2 = 0
            if (r0 >= r1) goto Ld
            zb.a r6 = new zb.a
            r6.<init>(r1)
            goto L1a
        Ld:
            int[] r0 = r6.f27900Y
            int r0 = r0.length
            r1 = 0
        L11:
            if (r1 >= r0) goto L1a
            int[] r3 = r6.f27900Y
            r3[r1] = r2
            int r1 = r1 + 1
            goto L11
        L1a:
            int r0 = r4.f27904a0
            int r5 = r5 * r0
        L1e:
            int r0 = r4.f27904a0
            if (r2 >= r0) goto L33
            int r0 = r2 << 5
            int[] r1 = r4.f27905b0
            int r3 = r5 + r2
            r1 = r1[r3]
            int[] r3 = r6.f27900Y
            int r0 = r0 / 32
            r3[r0] = r1
            int r2 = r2 + 1
            goto L1e
        L33:
            return r6
    }

    /* renamed from: e */
    public int[] m14375e() {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            int[] r2 = r6.f27905b0
            int r3 = r2.length
            if (r1 >= r3) goto Le
            r3 = r2[r1]
            if (r3 != 0) goto Le
            int r1 = r1 + 1
            goto L2
        Le:
            int r3 = r2.length
            if (r1 != r3) goto L13
            r0 = 0
            return r0
        L13:
            int r3 = r6.f27904a0
            int r4 = r1 / r3
            int r3 = r1 % r3
            int r3 = r3 << 5
            r1 = r2[r1]
            r2 = 0
        L1e:
            int r5 = 31 - r2
            int r5 = r1 << r5
            if (r5 != 0) goto L27
            int r2 = r2 + 1
            goto L1e
        L27:
            int r3 = r3 + r2
            r1 = 2
            int[] r1 = new int[r1]
            r1[r0] = r3
            r0 = 1
            r1[r0] = r4
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p453zb.C7270b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            zb.b r4 = (p453zb.C7270b) r4
            int r0 = r3.f27902Y
            int r2 = r4.f27902Y
            if (r0 != r2) goto L26
            int r0 = r3.f27903Z
            int r2 = r4.f27903Z
            if (r0 != r2) goto L26
            int r0 = r3.f27904a0
            int r2 = r4.f27904a0
            if (r0 != r2) goto L26
            int[] r0 = r3.f27905b0
            int[] r4 = r4.f27905b0
            boolean r4 = java.util.Arrays.equals(r0, r4)
            if (r4 == 0) goto L26
            r4 = 1
            return r4
        L26:
            return r1
    }

    /* renamed from: f */
    public void m14376f(int r4, int r5) {
            r3 = this;
            int r0 = r3.f27904a0
            int r5 = r5 * r0
            int r0 = r4 / 32
            int r0 = r0 + r5
            int[] r5 = r3.f27905b0
            r1 = r5[r0]
            r4 = r4 & 31
            r2 = 1
            int r4 = r2 << r4
            r4 = r4 | r1
            r5[r0] = r4
            return
    }

    /* renamed from: g */
    public void m14377g(int r8, int r9, int r10, int r11) {
            r7 = this;
            if (r9 < 0) goto L41
            if (r8 < 0) goto L41
            if (r11 <= 0) goto L39
            if (r10 <= 0) goto L39
            int r10 = r10 + r8
            int r11 = r11 + r9
            int r0 = r7.f27903Z
            if (r11 > r0) goto L31
            int r0 = r7.f27902Y
            if (r10 > r0) goto L31
        L12:
            if (r9 >= r11) goto L30
            int r0 = r7.f27904a0
            int r0 = r0 * r9
            r1 = r8
        L19:
            if (r1 >= r10) goto L2d
            int[] r2 = r7.f27905b0
            int r3 = r1 / 32
            int r3 = r3 + r0
            r4 = r2[r3]
            r5 = r1 & 31
            r6 = 1
            int r5 = r6 << r5
            r4 = r4 | r5
            r2[r3] = r4
            int r1 = r1 + 1
            goto L19
        L2d:
            int r9 = r9 + 1
            goto L12
        L30:
            return
        L31:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "The region must fit inside the matrix"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Height and width must be at least 1"
            r8.<init>(r9)
            throw r8
        L41:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Left and top must be nonnegative"
            r8.<init>(r9)
            throw r8
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f27902Y
            int r1 = r0 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f27903Z
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f27904a0
            int r1 = r1 + r0
            int r1 = r1 * 31
            int[] r0 = r2.f27905b0
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.f27903Z
            int r2 = r5.f27902Y
            int r2 = r2 + 1
            int r2 = r2 * r1
            r0.<init>(r2)
            r1 = 0
            r2 = 0
        Lf:
            int r3 = r5.f27903Z
            if (r2 >= r3) goto L31
            r3 = 0
        L14:
            int r4 = r5.f27902Y
            if (r3 >= r4) goto L29
            boolean r4 = r5.m14372b(r3, r2)
            if (r4 == 0) goto L21
            java.lang.String r4 = "X "
            goto L23
        L21:
            java.lang.String r4 = "  "
        L23:
            r0.append(r4)
            int r3 = r3 + 1
            goto L14
        L29:
            java.lang.String r3 = "\n"
            r0.append(r3)
            int r2 = r2 + 1
            goto Lf
        L31:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
