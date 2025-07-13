package p101fh;

/* renamed from: fh.g */
/* loaded from: classes.dex */
public interface InterfaceC2175g {

    /* renamed from: fh.g$a */
    public interface a extends p101fh.InterfaceC2175g {

        /* renamed from: fh.g$a$a, reason: collision with other inner class name */
        public static final class C7391a {
            /* renamed from: a */
            public static <R> R m5737a(p101fh.InterfaceC2175g.a r1, R r2, mh.InterfaceC4624p<? super R, ? super p101fh.InterfaceC2175g.a, ? extends R> r3) {
                    java.lang.String r0 = "operation"
                    p214m2.C4339q.m9706k(r3, r0)
                    java.lang.Object r1 = r3.mo122l(r2, r1)
                    return r1
            }

            /* renamed from: b */
            public static <E extends p101fh.InterfaceC2175g.a> E m5738b(p101fh.InterfaceC2175g.a r1, p101fh.InterfaceC2175g.b<E> r2) {
                    java.lang.String r0 = "key"
                    p214m2.C4339q.m9706k(r2, r0)
                    fh.g$b r0 = r1.getKey()
                    boolean r2 = p214m2.C4339q.m9702c(r0, r2)
                    if (r2 == 0) goto L10
                    goto L11
                L10:
                    r1 = 0
                L11:
                    return r1
            }

            /* renamed from: c */
            public static p101fh.InterfaceC2175g m5739c(p101fh.InterfaceC2175g.a r1, p101fh.InterfaceC2175g.b<?> r2) {
                    java.lang.String r0 = "key"
                    p214m2.C4339q.m9706k(r2, r0)
                    fh.g$b r0 = r1.getKey()
                    boolean r2 = p214m2.C4339q.m9702c(r0, r2)
                    if (r2 == 0) goto L11
                    fh.i r1 = p101fh.C2177i.f9918Y
                L11:
                    return r1
            }

            /* renamed from: d */
            public static p101fh.InterfaceC2175g m5740d(p101fh.InterfaceC2175g.a r1, p101fh.InterfaceC2175g r2) {
                    java.lang.String r0 = "context"
                    p214m2.C4339q.m9706k(r2, r0)
                    fh.i r0 = p101fh.C2177i.f9918Y
                    if (r2 != r0) goto La
                    goto L12
                La:
                    fh.h r0 = p101fh.C2176h.f9917Z
                    java.lang.Object r1 = r2.fold(r1, r0)
                    fh.g r1 = (p101fh.InterfaceC2175g) r1
                L12:
                    return r1
            }
        }

        @Override // p101fh.InterfaceC2175g
        <E extends p101fh.InterfaceC2175g.a> E get(p101fh.InterfaceC2175g.b<E> r1);

        p101fh.InterfaceC2175g.b<?> getKey();
    }

    /* renamed from: fh.g$b */
    public interface b<E extends p101fh.InterfaceC2175g.a> {
    }

    <R> R fold(R r1, mh.InterfaceC4624p<? super R, ? super p101fh.InterfaceC2175g.a, ? extends R> r2);

    <E extends p101fh.InterfaceC2175g.a> E get(p101fh.InterfaceC2175g.b<E> r1);

    p101fh.InterfaceC2175g minusKey(p101fh.InterfaceC2175g.b<?> r1);

    p101fh.InterfaceC2175g plus(p101fh.InterfaceC2175g r1);
}
