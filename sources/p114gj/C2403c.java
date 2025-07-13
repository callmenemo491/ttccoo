package p114gj;

/* renamed from: gj.c */
/* loaded from: classes.dex */
public class C2403c implements java.io.Serializable {

    /* renamed from: Y */
    public transient p081ej.C1864g f10799Y;

    public C2403c(byte[] r5) {
            r4 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r5)
            java.lang.String r5 = "malformed data: "
            r1 = 1
            ri.j r2 = new ri.j     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.ClassCastException -> La3
            r2.<init>(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.ClassCastException -> La3
            ri.s r0 = r2.m12237A()     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.ClassCastException -> La3
            if (r0 == 0) goto L85
            boolean r2 = r0 instanceof p081ej.C1864g     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.ClassCastException -> La3
            if (r2 == 0) goto L1a
            ej.g r0 = (p081ej.C1864g) r0     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.ClassCastException -> La3
            goto L24
        L1a:
            ej.g r2 = new ej.g     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.ClassCastException -> La3
            ri.t r0 = p317ri.AbstractC5915t.m12274C(r0)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.ClassCastException -> La3
            r2.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.ClassCastException -> La3
            r0 = r2
        L24:
            r4.<init>()
            r4.f10799Y = r0
            ej.t r5 = r0.f8080Y
            ej.k r5 = r5.f8125e0
            if (r5 != 0) goto L30
            goto L76
        L30:
            ri.n r1 = p081ej.C1867j.f8090b0
            java.util.Hashtable r5 = r5.f8094Y
            java.lang.Object r5 = r5.get(r1)
            ej.j r5 = (p081ej.C1867j) r5
            if (r5 == 0) goto L76
            ri.o r5 = r5.f8093a0     // Catch: java.io.IOException -> L5e
            byte[] r5 = r5.mo12219E()     // Catch: java.io.IOException -> L5e
            ri.s r5 = p317ri.AbstractC5912s.m12271u(r5)     // Catch: java.io.IOException -> L5e
            boolean r1 = r5 instanceof p081ej.C1873p
            if (r1 == 0) goto L4d
            ej.p r5 = (p081ej.C1873p) r5
            goto L5b
        L4d:
            if (r5 == 0) goto L5a
            ej.p r1 = new ej.p
            ri.t r5 = p317ri.AbstractC5915t.m12274C(r5)
            r1.<init>(r5)
            r5 = r1
            goto L5b
        L5a:
            r5 = 0
        L5b:
            boolean r5 = r5.f8110c0
            goto L76
        L5e:
            r5 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "can't convert extension: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L76:
            ej.m r5 = new ej.m
            ej.l r1 = new ej.l
            ej.t r0 = r0.f8080Y
            cj.c r0 = r0.f8121a0
            r1.<init>(r0)
            r5.<init>(r1)
            return
        L85:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.ClassCastException -> La3
            java.lang.String r2 = "no content found"
            r0.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.ClassCastException -> La3
            throw r0     // Catch: java.lang.IllegalArgumentException -> L8d java.lang.ClassCastException -> La3
        L8d:
            r0 = move-exception
            ri.g r2 = new ri.g
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            java.lang.String r3 = r0.getMessage()
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r2.<init>(r5, r0, r1)
            throw r2
        La3:
            r0 = move-exception
            ri.g r2 = new ri.g
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            java.lang.String r3 = r0.getMessage()
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r2.<init>(r5, r0, r1)
            throw r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p114gj.C2403c
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            gj.c r2 = (p114gj.C2403c) r2
            ej.g r0 = r1.f10799Y
            ej.g r2 = r2.f10799Y
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            ej.g r0 = r1.f10799Y
            int r0 = r0.hashCode()
            return r0
    }
}
