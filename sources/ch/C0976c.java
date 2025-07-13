package ch;

/* renamed from: ch.c */
/* loaded from: classes.dex */
public final class C0976c implements java.lang.Comparable<ch.C0976c> {

    /* renamed from: c0 */
    public static final ch.C0976c f5045c0 = null;

    /* renamed from: Y */
    public final int f5046Y;

    /* renamed from: Z */
    public final int f5047Z;

    /* renamed from: a0 */
    public final int f5048a0;

    /* renamed from: b0 */
    public final int f5049b0;

    static {
            ch.c r0 = new ch.c
            r1 = 1
            r2 = 6
            r3 = 21
            r0.<init>(r1, r2, r3)
            ch.C0976c.f5045c0 = r0
            return
    }

    public C0976c(int r5, int r6, int r7) {
            r4 = this;
            r4.<init>()
            r4.f5046Y = r5
            r4.f5047Z = r6
            r4.f5048a0 = r7
            r0 = 256(0x100, float:3.59E-43)
            r1 = 0
            r2 = 1
            if (r5 < 0) goto L13
            if (r5 >= r0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            if (r3 == 0) goto L29
            if (r6 < 0) goto L1c
            if (r6 >= r0) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L29
            if (r7 < 0) goto L25
            if (r7 >= r0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            if (r0 == 0) goto L29
            r1 = 1
        L29:
            if (r1 == 0) goto L34
            int r5 = r5 << 16
            int r6 = r6 << 8
            int r5 = r5 + r6
            int r5 = r5 + r7
            r4.f5049b0 = r5
            return
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Version components are out of range: "
            r0.append(r1)
            r0.append(r5)
            r5 = 46
            r0.append(r5)
            r0.append(r6)
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    @Override // java.lang.Comparable
    public int compareTo(ch.C0976c r2) {
            r1 = this;
            ch.c r2 = (ch.C0976c) r2
            java.lang.String r0 = "other"
            p214m2.C4339q.m9706k(r2, r0)
            int r0 = r1.f5049b0
            int r2 = r2.f5049b0
            int r0 = r0 - r2
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof ch.C0976c
            if (r1 == 0) goto Lb
            ch.c r4 = (ch.C0976c) r4
            goto Lc
        Lb:
            r4 = 0
        Lc:
            r1 = 0
            if (r4 != 0) goto L10
            return r1
        L10:
            int r2 = r3.f5049b0
            int r4 = r4.f5049b0
            if (r2 != r4) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.f5049b0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.f5046Y
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            int r2 = r3.f5047Z
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.f5048a0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
