package p142i4;

/* renamed from: i4.i */
/* loaded from: classes.dex */
public final class C3075i {

    /* renamed from: a */
    public final java.lang.String f12365a;

    /* renamed from: b */
    public final p088f4.C2003e0 f12366b;

    /* renamed from: c */
    public final p088f4.C2003e0 f12367c;

    /* renamed from: d */
    public final int f12368d;

    /* renamed from: e */
    public final int f12369e;

    public C3075i(java.lang.String r2, p088f4.C2003e0 r3, p088f4.C2003e0 r4, int r5, int r6) {
            r1 = this;
            r1.<init>()
            if (r5 == 0) goto La
            if (r6 != 0) goto L8
            goto La
        L8:
            r0 = 0
            goto Lb
        La:
            r0 = 1
        Lb:
            p371v5.C6549a.m13288b(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L22
            r1.f12365a = r2
            java.util.Objects.requireNonNull(r3)
            r1.f12366b = r3
            r1.f12367c = r4
            r1.f12368d = r5
            r1.f12369e = r6
            return
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3f
            java.lang.Class<i4.i> r2 = p142i4.C3075i.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3f
        L10:
            i4.i r5 = (p142i4.C3075i) r5
            int r2 = r4.f12368d
            int r3 = r5.f12368d
            if (r2 != r3) goto L3d
            int r2 = r4.f12369e
            int r3 = r5.f12369e
            if (r2 != r3) goto L3d
            java.lang.String r2 = r4.f12365a
            java.lang.String r3 = r5.f12365a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3d
            f4.e0 r2 = r4.f12366b
            f4.e0 r3 = r5.f12366b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3d
            f4.e0 r2 = r4.f12367c
            f4.e0 r5 = r5.f12367c
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L3d
            goto L3e
        L3d:
            r0 = 0
        L3e:
            return r0
        L3f:
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.f12368d
            int r0 = r0 + 527
            int r0 = r0 * 31
            int r1 = r3.f12369e
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.f12365a
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            f4.e0 r1 = r3.f12366b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            f4.e0 r0 = r3.f12367c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
