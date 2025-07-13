package p150ic;

/* renamed from: ic.b */
/* loaded from: classes.dex */
public class C3126b {

    /* renamed from: a */
    public final int f12540a;

    /* renamed from: b */
    public final int f12541b;

    public C3126b(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f12540a = r1
            r0.f12541b = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p150ic.C3126b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            ic.b r4 = (p150ic.C3126b) r4
            int r0 = r3.f12540a
            int r2 = r4.f12540a
            if (r0 != r2) goto L16
            int r0 = r3.f12541b
            int r4 = r4.f12541b
            if (r0 != r4) goto L16
            r4 = 1
            return r4
        L16:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f12540a
            int r1 = r2.f12541b
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.f12540a
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            int r1 = r3.f12541b
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
