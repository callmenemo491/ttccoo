package p101fh;

/* renamed from: fh.c */
/* loaded from: classes.dex */
public final class C2171c implements p101fh.InterfaceC2175g, java.io.Serializable {

    /* renamed from: Y */
    public final p101fh.InterfaceC2175g f9912Y;

    /* renamed from: Z */
    public final p101fh.InterfaceC2175g.a f9913Z;

    /* renamed from: fh.c$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<java.lang.String, p101fh.InterfaceC2175g.a, java.lang.String> {

        /* renamed from: Z */
        public static final p101fh.C2171c.a f9914Z = null;

        static {
                fh.c$a r0 = new fh.c$a
                r0.<init>()
                p101fh.C2171c.a.f9914Z = r0
                return
        }

        public a() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.String mo122l(java.lang.String r2, p101fh.InterfaceC2175g.a r3) {
                r1 = this;
                java.lang.String r2 = (java.lang.String) r2
                fh.g$a r3 = (p101fh.InterfaceC2175g.a) r3
                java.lang.String r0 = "acc"
                p214m2.C4339q.m9706k(r2, r0)
                java.lang.String r0 = "element"
                p214m2.C4339q.m9706k(r3, r0)
                int r0 = r2.length()
                if (r0 != 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                if (r0 == 0) goto L1e
                java.lang.String r2 = r3.toString()
                goto L32
            L1e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = ", "
                r0.append(r2)
                r0.append(r3)
                java.lang.String r2 = r0.toString()
            L32:
                return r2
        }
    }

    public C2171c(p101fh.InterfaceC2175g r2, p101fh.InterfaceC2175g.a r3) {
            r1 = this;
            java.lang.String r0 = "left"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "element"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f9912Y = r2
            r1.f9913Z = r3
            return
    }

    /* renamed from: b */
    public final int m5705b() {
            r3 = this;
            r0 = 2
            r1 = r3
        L2:
            fh.g r1 = r1.f9912Y
            boolean r2 = r1 instanceof p101fh.C2171c
            if (r2 == 0) goto Lb
            fh.c r1 = (p101fh.C2171c) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 != 0) goto Lf
            return r0
        Lf:
            int r0 = r0 + 1
            goto L2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r4 == r5) goto L42
            boolean r1 = r5 instanceof p101fh.C2171c
            if (r1 == 0) goto L43
            fh.c r5 = (p101fh.C2171c) r5
            int r1 = r5.m5705b()
            int r2 = r4.m5705b()
            if (r1 != r2) goto L43
            java.util.Objects.requireNonNull(r5)
            r1 = r4
        L17:
            fh.g$a r2 = r1.f9913Z
            fh.g$b r3 = r2.getKey()
            fh.g$a r3 = r5.get(r3)
            boolean r2 = p214m2.C4339q.m9702c(r3, r2)
            if (r2 != 0) goto L29
            r5 = 0
            goto L40
        L29:
            fh.g r1 = r1.f9912Y
            boolean r2 = r1 instanceof p101fh.C2171c
            if (r2 == 0) goto L32
            fh.c r1 = (p101fh.C2171c) r1
            goto L17
        L32:
            fh.g$a r1 = (p101fh.InterfaceC2175g.a) r1
            fh.g$b r2 = r1.getKey()
            fh.g$a r5 = r5.get(r2)
            boolean r5 = p214m2.C4339q.m9702c(r5, r1)
        L40:
            if (r5 == 0) goto L43
        L42:
            r0 = 1
        L43:
            return r0
    }

    @Override // p101fh.InterfaceC2175g
    public <R> R fold(R r2, mh.InterfaceC4624p<? super R, ? super p101fh.InterfaceC2175g.a, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "operation"
            p214m2.C4339q.m9706k(r3, r0)
            fh.g r0 = r1.f9912Y
            java.lang.Object r2 = r0.fold(r2, r3)
            fh.g$a r0 = r1.f9913Z
            java.lang.Object r2 = r3.mo122l(r2, r0)
            return r2
    }

    @Override // p101fh.InterfaceC2175g
    public <E extends p101fh.InterfaceC2175g.a> E get(p101fh.InterfaceC2175g.b<E> r3) {
            r2 = this;
            java.lang.String r0 = "key"
            p214m2.C4339q.m9706k(r3, r0)
            r0 = r2
        L6:
            fh.g$a r1 = r0.f9913Z
            fh.g$a r1 = r1.get(r3)
            if (r1 == 0) goto Lf
            return r1
        Lf:
            fh.g r0 = r0.f9912Y
            boolean r1 = r0 instanceof p101fh.C2171c
            if (r1 == 0) goto L18
            fh.c r0 = (p101fh.C2171c) r0
            goto L6
        L18:
            fh.g$a r3 = r0.get(r3)
            return r3
    }

    public int hashCode() {
            r2 = this;
            fh.g r0 = r2.f9912Y
            int r0 = r0.hashCode()
            fh.g$a r1 = r2.f9913Z
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // p101fh.InterfaceC2175g
    public p101fh.InterfaceC2175g minusKey(p101fh.InterfaceC2175g.b<?> r3) {
            r2 = this;
            java.lang.String r0 = "key"
            p214m2.C4339q.m9706k(r3, r0)
            fh.g$a r0 = r2.f9913Z
            fh.g$a r0 = r0.get(r3)
            if (r0 == 0) goto L10
            fh.g r3 = r2.f9912Y
            return r3
        L10:
            fh.g r0 = r2.f9912Y
            fh.g r3 = r0.minusKey(r3)
            fh.g r0 = r2.f9912Y
            if (r3 != r0) goto L1c
            r3 = r2
            goto L2b
        L1c:
            fh.i r0 = p101fh.C2177i.f9918Y
            if (r3 != r0) goto L23
            fh.g$a r3 = r2.f9913Z
            goto L2b
        L23:
            fh.c r0 = new fh.c
            fh.g$a r1 = r2.f9913Z
            r0.<init>(r3, r1)
            r3 = r0
        L2b:
            return r3
    }

    @Override // p101fh.InterfaceC2175g
    public p101fh.InterfaceC2175g plus(p101fh.InterfaceC2175g r2) {
            r1 = this;
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r2, r0)
            fh.i r0 = p101fh.C2177i.f9918Y
            if (r2 != r0) goto Lb
            r2 = r1
            goto L13
        Lb:
            fh.h r0 = p101fh.C2176h.f9917Z
            java.lang.Object r2 = r2.fold(r1, r0)
            fh.g r2 = (p101fh.InterfaceC2175g) r2
        L13:
            return r2
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 91
            java.lang.StringBuilder r0 = p367v1.C6487a.m13176a(r0)
            fh.c$a r1 = p101fh.C2171c.a.f9914Z
            java.lang.String r2 = ""
            java.lang.Object r1 = r3.fold(r2, r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 93
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
