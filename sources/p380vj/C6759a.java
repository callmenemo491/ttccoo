package p380vj;

/* renamed from: vj.a */
/* loaded from: classes.dex */
public class C6759a {

    /* renamed from: a */
    public p440yi.C7214b f26061a;

    public C6759a(byte[] r5) {
            r4 = this;
            java.lang.String r0 = "malformed data: "
            r1 = 2
            ri.s r5 = p317ri.AbstractC5912s.m12271u(r5)     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L38
            boolean r2 = r5 instanceof p440yi.C7214b     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L38
            if (r2 == 0) goto Le
            yi.b r5 = (p440yi.C7214b) r5     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L38
            goto L1c
        Le:
            if (r5 == 0) goto L1b
            yi.b r2 = new yi.b     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L38
            ri.t r5 = p317ri.AbstractC5915t.m12274C(r5)     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L38
            r2.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L38
            r5 = r2
            goto L1c
        L1b:
            r5 = 0
        L1c:
            r4.<init>()
            r4.f26061a = r5
            return
        L22:
            r5 = move-exception
            ri.g r2 = new ri.g
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r3 = r5.getMessage()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r5, r1)
            throw r2
        L38:
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
            boolean r0 = r2 instanceof p380vj.C6759a
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            vj.a r2 = (p380vj.C6759a) r2
            yi.b r0 = r1.f26061a
            yi.b r2 = r2.f26061a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            yi.b r0 = r1.f26061a
            int r0 = r0.hashCode()
            return r0
    }
}
