package p401x;

/* renamed from: x.g */
/* loaded from: classes.dex */
public class C6899g extends p401x.C6898f {

    /* renamed from: m */
    public int f26840m;

    public C6899g(p401x.AbstractC6908p r1) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r1 instanceof p401x.C6904l
            if (r1 == 0) goto La
            x.f$a r1 = p401x.C6898f.a.f26832Z
            goto Lc
        La:
            x.f$a r1 = p401x.C6898f.a.f26833a0
        Lc:
            r0.f26823e = r1
            return
    }

    @Override // p401x.C6898f
    /* renamed from: c */
    public void mo13980c(int r2) {
            r1 = this;
            boolean r0 = r1.f26828j
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f26828j = r0
            r1.f26825g = r2
            java.util.List<x.d> r2 = r1.f26829k
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            x.d r0 = (p401x.InterfaceC6896d) r0
            r0.mo13964a(r0)
            goto L10
        L20:
            return
    }
}
