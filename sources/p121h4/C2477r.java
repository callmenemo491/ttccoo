package p121h4;

/* renamed from: h4.r */
/* loaded from: classes.dex */
public final class C2477r {

    /* renamed from: a */
    public final int f11113a;

    /* renamed from: b */
    public final float f11114b;

    public C2477r(int r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f11113a = r1
            r0.f11114b = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class<h4.r> r2 = p121h4.C2477r.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            h4.r r5 = (p121h4.C2477r) r5
            int r2 = r4.f11113a
            int r3 = r5.f11113a
            if (r2 != r3) goto L23
            float r5 = r5.f11114b
            float r2 = r4.f11114b
            int r5 = java.lang.Float.compare(r5, r2)
            if (r5 != 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
        L25:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f11113a
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            float r0 = r2.f11114b
            int r0 = java.lang.Float.floatToIntBits(r0)
            int r0 = r0 + r1
            return r0
    }
}
