package p106g3;

/* renamed from: g3.i */
/* loaded from: classes.dex */
public class C2237i {

    /* renamed from: a */
    public java.lang.Class<?> f10211a;

    /* renamed from: b */
    public java.lang.Class<?> f10212b;

    /* renamed from: c */
    public java.lang.Class<?> f10213c;

    public C2237i() {
            r0 = this;
            r0.<init>()
            return
    }

    public C2237i(java.lang.Class<?> r1, java.lang.Class<?> r2, java.lang.Class<?> r3) {
            r0 = this;
            r0.<init>()
            r0.f10211a = r1
            r0.f10212b = r2
            r0.f10213c = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L34
            java.lang.Class<g3.i> r2 = p106g3.C2237i.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L34
        L10:
            g3.i r5 = (p106g3.C2237i) r5
            java.lang.Class<?> r2 = r4.f10211a
            java.lang.Class<?> r3 = r5.f10211a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1d
            return r1
        L1d:
            java.lang.Class<?> r2 = r4.f10212b
            java.lang.Class<?> r3 = r5.f10212b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
            return r1
        L28:
            java.lang.Class<?> r2 = r4.f10213c
            java.lang.Class<?> r5 = r5.f10213c
            boolean r5 = p106g3.C2238j.m5842b(r2, r5)
            if (r5 != 0) goto L33
            return r1
        L33:
            return r0
        L34:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class<?> r0 = r2.f10211a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Class<?> r1 = r2.f10212b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Class<?> r0 = r2.f10213c
            if (r0 == 0) goto L1a
            int r0 = r0.hashCode()
            goto L1b
        L1a:
            r0 = 0
        L1b:
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "MultiClassKey{first="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class<?> r1 = r2.f10211a
            r0.append(r1)
            java.lang.String r1 = ", second="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.f10212b
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
