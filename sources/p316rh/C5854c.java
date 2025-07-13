package p316rh;

/* renamed from: rh.c */
/* loaded from: classes.dex */
public final class C5854c extends p316rh.C5852a {

    /* renamed from: b0 */
    public static final p316rh.C5854c f22654b0 = null;

    /* renamed from: c0 */
    public static final p316rh.C5854c f22655c0 = null;

    static {
            rh.c r0 = new rh.c
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            p316rh.C5854c.f22655c0 = r0
            return
    }

    public C5854c(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    @Override // p316rh.C5852a
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p316rh.C5854c
            if (r0 == 0) goto L23
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            rh.c r0 = (p316rh.C5854c) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
        L13:
            int r0 = r2.f22647Y
            rh.c r3 = (p316rh.C5854c) r3
            int r1 = r3.f22647Y
            if (r0 != r1) goto L23
            int r0 = r2.f22648Z
            int r3 = r3.f22648Z
            if (r0 != r3) goto L23
        L21:
            r3 = 1
            goto L24
        L23:
            r3 = 0
        L24:
            return r3
    }

    @Override // p316rh.C5852a
    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto Lf
        L8:
            int r0 = r2.f22647Y
            int r0 = r0 * 31
            int r1 = r2.f22648Z
            int r0 = r0 + r1
        Lf:
            return r0
    }

    @Override // p316rh.C5852a
    public boolean isEmpty() {
            r2 = this;
            int r0 = r2.f22647Y
            int r1 = r2.f22648Z
            if (r0 <= r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // p316rh.C5852a
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.f22647Y
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r1 = r2.f22648Z
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
