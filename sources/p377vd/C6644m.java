package p377vd;

/* renamed from: vd.m */
/* loaded from: classes.dex */
public final class C6644m<T> implements p105g2.C2222p.b {

    /* renamed from: a */
    public final /* synthetic */ p101fh.InterfaceC2172d<ch.C0978e<? extends java.util.List<md.C4553g>, java.lang.Long>> f25833a;

    /* renamed from: b */
    public final /* synthetic */ long f25834b;

    public C6644m(p101fh.InterfaceC2172d<? super ch.C0978e<? extends java.util.List<md.C4553g>, java.lang.Long>> r1, long r2) {
            r0 = this;
            r0.f25833a = r1
            r0.f25834b = r2
            r0.<init>()
            return
    }

    @Override // p105g2.C2222p.b
    /* renamed from: a */
    public void mo117a(java.lang.Object r5) {
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "response"
            jb.j r0 = p238nd.C4754k.m10827a(r5, r0)
            vd.l r1 = new vd.l
            r1.<init>()
            java.lang.reflect.Type r1 = r1.f21382b
            java.lang.Object r5 = r0.m7929c(r5, r1)
            md.j r5 = (md.C4559j) r5
            java.util.List r5 = r5.getRows()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L22:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r5.next()
            r2 = r1
            md.g r2 = (md.C4553g) r2
            int r2 = r2.getVerified()
            r3 = 1
            if (r2 != r3) goto L37
            goto L38
        L37:
            r3 = 0
        L38:
            if (r3 == 0) goto L22
            r0.add(r1)
            goto L22
        L3e:
            fh.d<ch.e<? extends java.util.List<md.g>, java.lang.Long>> r5 = r4.f25833a
            long r1 = r4.f25834b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            ch.e r2 = new ch.e
            r2.<init>(r0, r1)
            r5.mo5707k(r2)
            return
    }
}
