package p145i7;

/* renamed from: i7.n */
/* loaded from: classes.dex */
public final class C3105n extends java.lang.ref.WeakReference<java.lang.Throwable> {

    /* renamed from: a */
    public final int f12495a;

    public C3105n(java.lang.Throwable r1, java.lang.ref.ReferenceQueue<java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            int r1 = java.lang.System.identityHashCode(r1)
            r0.f12495a = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L23
            java.lang.Class r1 = r5.getClass()
            java.lang.Class<i7.n> r2 = p145i7.C3105n.class
            if (r1 == r2) goto Lc
            goto L23
        Lc:
            r1 = 1
            if (r4 != r5) goto L10
            return r1
        L10:
            i7.n r5 = (p145i7.C3105n) r5
            int r2 = r4.f12495a
            int r3 = r5.f12495a
            if (r2 != r3) goto L23
            java.lang.Object r2 = r4.get()
            java.lang.Object r5 = r5.get()
            if (r2 != r5) goto L23
            return r1
        L23:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f12495a
            return r0
    }
}
