package p393wb;

/* renamed from: wb.e */
/* loaded from: classes.dex */
public final class C6828e {

    /* renamed from: e */
    public static final p393wb.C6828e f26568e = null;

    /* renamed from: a */
    public final int f26569a;

    /* renamed from: b */
    public final p393wb.AbstractC6829f f26570b;

    /* renamed from: c */
    public final int f26571c;

    /* renamed from: d */
    public final int f26572d;

    static {
            wb.e r0 = new wb.e
            wb.f r1 = p393wb.AbstractC6829f.f26573b
            r2 = 0
            r0.<init>(r1, r2, r2, r2)
            p393wb.C6828e.f26568e = r0
            return
    }

    public C6828e(p393wb.AbstractC6829f r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f26570b = r1
            r0.f26569a = r2
            r0.f26571c = r3
            r0.f26572d = r4
            return
    }

    /* renamed from: a */
    public p393wb.C6828e m13909a(int r7) {
            r6 = this;
            wb.f r0 = r6.f26570b
            int r1 = r6.f26569a
            int r2 = r6.f26572d
            r3 = 0
            r4 = 4
            if (r1 == r4) goto Ld
            r4 = 2
            if (r1 != r4) goto L1f
        Ld:
            int[][] r4 = p393wb.C6827d.f26564c
            r1 = r4[r1]
            r1 = r1[r3]
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r1
            int r1 = r1 >> 16
            wb.f r0 = r0.m13914a(r4, r1)
            int r2 = r2 + r1
            r1 = 0
        L1f:
            int r3 = r6.f26571c
            if (r3 == 0) goto L32
            r4 = 31
            if (r3 != r4) goto L28
            goto L32
        L28:
            r4 = 62
            if (r3 != r4) goto L2f
            r4 = 9
            goto L34
        L2f:
            r4 = 8
            goto L34
        L32:
            r4 = 18
        L34:
            wb.e r5 = new wb.e
            int r3 = r3 + 1
            int r2 = r2 + r4
            r5.<init>(r0, r1, r3, r2)
            r0 = 2078(0x81e, float:2.912E-42)
            if (r3 != r0) goto L46
            int r7 = r7 + 1
            wb.e r5 = r5.m13910b(r7)
        L46:
            return r5
    }

    /* renamed from: b */
    public p393wb.C6828e m13910b(int r5) {
            r4 = this;
            int r0 = r4.f26571c
            if (r0 != 0) goto L5
            return r4
        L5:
            wb.f r1 = r4.f26570b
            int r5 = r5 - r0
            java.util.Objects.requireNonNull(r1)
            wb.a r2 = new wb.a
            r3 = 0
            r2.<init>(r1, r5, r0, r3)
            wb.e r5 = new wb.e
            int r0 = r4.f26569a
            int r1 = r4.f26572d
            r5.<init>(r2, r0, r3, r1)
            return r5
    }

    /* renamed from: c */
    public boolean m13911c(p393wb.C6828e r4) {
            r3 = this;
            int r0 = r3.f26572d
            int[][] r1 = p393wb.C6827d.f26564c
            int r2 = r3.f26569a
            r1 = r1[r2]
            int r2 = r4.f26569a
            r1 = r1[r2]
            int r1 = r1 >> 16
            int r0 = r0 + r1
            int r1 = r4.f26571c
            if (r1 <= 0) goto L1b
            int r2 = r3.f26571c
            if (r2 == 0) goto L19
            if (r2 <= r1) goto L1b
        L19:
            int r0 = r0 + 10
        L1b:
            int r4 = r4.f26572d
            if (r0 > r4) goto L21
            r4 = 1
            return r4
        L21:
            r4 = 0
            return r4
    }

    /* renamed from: d */
    public p393wb.C6828e m13912d(int r5, int r6) {
            r4 = this;
            int r0 = r4.f26572d
            wb.f r1 = r4.f26570b
            int r2 = r4.f26569a
            if (r5 == r2) goto L19
            int[][] r3 = p393wb.C6827d.f26564c
            r2 = r3[r2]
            r2 = r2[r5]
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            int r2 = r2 >> 16
            wb.f r1 = r1.m13914a(r3, r2)
            int r0 = r0 + r2
        L19:
            r2 = 2
            if (r5 != r2) goto L1e
            r2 = 4
            goto L1f
        L1e:
            r2 = 5
        L1f:
            wb.f r6 = r1.m13914a(r6, r2)
            wb.e r1 = new wb.e
            r3 = 0
            int r0 = r0 + r2
            r1.<init>(r6, r5, r3, r0)
            return r1
    }

    /* renamed from: e */
    public p393wb.C6828e m13913e(int r6, int r7) {
            r5 = this;
            wb.f r0 = r5.f26570b
            int r1 = r5.f26569a
            r2 = 5
            r3 = 2
            if (r1 != r3) goto La
            r3 = 4
            goto Lb
        La:
            r3 = 5
        Lb:
            int[][] r4 = p393wb.C6827d.f26566e
            r1 = r4[r1]
            r6 = r1[r6]
            wb.f r6 = r0.m13914a(r6, r3)
            wb.f r6 = r6.m13914a(r7, r2)
            wb.e r7 = new wb.e
            int r0 = r5.f26569a
            r1 = 0
            int r4 = r5.f26572d
            int r4 = r4 + r3
            int r4 = r4 + r2
            r7.<init>(r6, r0, r1, r4)
            return r7
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String[] r1 = p393wb.C6827d.f26563b
            int r2 = r3.f26569a
            r1 = r1[r2]
            r2 = 0
            r0[r2] = r1
            int r1 = r3.f26572d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.f26571c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "%s bits=%d bytes=%d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
