package p101fh;

/* renamed from: fh.h */
/* loaded from: classes.dex */
public final class C2176h extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<p101fh.InterfaceC2175g, p101fh.InterfaceC2175g.a, p101fh.InterfaceC2175g> {

    /* renamed from: Z */
    public static final p101fh.C2176h f9917Z = null;

    static {
            fh.h r0 = new fh.h
            r0.<init>()
            p101fh.C2176h.f9917Z = r0
            return
    }

    public C2176h() {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public p101fh.InterfaceC2175g mo122l(p101fh.InterfaceC2175g r4, p101fh.InterfaceC2175g.a r5) {
            r3 = this;
            fh.g r4 = (p101fh.InterfaceC2175g) r4
            fh.g$a r5 = (p101fh.InterfaceC2175g.a) r5
            java.lang.String r0 = "acc"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "element"
            p214m2.C4339q.m9706k(r5, r0)
            fh.g$b r0 = r5.getKey()
            fh.g r4 = r4.minusKey(r0)
            fh.i r0 = p101fh.C2177i.f9918Y
            if (r4 != r0) goto L1b
            goto L46
        L1b:
            int r1 = p101fh.InterfaceC2173e.f9915a
            fh.e$a r1 = p101fh.InterfaceC2173e.a.f9916Y
            fh.g$a r2 = r4.get(r1)
            fh.e r2 = (p101fh.InterfaceC2173e) r2
            if (r2 != 0) goto L2e
            fh.c r0 = new fh.c
            r0.<init>(r4, r5)
        L2c:
            r5 = r0
            goto L46
        L2e:
            fh.g r4 = r4.minusKey(r1)
            if (r4 != r0) goto L3b
            fh.c r4 = new fh.c
            r4.<init>(r5, r2)
            r5 = r4
            goto L46
        L3b:
            fh.c r0 = new fh.c
            fh.c r1 = new fh.c
            r1.<init>(r4, r5)
            r0.<init>(r1, r2)
            goto L2c
        L46:
            return r5
    }
}
