package p249o7;

/* renamed from: o7.g */
/* loaded from: classes.dex */
public final class C4997g {

    /* renamed from: c */
    public static final p249o7.C4997g f19693c = null;

    /* renamed from: a */
    public final java.lang.Boolean f19694a;

    /* renamed from: b */
    public final java.lang.Boolean f19695b;

    static {
            o7.g r0 = new o7.g
            r1 = 0
            r0.<init>(r1, r1)
            p249o7.C4997g.f19693c = r0
            return
    }

    public C4997g(java.lang.Boolean r1, java.lang.Boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f19694a = r1
            r0.f19695b = r2
            return
    }

    /* renamed from: a */
    public static p249o7.C4997g m11181a(android.os.Bundle r3) {
            if (r3 != 0) goto L5
            o7.g r3 = p249o7.C4997g.f19693c
            return r3
        L5:
            o7.g r0 = new o7.g
            java.lang.String r1 = "ad_storage"
            java.lang.String r1 = r3.getString(r1)
            java.lang.Boolean r1 = m11186k(r1)
            java.lang.String r2 = "analytics_storage"
            java.lang.String r3 = r3.getString(r2)
            java.lang.Boolean r3 = m11186k(r3)
            r0.<init>(r1, r3)
            return r0
    }

    /* renamed from: b */
    public static p249o7.C4997g m11182b(java.lang.String r7) {
            r0 = 0
            if (r7 == 0) goto L38
            int r1 = r7.length()
            r2 = 49
            r3 = 48
            r4 = 3
            if (r1 < r4) goto L1e
            r1 = 2
            char r1 = r7.charAt(r1)
            if (r1 == r3) goto L1b
            if (r1 == r2) goto L18
            goto L1e
        L18:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L1f
        L1b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L1f
        L1e:
            r1 = r0
        L1f:
            int r5 = r7.length()
            r6 = 4
            if (r5 < r6) goto L35
            char r7 = r7.charAt(r4)
            if (r7 == r3) goto L32
            if (r7 == r2) goto L2f
            goto L35
        L2f:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            goto L34
        L32:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L34:
            r0 = r7
        L35:
            r7 = r0
            r0 = r1
            goto L39
        L38:
            r7 = r0
        L39:
            o7.g r1 = new o7.g
            r1.<init>(r0, r7)
            return r1
    }

    /* renamed from: d */
    public static java.lang.Boolean m11183d(java.lang.Boolean r1, java.lang.Boolean r2) {
            if (r1 != 0) goto L3
            return r2
        L3:
            if (r2 != 0) goto L6
            return r1
        L6:
            boolean r1 = r1.booleanValue()
            r0 = 0
            if (r1 == 0) goto L14
            boolean r1 = r2.booleanValue()
            if (r1 == 0) goto L14
            r0 = 1
        L14:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
    }

    /* renamed from: h */
    public static boolean m11184h(int r0, int r1) {
            if (r0 > r1) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    /* renamed from: j */
    public static final int m11185j(java.lang.Boolean r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 2
            return r0
    }

    /* renamed from: k */
    public static java.lang.Boolean m11186k(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "granted"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Lf
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            return r2
        Lf:
            java.lang.String r1 = "denied"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L1a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        L1a:
            return r0
    }

    /* renamed from: c */
    public final p249o7.C4997g m11187c(p249o7.C4997g r4) {
            r3 = this;
            o7.g r0 = new o7.g
            java.lang.Boolean r1 = r3.f19694a
            java.lang.Boolean r2 = r4.f19694a
            java.lang.Boolean r1 = m11183d(r1, r2)
            java.lang.Boolean r2 = r3.f19695b
            java.lang.Boolean r4 = r4.f19695b
            java.lang.Boolean r4 = m11183d(r2, r4)
            r0.<init>(r1, r4)
            return r0
    }

    /* renamed from: e */
    public final java.lang.String m11188e() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            java.lang.Boolean r1 = r5.f19694a
            r2 = 48
            r3 = 45
            r4 = 49
            if (r1 != 0) goto L14
            r1 = 45
            goto L1f
        L14:
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1d
            r1 = 49
            goto L1f
        L1d:
            r1 = 48
        L1f:
            r0.append(r1)
            java.lang.Boolean r1 = r5.f19695b
            if (r1 != 0) goto L29
            r2 = 45
            goto L31
        L29:
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L31
            r2 = 49
        L31:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p249o7.C4997g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            o7.g r4 = (p249o7.C4997g) r4
            java.lang.Boolean r0 = r3.f19694a
            int r0 = m11185j(r0)
            java.lang.Boolean r2 = r4.f19694a
            int r2 = m11185j(r2)
            if (r0 != r2) goto L26
            java.lang.Boolean r0 = r3.f19695b
            int r0 = m11185j(r0)
            java.lang.Boolean r4 = r4.f19695b
            int r4 = m11185j(r4)
            if (r0 != r4) goto L26
            r4 = 1
            return r4
        L26:
            return r1
    }

    /* renamed from: f */
    public final boolean m11189f() {
            r1 = this;
            java.lang.Boolean r0 = r1.f19694a
            if (r0 == 0) goto Ld
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    /* renamed from: g */
    public final boolean m11190g() {
            r1 = this;
            java.lang.Boolean r0 = r1.f19695b
            if (r0 == 0) goto Ld
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Boolean r0 = r2.f19694a
            int r0 = m11185j(r0)
            int r0 = r0 + 527
            int r0 = r0 * 31
            java.lang.Boolean r1 = r2.f19695b
            int r1 = m11185j(r1)
            int r1 = r1 + r0
            return r1
    }

    /* renamed from: i */
    public final boolean m11191i(p249o7.C4997g r5) {
            r4 = this;
            java.lang.Boolean r0 = r4.f19694a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lc
            java.lang.Boolean r0 = r5.f19694a
            if (r0 != r1) goto L17
        Lc:
            java.lang.Boolean r0 = r4.f19695b
            if (r0 != r1) goto L16
            java.lang.Boolean r5 = r5.f19695b
            if (r5 == r1) goto L15
            goto L17
        L15:
            return r3
        L16:
            r2 = 0
        L17:
            return r2
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConsentSettings: "
            r0.<init>(r1)
            java.lang.String r1 = "adStorage="
            r0.append(r1)
            java.lang.Boolean r1 = r6.f19694a
            java.lang.String r2 = "denied"
            java.lang.String r3 = "granted"
            java.lang.String r4 = "uninitialized"
            r5 = 1
            if (r1 != 0) goto L1b
            r0.append(r4)
            goto L27
        L1b:
            boolean r1 = r1.booleanValue()
            if (r5 == r1) goto L23
            r1 = r2
            goto L24
        L23:
            r1 = r3
        L24:
            r0.append(r1)
        L27:
            java.lang.String r1 = ", analyticsStorage="
            r0.append(r1)
            java.lang.Boolean r1 = r6.f19695b
            if (r1 != 0) goto L34
            r0.append(r4)
            goto L3f
        L34:
            boolean r1 = r1.booleanValue()
            if (r5 == r1) goto L3b
            goto L3c
        L3b:
            r2 = r3
        L3c:
            r0.append(r2)
        L3f:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
