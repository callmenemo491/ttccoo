package p365v;

/* renamed from: v.g */
/* loaded from: classes.dex */
public /* synthetic */ class C6480g {
    /* renamed from: a */
    public static /* synthetic */ boolean m13147a(int r0, int r1) {
            if (r0 == 0) goto L8
            if (r0 != r1) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
        L8:
            r0 = 0
            throw r0
    }

    /* renamed from: b */
    public static /* synthetic */ int m13148b(int r0) {
            if (r0 == 0) goto L5
            int r0 = r0 + (-1)
            return r0
        L5:
            r0 = 0
            throw r0
    }

    /* renamed from: c */
    public static /* synthetic */ void m13149c(int r0) {
            if (r0 == 0) goto L3
            return
        L3:
            r0 = 0
            throw r0
    }

    /* renamed from: com$google$zxing$pdf417$encoder$Compaction$s$valueOf */
    public static int m13150x8e661214(java.lang.String r0) {
            int r0 = m13154g(r0)
            return r0
    }

    /* renamed from: d */
    public static /* synthetic */ int m13151d(int r1) {
            r0 = 1
            if (r1 != r0) goto L4
            return r0
        L4:
            r0 = 2
            if (r1 != r0) goto L8
            return r0
        L8:
            r0 = 3
            if (r1 != r0) goto Lc
            return r0
        Lc:
            r0 = 4
            if (r1 != r0) goto L10
            return r0
        L10:
            r1 = 0
            throw r1
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m13152e(int r3) {
            r0 = 0
            r1 = 1
            if (r3 != r1) goto L5
            return r0
        L5:
            r2 = 2
            if (r3 != r2) goto L9
            return r0
        L9:
            r2 = 3
            if (r3 != r2) goto Ld
            return r0
        Ld:
            r0 = 4
            if (r3 != r0) goto L11
            return r1
        L11:
            r0 = 5
            if (r3 != r0) goto L15
            return r1
        L15:
            r3 = 0
            throw r3
    }

    /* renamed from: f */
    public static /* synthetic */ float m13153f(int r1) {
            r0 = 1
            if (r1 != r0) goto L6
            r1 = 1056964608(0x3f000000, float:0.5)
            return r1
        L6:
            r0 = 2
            if (r1 != r0) goto Lc
            r1 = 1065353216(0x3f800000, float:1.0)
            return r1
        Lc:
            r0 = 3
            if (r1 != r0) goto L12
            r1 = 1069547520(0x3fc00000, float:1.5)
            return r1
        L12:
            r1 = 0
            throw r1
    }

    /* renamed from: g */
    public static /* synthetic */ int m13154g(java.lang.String r2) {
            java.lang.String r0 = "Name is null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "AUTO"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            r2 = 1
            return r2
        Lf:
            java.lang.String r0 = "TEXT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L19
            r2 = 2
            return r2
        L19:
            java.lang.String r0 = "BYTE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L23
            r2 = 3
            return r2
        L23:
            java.lang.String r0 = "NUMERIC"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2d
            r2 = 4
            return r2
        L2d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No enum constant com.google.zxing.pdf417.encoder.Compaction."
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
    }
}
