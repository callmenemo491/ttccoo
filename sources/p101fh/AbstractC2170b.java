package p101fh;

import p101fh.InterfaceC2175g.a;

/* renamed from: fh.b */
/* loaded from: classes.dex */
public abstract class AbstractC2170b<B extends p101fh.InterfaceC2175g.a, E extends B> implements p101fh.InterfaceC2175g.b<E> {

    /* renamed from: Y */
    public final mh.InterfaceC4620l<p101fh.InterfaceC2175g.a, E> f9910Y;

    /* renamed from: Z */
    public final p101fh.InterfaceC2175g.b<?> f9911Z;

    public AbstractC2170b(p101fh.InterfaceC2175g.b<B> r2, mh.InterfaceC4620l<? super p101fh.InterfaceC2175g.a, ? extends E> r3) {
            r1 = this;
            java.lang.String r0 = "baseKey"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f9910Y = r3
            boolean r3 = r2 instanceof p101fh.AbstractC2170b
            if (r3 == 0) goto L12
            fh.b r2 = (p101fh.AbstractC2170b) r2
            fh.g$b<?> r2 = r2.f9911Z
        L12:
            r1.f9911Z = r2
            return
    }
}
