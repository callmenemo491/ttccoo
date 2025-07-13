package p238nd;

/* renamed from: nd.m0 */
/* loaded from: classes.dex */
public final class C4761m0 extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<id.C3131b, java.util.List<? extends id.C3131b>, ch.C0978e<? extends id.C3131b, ? extends java.lang.Boolean>> {

    /* renamed from: Z */
    public static final p238nd.C4761m0 f19074Z = null;

    static {
            nd.m0 r0 = new nd.m0
            r0.<init>()
            p238nd.C4761m0.f19074Z = r0
            return
    }

    public C4761m0() {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public ch.C0978e<? extends id.C3131b, ? extends java.lang.Boolean> mo122l(id.C3131b r2, java.util.List<? extends id.C3131b> r3) {
            r1 = this;
            id.b r2 = (id.C3131b) r2
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L16
            int r3 = r3.size()
            r0 = 1
            if (r3 > r0) goto Le
            goto L16
        Le:
            ch.e r3 = new ch.e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.<init>(r2, r0)
            goto L1d
        L16:
            ch.e r3 = new ch.e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.<init>(r2, r0)
        L1d:
            return r3
    }
}
