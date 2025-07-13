package p371v5;

/* renamed from: v5.b */
/* loaded from: classes.dex */
public final class C6551b {
    public C6551b() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static <T extends p088f4.InterfaceC2014i> p026b9.AbstractC0714n<T> m13294a(p088f4.InterfaceC2014i.a<T> r6, java.util.List<android.os.Bundle> r7) {
            b9.a<java.lang.Object> r0 = p026b9.AbstractC0714n.f3979Z
            r0 = 4
            java.lang.String r1 = "initialCapacity"
            p026b9.C0720t.m2328b(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 0
        Lc:
            int r3 = r7.size()
            if (r1 >= r3) goto L36
            java.lang.Object r3 = r7.get(r1)
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Objects.requireNonNull(r3)
            f4.i r3 = r6.mo2149h(r3)
            java.util.Objects.requireNonNull(r3)
            int r4 = r2 + 1
            int r5 = r0.length
            if (r5 >= r4) goto L30
            int r5 = r0.length
            int r5 = p026b9.AbstractC0710l.b.m2305a(r5, r4)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
        L30:
            r0[r2] = r3
            int r1 = r1 + 1
            r2 = r4
            goto Lc
        L36:
            b9.n r6 = p026b9.AbstractC0714n.m2309q(r0, r2)
            return r6
    }

    /* renamed from: b */
    public static <T extends p088f4.InterfaceC2014i> java.util.List<T> m13295b(p088f4.InterfaceC2014i.a<T> r0, java.util.List<android.os.Bundle> r1, java.util.List<T> r2) {
            if (r1 != 0) goto L3
            goto L7
        L3:
            b9.n r2 = m13294a(r0, r1)
        L7:
            return r2
    }

    /* renamed from: c */
    public static <T extends p088f4.InterfaceC2014i> T m13296c(p088f4.InterfaceC2014i.a<T> r0, android.os.Bundle r1) {
            if (r1 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            f4.i r0 = r0.mo2149h(r1)
        L8:
            return r0
    }
}
