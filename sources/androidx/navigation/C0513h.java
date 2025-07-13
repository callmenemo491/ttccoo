package androidx.navigation;

/* renamed from: androidx.navigation.h */
/* loaded from: classes.dex */
public final class C0513h {

    /* renamed from: a */
    public final androidx.navigation.AbstractC0525t f2939a;

    /* renamed from: b */
    public final boolean f2940b;

    /* renamed from: c */
    public final boolean f2941c;

    /* renamed from: d */
    public final java.lang.Object f2942d;

    public C0513h(androidx.navigation.AbstractC0525t<?> r2, boolean r3, java.lang.Object r4, boolean r5) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.f3012a
            if (r0 != 0) goto L25
            if (r3 != 0) goto La
            goto L25
        La:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r2.mo1604b()
            r4.append(r2)
            java.lang.String r2 = " does not allow nullable values"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L25:
            if (r3 != 0) goto L48
            if (r5 == 0) goto L48
            if (r4 == 0) goto L2c
            goto L48
        L2c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Argument with type "
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            java.lang.String r2 = r2.mo1604b()
            r4.append(r2)
            java.lang.String r2 = " has null value but is not nullable."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L48:
            r1.f2939a = r2
            r1.f2940b = r3
            r1.f2942d = r4
            r1.f2941c = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3b
            java.lang.Class<androidx.navigation.h> r2 = androidx.navigation.C0513h.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3b
        L10:
            androidx.navigation.h r5 = (androidx.navigation.C0513h) r5
            boolean r2 = r4.f2940b
            boolean r3 = r5.f2940b
            if (r2 == r3) goto L19
            return r1
        L19:
            boolean r2 = r4.f2941c
            boolean r3 = r5.f2941c
            if (r2 == r3) goto L20
            return r1
        L20:
            androidx.navigation.t r2 = r4.f2939a
            androidx.navigation.t r3 = r5.f2939a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            java.lang.Object r2 = r4.f2942d
            java.lang.Object r5 = r5.f2942d
            if (r2 == 0) goto L36
            boolean r0 = r2.equals(r5)
            goto L3a
        L36:
            if (r5 != 0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
        L3b:
            return r1
    }

    public int hashCode() {
            r2 = this;
            androidx.navigation.t r0 = r2.f2939a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.f2940b
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.f2941c
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Object r1 = r2.f2942d
            if (r1 == 0) goto L1b
            int r1 = r1.hashCode()
            goto L1c
        L1b:
            r1 = 0
        L1c:
            int r0 = r0 + r1
            return r0
    }
}
