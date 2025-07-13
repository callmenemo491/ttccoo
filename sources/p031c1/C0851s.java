package p031c1;

/* renamed from: c1.s */
/* loaded from: classes.dex */
public class C0851s {

    /* renamed from: a */
    public java.lang.String f4606a;

    /* renamed from: b */
    public int f4607b;

    /* renamed from: c */
    public int f4608c;

    public C0851s(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f4606a = r1
            r0.f4607b = r2
            r0.f4608c = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p031c1.C0851s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c1.s r5 = (p031c1.C0851s) r5
            int r1 = r4.f4607b
            if (r1 < 0) goto L2e
            int r1 = r5.f4607b
            if (r1 >= 0) goto L15
            goto L2e
        L15:
            java.lang.String r1 = r4.f4606a
            java.lang.String r3 = r5.f4606a
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L2c
            int r1 = r4.f4607b
            int r3 = r5.f4607b
            if (r1 != r3) goto L2c
            int r1 = r4.f4608c
            int r5 = r5.f4608c
            if (r1 != r5) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
        L2e:
            java.lang.String r1 = r4.f4606a
            java.lang.String r3 = r5.f4606a
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L3f
            int r1 = r4.f4608c
            int r5 = r5.f4608c
            if (r1 != r5) goto L3f
            goto L40
        L3f:
            r0 = 0
        L40:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.f4606a
            r2 = 0
            r0[r2] = r1
            int r1 = r3.f4608c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Objects.hash(r0)
            return r0
    }
}
