package p255od;

/* renamed from: od.o0 */
/* loaded from: classes.dex */
public final class C5220o0 {
    private final java.lang.String name;
    private final int precision;

    public C5220o0(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.name = r2
            r1.precision = r3
            return
    }

    public static /* synthetic */ p255od.C5220o0 copy$default(p255od.C5220o0 r0, java.lang.String r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = r0.name
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            int r2 = r0.precision
        Lc:
            od.o0 r0 = r0.copy(r1, r2)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final int component2() {
            r1 = this;
            int r0 = r1.precision
            return r0
    }

    public final p255od.C5220o0 copy(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r2, r0)
            od.o0 r0 = new od.o0
            r0.<init>(r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5220o0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.o0 r5 = (p255od.C5220o0) r5
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.precision
            int r5 = r5.precision
            if (r1 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final int getPrecision() {
            r1 = this;
            int r0 = r1.precision
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.precision
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Symbol(name="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", precision="
            r0.append(r1)
            int r1 = r3.precision
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
