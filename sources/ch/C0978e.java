package ch;

/* renamed from: ch.e */
/* loaded from: classes.dex */
public final class C0978e<A, B> implements java.io.Serializable {

    /* renamed from: Y */
    public final A f5050Y;

    /* renamed from: Z */
    public final B f5051Z;

    public C0978e(A r1, B r2) {
            r0 = this;
            r0.<init>()
            r0.f5050Y = r1
            r0.f5051Z = r2
            return
    }

    /* renamed from: a */
    public final A m2687a() {
            r1 = this;
            A r0 = r1.f5050Y
            return r0
    }

    /* renamed from: b */
    public final B m2688b() {
            r1 = this;
            B r0 = r1.f5051Z
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof ch.C0978e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ch.e r5 = (ch.C0978e) r5
            A r1 = r4.f5050Y
            A r3 = r5.f5050Y
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            B r1 = r4.f5051Z
            B r5 = r5.f5051Z
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public int hashCode() {
            r3 = this;
            A r0 = r3.f5050Y
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            B r2 = r3.f5051Z
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = 40
            java.lang.StringBuilder r0 = p367v1.C6487a.m13176a(r0)
            A r1 = r2.f5050Y
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            B r1 = r2.f5051Z
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
