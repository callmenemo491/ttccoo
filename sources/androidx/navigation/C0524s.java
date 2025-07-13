package androidx.navigation;

/* renamed from: androidx.navigation.s */
/* loaded from: classes.dex */
public final class C0524s {

    /* renamed from: a */
    public boolean f2994a;

    /* renamed from: b */
    public int f2995b;

    /* renamed from: c */
    public boolean f2996c;

    /* renamed from: d */
    public int f2997d;

    /* renamed from: e */
    public int f2998e;

    /* renamed from: f */
    public int f2999f;

    /* renamed from: g */
    public int f3000g;

    public C0524s(boolean r1, int r2, boolean r3, int r4, int r5, int r6, int r7) {
            r0 = this;
            r0.<init>()
            r0.f2994a = r1
            r0.f2995b = r2
            r0.f2996c = r3
            r0.f2997d = r4
            r0.f2998e = r5
            r0.f2999f = r6
            r0.f3000g = r7
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3f
            java.lang.Class<androidx.navigation.s> r2 = androidx.navigation.C0524s.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3f
        L10:
            androidx.navigation.s r5 = (androidx.navigation.C0524s) r5
            boolean r2 = r4.f2994a
            boolean r3 = r5.f2994a
            if (r2 != r3) goto L3d
            int r2 = r4.f2995b
            int r3 = r5.f2995b
            if (r2 != r3) goto L3d
            boolean r2 = r4.f2996c
            boolean r3 = r5.f2996c
            if (r2 != r3) goto L3d
            int r2 = r4.f2997d
            int r3 = r5.f2997d
            if (r2 != r3) goto L3d
            int r2 = r4.f2998e
            int r3 = r5.f2998e
            if (r2 != r3) goto L3d
            int r2 = r4.f2999f
            int r3 = r5.f2999f
            if (r2 != r3) goto L3d
            int r2 = r4.f3000g
            int r5 = r5.f3000g
            if (r2 != r5) goto L3d
            goto L3e
        L3d:
            r0 = 0
        L3e:
            return r0
        L3f:
            return r1
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.f2994a
            int r0 = r0 * 31
            int r1 = r2.f2995b
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.f2996c
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f2997d
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f2998e
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f2999f
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f3000g
            int r0 = r0 + r1
            return r0
    }
}
