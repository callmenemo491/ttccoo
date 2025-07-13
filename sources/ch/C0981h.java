package ch;

/* renamed from: ch.h */
/* loaded from: classes.dex */
public final class C0981h<A, B, C> implements java.io.Serializable {

    /* renamed from: Y */
    public final A f5057Y;

    /* renamed from: Z */
    public final B f5058Z;

    /* renamed from: a0 */
    public final C f5059a0;

    public C0981h(A r1, B r2, C r3) {
            r0 = this;
            r0.<init>()
            r0.f5057Y = r1
            r0.f5058Z = r2
            r0.f5059a0 = r3
            return
    }

    /* renamed from: a */
    public final A m2693a() {
            r1 = this;
            A r0 = r1.f5057Y
            return r0
    }

    /* renamed from: b */
    public final B m2694b() {
            r1 = this;
            B r0 = r1.f5058Z
            return r0
    }

    /* renamed from: c */
    public final C m2695c() {
            r1 = this;
            C r0 = r1.f5059a0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof ch.C0981h
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ch.h r5 = (ch.C0981h) r5
            A r1 = r4.f5057Y
            A r3 = r5.f5057Y
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            B r1 = r4.f5058Z
            B r3 = r5.f5058Z
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            C r1 = r4.f5059a0
            C r5 = r5.f5059a0
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public int hashCode() {
            r3 = this;
            A r0 = r3.f5057Y
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            B r2 = r3.f5058Z
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            C r2 = r3.f5059a0
            if (r2 != 0) goto L1f
            goto L23
        L1f:
            int r1 = r2.hashCode()
        L23:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 40
            java.lang.StringBuilder r0 = p367v1.C6487a.m13176a(r0)
            A r1 = r3.f5057Y
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            B r2 = r3.f5058Z
            r0.append(r2)
            r0.append(r1)
            C r1 = r3.f5059a0
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
