package p114gj;

/* renamed from: gj.d */
/* loaded from: classes.dex */
public class C2404d implements java.io.Serializable {

    /* renamed from: Y */
    public transient p081ej.C1863f f10800Y;

    public C2404d(byte[] r5) {
            r4 = this;
            java.lang.String r0 = "malformed data: "
            r1 = 1
            java.util.List r2 = p114gj.C2401a.f10797a     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.ClassCastException -> L45
            ri.s r5 = p317ri.AbstractC5912s.m12271u(r5)     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.ClassCastException -> L45
            if (r5 == 0) goto L27
            boolean r2 = r5 instanceof p081ej.C1863f     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.ClassCastException -> L45
            if (r2 == 0) goto L12
            ej.f r5 = (p081ej.C1863f) r5     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.ClassCastException -> L45
            goto L1c
        L12:
            ej.f r2 = new ej.f     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.ClassCastException -> L45
            ri.t r5 = p317ri.AbstractC5915t.m12274C(r5)     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.ClassCastException -> L45
            r2.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.ClassCastException -> L45
            r5 = r2
        L1c:
            r4.<init>()
            r4.f10800Y = r5
            ej.u r5 = r5.f8079Z
            java.util.Objects.requireNonNull(r5)
            return
        L27:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.ClassCastException -> L45
            java.lang.String r2 = "no content found"
            r5.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.ClassCastException -> L45
            throw r5     // Catch: java.lang.IllegalArgumentException -> L2f java.lang.ClassCastException -> L45
        L2f:
            r5 = move-exception
            ri.g r2 = new ri.g
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r3 = r5.getMessage()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r5, r1)
            throw r2
        L45:
            r5 = move-exception
            ri.g r2 = new ri.g
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r3 = r5.getMessage()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r5, r1)
            throw r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p114gj.C2404d
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            gj.d r2 = (p114gj.C2404d) r2
            ej.f r0 = r1.f10800Y
            ej.f r2 = r2.f10800Y
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            ej.f r0 = r1.f10800Y
            int r0 = r0.hashCode()
            return r0
    }
}
