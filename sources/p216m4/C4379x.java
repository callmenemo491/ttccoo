package p216m4;

/* renamed from: m4.x */
/* loaded from: classes.dex */
public final class C4379x {

    /* renamed from: c */
    public static final p216m4.C4379x f17939c = null;

    /* renamed from: a */
    public final long f17940a;

    /* renamed from: b */
    public final long f17941b;

    static {
            m4.x r0 = new m4.x
            r1 = 0
            r0.<init>(r1, r1)
            p216m4.C4379x.f17939c = r0
            return
    }

    public C4379x(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.f17940a = r1
            r0.f17941b = r3
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L25
            java.lang.Class<m4.x> r2 = p216m4.C4379x.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            m4.x r8 = (p216m4.C4379x) r8
            long r2 = r7.f17940a
            long r4 = r8.f17940a
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L23
            long r2 = r7.f17941b
            long r4 = r8.f17941b
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
        L25:
            return r1
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.f17940a
            int r1 = (int) r0
            int r1 = r1 * 31
            long r2 = r4.f17941b
            int r0 = (int) r2
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r6 = this;
            long r0 = r6.f17940a
            long r2 = r6.f17941b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 60
            r4.<init>(r5)
            java.lang.String r5 = "[timeUs="
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ", position="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = "]"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
    }
}
